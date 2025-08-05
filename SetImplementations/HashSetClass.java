/*
No duplicates
Unordered
Backed by a hash table
Fastest for add/remove/search (O(1) average) 
*/

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        //Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");
        System.out.println("set elements : "+set);

        //remove
        set.remove("Banana");
        System.out.println("After rm banana : "+set);

        //Iterate
        System.out.println("Iterating set");
        for(String f : set){
            System.out.println(f);
        }
    }
}
