package com.github.mohistzh.oo.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * The underlying thread worker in our ThreadPool which does the polling and execution.
 *
 * @Author Jonathan
 * @Date 2020/5/7
 **/
public class ThreadWorker extends Thread {
    /**
     * a switcher to turn on/off the thread
     */
    private AtomicBoolean executable;
    /**
     * a unbounded blocking queue which for storing task(Runnable)
     */
    private final LinkedBlockingQueue<Runnable> taskQueue;

    /**
     * initialize thread worker
     * @param threadName
     * @param execute
     * @param taskQueue
     */
    public ThreadWorker(String threadName, AtomicBoolean execute, LinkedBlockingQueue taskQueue) {
        super(threadName);
        this.executable = execute;
        this.taskQueue = taskQueue;
    }

    public void run() {
        try {
            /**
             *  When the executable flag is true, or there are any task in the queue
             */
            while (this.executable.get() || !taskQueue.isEmpty()) {
                Runnable task;
                /**
                 * Polling a task from the queue then execute it.
                 */
                while ((task = taskQueue.poll()) != null) {
                    task.run();
                }
                /**
                 * Thread.sleep(1) helps to prevent hogging the CPU in case there wasn't any task in the queue.
                 */
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
