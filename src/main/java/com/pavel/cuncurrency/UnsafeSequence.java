package com.pavel.cuncurrency;

@NotThreadSafe
public class UnsafeSequence {

    private int value;

    public int getNext() {
        return value++;
    }
}
