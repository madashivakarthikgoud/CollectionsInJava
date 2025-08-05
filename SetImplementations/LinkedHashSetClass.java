/*
No duplicates
Maintains insertion order
Backed by hash table + linked list
*/

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<>();

        //add
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red");
        System.out.println("LinkedHashSet: "+set);

        //iterate
        System.out.println("iterating set elements");
        for(String color : set){
            System.out.println(color);
        }

        //remove
        set.remove("Red");
        System.out.println("after rm red : "+set);

        //clear all
        set.clear();
        System.out.println("cleared : "+set);
    }
}
