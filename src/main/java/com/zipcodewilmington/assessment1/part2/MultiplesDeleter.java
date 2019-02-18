package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {


        int n = ints.length;

        int counter = 0;
        for (int i = 0; i < n; i++)
            if (ints[i] % 2 == 1)
                ints[counter++] = ints[i];
        for (int i = counter; i < n; i++)
            ints[i] = 0;

        Integer[] outputArray = new Integer[counter];
        for (int i = 0; i < counter; i++)
            outputArray[i] = ints[i];


        return outputArray;


        //return null;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        int n = ints.length;

        int counter = 0;
        for (int i = 0; i < n; i++)
            if (ints[i] % 2 == 0)
                ints[counter++] = ints[i];
        for (int i = counter; i < n; i++)
            ints[i] = 0;

        Integer[] outputArray1 = new Integer[counter];
        for (int i = 0; i < counter; i++)
            outputArray1[i] = ints[i];


        return outputArray1;


    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {

        int n = ints.length;

        int counter = 0;
        for (int i = 0; i < n; i++)
            if (ints[i] % 3 !=0)
                ints[counter++] = ints[i];
        for (int i = counter; i < n; i++)
            ints[i] = 0;

        Integer[] outputArray1 = new Integer[counter];
        for (int i = 0; i < counter; i++)
            outputArray1[i] = ints[i];


        return outputArray1;



    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int n = ints.length;

        int counter = 0;
        for (int i = 0; i < n; i++)
            if (ints[i] % multiple !=0)
                ints[counter++] = ints[i];
        for (int i = counter; i < n; i++)
            ints[i] = 0;

        Integer[] outputArray1 = new Integer[counter];
        for (int i = 0; i < counter; i++)
            outputArray1[i] = ints[i];


        return outputArray1;


       // return null;
    }
}
