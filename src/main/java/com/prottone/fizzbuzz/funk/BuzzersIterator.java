package com.prottone.fizzbuzz.funk;

import com.prottone.fizzbuzz.Buzzer;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BuzzersIterator implements Iterator<String> {
    private List<Buzzer> buzzers;
    private Iterator<Integer> intIter;

    public BuzzersIterator(final Buzzer... buzzers){
        this.buzzers = Arrays.asList(buzzers);
        intIter = new IntegersIterator();
    }

    public boolean hasNext() {
        return intIter.hasNext();
    }

    public String next() {
        int index = intIter.next();

        return buzzers.stream()
                .map(buzzer -> buzzer.execute(index))
                .reduce((e1, e2) -> e1 += e2)
                .filter(s -> s.length() > 0)
                .orElse(String.valueOf(index));
    }
}
