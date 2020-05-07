package com.github.mohistzh.oo.thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Writing a own thread pool
 * @Author Jonathan
 * @Date 2020/5/7
 **/
public class ThreadPool {
    private final int threadNumber;
    private final LinkedBlockingQueue<Runnable> taskQueue;
    private final ThreadWorker[] threads;

    /**
     * For simplify the threadNumber parameter is a core threads number
     * @param threadNumber
     */
    public ThreadPool(int threadNumber) {
        this.threadNumber = threadNumber;
        taskQueue = new LinkedBlockingQueue();
        threads = new ThreadWorker[threadNumber];
        for (int i = 0; i < threadNumber; i++) {
            threads[i] = new ThreadWorker(taskQueue);
            threads[i].start();
        }
    }

    public void execute(Runnable task) {
        synchronized (taskQueue) {
            taskQueue.add(task);
            taskQueue.notify();
        }
    }
}
