import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo
{
    public static void main(String[] args)
    {
//        Creating linkedlist as a queue
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<5;i++)
            q.add(i+1);
        System.out.println("The queue is...");
        while (!q.isEmpty())
            System.out.println(q.poll());
    }
}
