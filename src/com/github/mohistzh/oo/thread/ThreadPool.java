package com.github.mohistzh.oo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Writing a own thread pool
 * @Author Jonathan
 * @Date 2020/5/7
 **/
public class ThreadPool {
    /**
     * Counter of threadpools creation
     */
    private static AtomicInteger poolCounter = new AtomicInteger(0);
    /**
     * Unbounded blocking queue to store tasks
     */
    private LinkedBlockingQueue<Runnable> taskQueue;
    /**
     * Flag to control the ThreadWorker objects
     */
    private AtomicBoolean executable;
    /**
     * Holds the pool of workers
     */
    private List<ThreadWorker> threads;

    /**
     * Private constructor to control the creation of threadpools. Increases the poolcount whenever a new pool is created.
     * @param threadCount
     */
    private ThreadPool(int threadCount) {
        this.poolCounter.getAndIncrement();
        this.taskQueue = new LinkedBlockingQueue<>();
        this.executable = new AtomicBoolean(true);
        this.threads = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            ThreadWorker worker = new ThreadWorker("ThreadWorker #" + poolCounter.get()+" Thread" + i,
                    this.executable, this.taskQueue);
            worker.start();
            this.threads.add(worker);
        }

    }

    /**
     * Gets a new ThreadPool instance with number of threads equal to the number of processors available.
     * @return
     */
    public static ThreadPool getInstance() {
        return getInstance(Runtime.getRuntime().availableProcessors());
    }

    /**
     * Gets a new ThreadPool instance with the number of threads specified.
     * @param threadCount Threads to add to the pool
     * @return
     */
    public static ThreadPool getInstance(int threadCount) {
        return new ThreadPool(threadCount);
    }

    /**
     * Add a task to the queue for processing
     * @param task Runnable object
     */
    public void execute(Runnable task) {
        if (this.executable.get()) {
            taskQueue.add(task);
        } else {
            throw new IllegalArgumentException("ThreadPool terminating, unable to execute task.");
        }
    }

    /**
     * Clears the queue of tasks and stop the threadpool.
     * Any tasks currently executing will continue to execute.
     */
    public void terminate() {
        taskQueue.clear();
        stop();
    }

    /**
     * Stops addition of new task to the threadpool and terminates the pool once all tasks in the queue are executed.
     */
    public void stop() {
        executable.set(false);
    }
}
