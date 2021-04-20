import java.io.*;
import java.util.*;

public class ArrayListOperations
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> arl = new ArrayList<>();
        int choice=0, position;
        String element;
        arl.add("alpha");
        arl.add("beta");
        arl.add("gamma");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Array List Operations");
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
                    arl.add(position-1,element);
                    break;
                case 2:
                    System.out.println("Enter element");
                    element = br.readLine();
                    arl.remove(element);
                    break;
                case 3:
                    System.out.println("Array List");
                    System.out.println(arl);
                    break;
                case 4:
                    System.out.println("Enter element");
                    element = br.readLine();
                    int pos = arl.indexOf(element);
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
