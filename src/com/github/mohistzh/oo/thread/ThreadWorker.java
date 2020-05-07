package com.github.mohistzh.oo.thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author Jonathan
 * @Date 2020/5/7
 **/
public class ThreadWorker extends Thread {
    private final LinkedBlockingQueue<Runnable> taskQueue;
    public ThreadWorker(LinkedBlockingQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    public void run() {
        Runnable task;
        while (true) {
            synchronized (taskQueue) {
                while (taskQueue.isEmpty()) {
                    try {
                        taskQueue.wait();
                    } catch (InterruptedException e) {
                        System.out.println("An error occurred while task queue is waiting: " + e.getMessage());
                    }

                }
                task = taskQueue.poll();
            }
            try {
                task.run();
            } catch (RuntimeException e) {
                System.out.println("Thread pool is interrupted due to the runtime exception: " + e.getMessage());
            }
        }
    }
}
