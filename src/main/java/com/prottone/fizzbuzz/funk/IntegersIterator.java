package com.prottone.fizzbuzz.funk;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntegersIterator implements Iterator<Integer> {
    private int nextInt = 1;

    @Override
    public boolean hasNext() {
        return nextInt < Integer.MAX_VALUE;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        nextInt++;
        return nextInt - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
