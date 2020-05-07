package com.github.mohistzh.oo.thread;

/**
 * @Author Jonathan
 * @Date 2020/5/7
 **/
public class Task implements Runnable {
    private int taskNumber;
    public Task(int taskNumber) {
        this.taskNumber = taskNumber;
    }
    @Override
    public void run() {
        System.out.println("Task " + taskNumber + " is running.");
    }
}
