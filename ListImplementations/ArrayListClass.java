/*ArrayList
Backing: dynamically-resized array
Strength: fast random access (get(i) is O(1))*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class ArrayListClass {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        
        //add
        al.add("Apple");
        al.add("Banana");
        al.add(1,"Cherry");
        System.out.println("add : "+al);
        
        //Access
        String first = al.get(0);
        System.out.println("access : "+first);
        
        //size
        int size = al.size();
        System.out.println("Size : "+size);
        
        //check & remove
        boolean hasBanana = al.contains("Banana");
        System.out.println("contains : "+hasBanana);
        al.remove("Banana");
        System.out.println("remove banana : "+al);
        al.remove(0);
        System.out.println("remove index 0 : "+al);
        
        al.add("A");
        al.add("Z");
        al.add("C");
        al.add("X");

        System.out.println("ArrayList Values : ");
        for(String s:al){
            System.out.println(s);
        }
        
        Collections.sort(al);
        System.out.println("sort : "+al);
        Collections.reverse(al);
        System.out.println("reverse : "+al);
    }
}