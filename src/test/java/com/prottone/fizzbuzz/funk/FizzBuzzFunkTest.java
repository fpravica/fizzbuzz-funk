package com.prottone.fizzbuzz.funk;


import com.prottone.fizzbuzz.Buzzer;
import com.prottone.fizzbuzz.custom.BuzzersAll;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static com.prottone.fizzbuzz.funk.FizzBuzzFunk.buzzWith;
import static com.prottone.fizzbuzz.funk.FizzBuzzFunk.runFor;


public class FizzBuzzFunkTest {

    @Test
    public void should() {
        // given
        Buzzer fizz = FizzBuzzFunk::fizz;
        Buzzer buzz = FizzBuzzFunk::buzz;

        // when
        List<String> results = runFor(15, buzzWith(fizz, buzz));

        // then
        Assert.assertNotNull(results);
        System.out.println(results);
        Assert.assertEquals("1", results.get(0));
        Assert.assertEquals("2", results.get(1));
        Assert.assertEquals("Fizz", results.get(2));
        Assert.assertEquals("4", results.get(3));
        Assert.assertEquals("Buzz", results.get(4));
        Assert.assertEquals("Fizz", results.get(5));
        Assert.assertEquals("8", results.get(7));
        Assert.assertEquals("Fizz", results.get(8));
        Assert.assertEquals("Buzz", results.get(9));
        Assert.assertEquals("11", results.get(10));
        Assert.assertEquals("Fizz", results.get(11));
        Assert.assertEquals("FizzBuzz", results.get(14));
    }

    @Test
    public void shouldExecuteFIZZ_BUZZ_WOOF_FOO_BAR() throws IOException {
        // given
        int maxIndex = 112;

        // when
        List<String> results = runFor(maxIndex, buzzWith(BuzzersAll.FIZZ, BuzzersAll.BUZZ, BuzzersAll.WOOF, BuzzersAll.FOO, BuzzersAll.BAR));

        // then
        System.out.println(results);

        Assert.assertEquals("1", results.get(0));
        Assert.assertEquals("Bar", results.get(1));
        Assert.assertEquals("Fizz", results.get(2));
        Assert.assertEquals("Buzz", results.get(4));
        Assert.assertEquals("Woof", results.get(6));
        Assert.assertEquals("Bar", results.get(7));
        Assert.assertEquals("Buzz", results.get(9));
        Assert.assertEquals("Foo", results.get(10));
        Assert.assertEquals("FizzBuzz", results.get(14));
        Assert.assertEquals("Bar", results.get(15));
        Assert.assertEquals("Bar", results.get(63));
        Assert.assertEquals("Foo", results.get(87));
        Assert.assertEquals("FizzBuzzWoof", results.get(104));
        Assert.assertEquals("FizzFoo", results.get(110));
    }

}