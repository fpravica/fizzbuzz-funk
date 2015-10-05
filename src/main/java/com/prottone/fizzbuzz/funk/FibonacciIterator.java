package com.prottone.fizzbuzz.funk;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
    private int n1 = 0;
    private int n2 = 1;

    @Override
    public final boolean hasNext() {
        return n2 < (Integer.MAX_VALUE - n1);
    }

    @Override
    public final Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int current = n1;
        n1 = n2;
        n2 += current;
        return current;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
