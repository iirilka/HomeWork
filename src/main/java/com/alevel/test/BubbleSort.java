package com.alevel.test;

public class BubbleSort {
    public int[] Sorted(int[]array) {

        for (int i = 1; i < array.length; i++)
                for (int in = 0; in < array.length-1; in++) {

                if (array[in] > array[in + 1])
                    toSwap(in, in + 1,array);

            }
    return array;
    }


    private void toSwap(int first, int second,int []array){

        int dummy = array[first];
        array[first] = array[second];
        array [second] = dummy;
    }

}

