package com.pavel.cuncurrency;

import com.pavel.cuncurrency.example.SynchronizedSequence;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SynchronizedSequenceTest {

    private SynchronizedSequence sequence;

    @Before
    public void setUp() {
        sequence = new SynchronizedSequence();
    }

    @Test
    public void synchronizedSequenceShouldBeCreated() {
        assertNotNull(sequence);
    }

    @Test
    public void synchronizedSequenceShouldReturn0() {
        assertEquals(0, sequence.getNext());
    }

    @Test
    public void synchronizedSequenceShouldReturn0And1() {
        assertEquals(0, sequence.getNext());
        assertEquals(1, sequence.getNext());
    }
}
