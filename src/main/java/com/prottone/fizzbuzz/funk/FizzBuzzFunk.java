package com.prottone.fizzbuzz.funk;

import com.prottone.fizzbuzz.Buzzer;
import com.prottone.fizzbuzz.Buzzers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzFunk {

    public static List<String> runFor(int maxLength, Iterable<String> seq) {
        List<String> results = new ArrayList<>();
        Iterator<String> iterator = seq.iterator();

        IntStream.range(0, maxLength)
                .forEach(value -> results.add(iterator.next()));

        return results;
    }

    public static Iterable<String> buzzWith(final Buzzer... buzzers) {
        return  () -> new BuzzersIterator(buzzers);
    }


    public static String fizz(int index) {
        return Buzzers.FIZZ.execute(index);
    }

    public static String buzz(int index) {
        return Buzzers.BUZZ.execute(index);
    }
}
