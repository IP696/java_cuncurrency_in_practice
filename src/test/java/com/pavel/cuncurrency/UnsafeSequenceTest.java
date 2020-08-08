package com.pavel.cuncurrency;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UnsafeSequenceTest {

    private UnsafeSequence sequence;

    @Before
    public void setUp() {
        sequence = new UnsafeSequence();
    }

    @Test
    public void unsafeSequenceShouldBeCreated() {
        assertNotNull(sequence);
    }

    @Test
    public void unsafeSequenceShouldReturn0() {
        assertEquals(0, sequence.getNext());
    }

    @Test
    public void unsafeSequenceShouldReturn0And1() {
        assertEquals(0, sequence.getNext());
        assertEquals(1, sequence.getNext());
    }
}
