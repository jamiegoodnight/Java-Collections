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
        // Object -> Collection -> List -> ArrayList
        ArrayList<Dogs> dogsArrayList = new ArrayList<Dogs>();
        dogsArrayList.addAll(Arrays.asList(dogArr));

        dogsArrayList.add(new Dogs("Mutt", 15, true));

        for (Dogs d : dogsArrayList)
        {
            System.out.println(d);
        }
        
        System.out.println("*** / ***");

        for (Dogs d : dogsArrayList)
        {
            if (d.getAvgWeight() >= 50)
            {
                System.out.println(d.getBreed() + "are large");
            }
            else 
            {
                System.out.println(d.getBreed() + "are small");
            }
        }

        if (dogsArrayList.get(2).getBreed().equals("Turtle"))
        {
            System.out.println("Equals");
        }
        else 
        {
            System.out.println("Not a turt");
        }

        System.out.println("*** / ***");

        // adding elements
        // 2 represents dogsArrayList[2]
        dogsArrayList.add(2, new Dogs("Labrador", 75, false));
        dogsArrayList.forEach(d -> System.out.println(d));
        System.out.println("*** / ***");
        dogsArrayList.set(2, new Dogs("Poodle", 50, false));
        dogsArrayList.forEach(d -> System.out.println(d));
        System.out.println("*** / ***");
        System.out.println("Size" + " " + dogsArrayList.size());
        dogsArrayList.remove(3);
        System.out.println(dogsArrayList.get(3));


        // Choice in index
        // fixed ele type
        // Dynamic length

        // Keys are unique references to elements in hashmap
        // Values are what we find by using the key
        System.out.println("*** HashMaps ***");
        // Every base data type has an associated class
        HashMap<Integer, Dogs> dogsHashMap = new HashMap<Integer, Dogs>();

        int hashcount = 0;
        for (Dogs d : dogsArrayList)
        {   
            // put = if the key doesn't exist, add it to hashmap
            // if key does exist, it replaces it instead
            dogsHashMap.put(hashcount, d);
            hashcount++;
        }
        // How to clear ArrayList and free memory
        dogsArrayList.clear();
        // Get the dog with the key of 3—we don't know which dog
        System.out.println(dogsHashMap.get(3));
        System.out.print(dogsHashMap.size());
        dogsHashMap.remove(3);
        System.out.println(dogsHashMap.get(3));

        for (Integer i : dogsHashMap.keySet())
        {
            System.out.println("key: " + i + " value: " + dogsHashMap.get(i));
        }
        System.out.println("*** / ***");

        // Sorted HashMap
        ArrayList<HashMap.Entry<Integer, Dogs>> sortedMap = new ArrayList<HashMap.Entry<Integer, Dogs>>();
        sortedMap.addAll(dogsHashMap.entrySet());
        
        Collections.sort(sortedMap, new Comparator<HashMap.Entry<Integer, Dogs>>()
            {
                public int compare(HashMap.Entry<Integer, Dogs> o1, HashMap.Entry<Integer, Dogs> o2)
                {
                    return o1.getValue().getBreed().compareToIgnoreCase(o2.getValue().getBreed());
                    //return o2.getValue().getAvgWeight() - o1.getValue().getAvgWeight();
                }
            });

            for (HashMap.Entry<Integer, Dogs> d : sortedMap)
            {
                System.out.println("key: " + d.getKey() + " value: " + d.getValue());
            }
            System.out.print("*** / ***");
    }
}