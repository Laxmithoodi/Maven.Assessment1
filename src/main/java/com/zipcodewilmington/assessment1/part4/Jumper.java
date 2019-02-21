package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {


        double r = (double)k/j;
        double count = Math.ceil(r);



        return (int)count;
    }
}



