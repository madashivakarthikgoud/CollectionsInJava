/*
ArrayDeque – Double-ended queue
Implements: Deque
Ordering: Maintains insertion order
Nulls: Not allowed
Better than: Stack, LinkedList (for queue/stack operations) 
*/

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements at both ends
        deque.add("Apple");
        deque.addFirst("Banana");
        deque.addLast("Cherry");
        System.out.println("Deque: " + deque);

        // Peek
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // Remove
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removals: " + deque);
    }
}
