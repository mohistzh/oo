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

    public ThreadPool(int threadNumber) {
        this.threadNumber = threadNumber;
        taskQueue = new LinkedBlockingQueue();
    }
}
