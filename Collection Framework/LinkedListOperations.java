import java.io.*;
import java.util.*;

public class LinkedListOperations
{
    public static void main(String[] args) throws IOException
    {
        LinkedList<String> ll = new LinkedList<>();
        int choice=0, position;
        String element;
        ll.add("alpha");
        ll.add("beta");
        ll.add("gamma");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Linked List Operations");
            System.out.println("1. Insert\n2. Delete\n3. Display\n4. Search\n5. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(br.readLine());
            switch (choice)
            {
                case 1:
                    System.out.println("Enter element to Insert");
                    element = br.readLine();
                    System.out.println("Enter position");
                    position = Integer.parseInt(br.readLine());
                    ll.add(position-1,element);
                    break;
                case 2:
                    System.out.println("Enter position");
                    position = Integer.parseInt(br.readLine());
                    ll.remove(position);
                    break;
                case 3:
                    System.out.println("Linked List");
                    System.out.println(ll);
                    break;
                case 4:
                    System.out.println("Enter element");
                    element = br.readLine();
                    int pos = ll.indexOf(element);
                    if(pos == -1)
                        System.out.println("Element not found");
                    else
                        System.out.println("Element found at position "+(pos+1));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice! Enter again");
            }
        }
    }
}
