/*
LinkedList
Backing: doubly-linked nodes
Strength: cheap insertions/removals at head/tail (O(1))*/

import java.util.LinkedList;
import java.util.List;
public class LinkedListClass {
    public static void main(String[] args){
        List<Integer> ll = new LinkedList<>();

        //add
        ll.add(10);
        ll.add(20);
        ll.addFirst(5);
        ll.addLast(30);
        System.out.println("add : "+ll);

        //peek & Remove
        int head = ll.getFirst();
        System.out.println("first element : "+head);
        int tail = ll.getLast();
        System.out.println("last element : "+tail);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("removed first and last : "+ll);

        //Access by index (slower:O(n))
        int second = ll.get(1);
        System.out.println("get second : "+second);

        //Iterate
        System.out.println("ll elements");
        for(Integer n : ll){
            System.out.println(n);
        }
    }
}
