package com.prottone.fizzbuzz.funk;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;


public class FibonacciIteratorTest {

    @Test
    public void shouldOutputFiboonacciSeq() {
        // given
        int maxLength = 13;
        Iterator<Integer> fibIter = new FibonacciIterator();

        // when
        int[] result = new int[maxLength];
        for(int i = 0; i < maxLength; i++) {
            result[i] = fibIter.next();
        }

        // then
        int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        Assert.assertArrayEquals(result, expected);
    }

}