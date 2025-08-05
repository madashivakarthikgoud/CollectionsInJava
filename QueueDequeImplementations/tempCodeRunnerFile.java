import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args){
        PriorityQueue<Integer>  pq = new PriorityQueue<>((a,b)->a-b);
        
        //add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Queue: "+pq);

        // Peek (head element)
        System.out.println("Peek: " + pq.peek());
        System.out.println("Queue after peek: "+pq);

        System.out.println("Poll: "+pq.poll());
        System.out.println("Queue after poll: "+pq);
    }
}
