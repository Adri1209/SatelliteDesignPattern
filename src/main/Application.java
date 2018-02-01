package main;

import random.MersenneTwisterFast;

public class Application {

    public static void main(String [] args){

        MersenneTwisterFast random = new MersenneTwisterFast();
        System.out.println(random.nextDouble());
    }
}
