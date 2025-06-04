import java.util.LinkedList;
import java.util.Queue;
public class Main{
    public static void main(String[] args){
        Queue<Integer>q = new LinkedList<>();
        //Enqueue elements
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Queue:"+q);
        //Dequeue element
        System.out.println("Dequeued:"+q.poll());
        //Peek Front element
        System.out.println("Front:"+q.peek());
        System.out.println("Queue after operations:"+q);
    
    }
}
