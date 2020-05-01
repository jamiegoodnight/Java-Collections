package collections;

import java.util.*;

// ^ All of the different utilities for Java. We want to use Arrays.

public class Main {

    public static void main(String[] args)
    {
        // Fixed ele type
        // Fixed index
        // Fixed length
        // 0 -> ele 1
        // 1 -> ele 2
        System.out.println("*** Arrays ***");
        // Dogs dogArr[];
        // dogArr = new Dogs[5]; // 0 - 4
        Dogs[] dogArr = new Dogs[5];
        dogArr[0] = new Dogs("Springer", 50, false);
        dogArr[1] = new Dogs("Bulldog", 40, true);
        dogArr[2] = new Dogs("Collie", 50, false);
        dogArr[3] = new Dogs("Chihuahua", 15, true);
        dogArr[4] = new Dogs("Corgi", 35, true);
        for (int i = 0; i < dogArr.length; i++)
        {
            System.out.println(dogArr[i]);
        }

        System.out.println(Arrays.toString(dogArr));
        

        // Fixed ele type
        // Fixed index
        // Dynamic length
        System.out.println("*** ArrayList ***");

        // Choice in index
        // fixed ele type
        // Dynamic length
        System.out.println("*** HashMaps ***");

    }
}