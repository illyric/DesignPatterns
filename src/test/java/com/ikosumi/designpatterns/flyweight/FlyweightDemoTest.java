package com.ikosumi.designpatterns.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class FlyweightDemoTest {

    @Test
    public void testHashIdentity() {
        Integer firstInt = Integer.valueOf(10);
        Integer secondInt = Integer.valueOf(10);
        Integer thirdInt = Integer.valueOf(8);
        int firstIntHashId = System.identityHashCode(firstInt);
        int secondtIntHashId = System.identityHashCode(secondInt);
        int thirdIntHashId = System.identityHashCode(thirdInt);

        Assert.assertEquals(firstIntHashId, secondtIntHashId);
        Assert.assertNotEquals(firstIntHashId, thirdIntHashId);
    }
}
