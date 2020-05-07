package com.github.mohistzh.oo.thread;

/**
 * @Author Jonathan
 * @Date 2020/5/7
 **/
public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(7);
        for (int i = 0; i < 5; i++) {
            Task task = new Task(i);
            threadPool.execute(task);
        }

    }
}
