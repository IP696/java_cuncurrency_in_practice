package com.pavel.cuncurrency.usage;

import com.pavel.cuncurrency.example.UnsafeSequence;

/*
 * The result will be not permanent
 */
public class UnsafeSequenceUsage {
    public static void main(String[] args) {
        System.out.println("Start...");

        final UnsafeSequence sequence = new UnsafeSequence();

        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    System.out.println(Thread.currentThread().getName() + "-" + sequence.getNext());
                }
            }
        };
        Thread threadOne = new Thread(runnable, "One");
        Thread threadTwo = new Thread(runnable, "Two");

        threadOne.start();
        threadTwo.start();
    }
}
