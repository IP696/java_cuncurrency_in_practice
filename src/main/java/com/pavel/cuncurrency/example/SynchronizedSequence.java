package com.pavel.cuncurrency.example;

import com.pavel.cuncurrency.annotations.GuardedBy;
import com.pavel.cuncurrency.annotations.ThreadSafe;

@ThreadSafe
public class SynchronizedSequence {

    @GuardedBy("this")
    private int value;

    public synchronized int getNext() {
        return value++;
    }
}
