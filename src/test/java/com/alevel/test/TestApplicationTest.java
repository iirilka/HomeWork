package com.alevel.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestApplicationTest {

    int [] negativeArray = {-1,-2,-4,-5,-8,-100,-4, -10, -250, -333};
    int [] positiveArray = {1,2,3,7,100,2094,57,3,8,4};
    int [] nullArray = new int[10];
    private static BubbleSort BubbleSortInstance;
    @Before
    public void before(){
        System.out.println("Before runing...");
        BubbleSortInstance = new BubbleSort();
    }
    @Test
    public void sortTest()
    {
        int[] sortNull = BubbleSortInstance.Sorted(nullArray);
        int[] sortNegative = BubbleSortInstance.Sorted(negativeArray);
        int[] sortPositive = BubbleSortInstance.Sorted((positiveArray));
        assertEquals(nullArray,sortNull);
for(int i=0;i<9;i++)
{
    assertEquals(true, sortNegative[i]<=sortNegative[i+1]);
    assertEquals(true, sortPositive[i]<=sortPositive[i+1]);
    }
}


    }

