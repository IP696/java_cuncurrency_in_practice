package com.pavel.cuncurrency.example;

import com.pavel.cuncurrency.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeSequence {

    private int value;

    public int getNext() {
        return value++;
    }
}
