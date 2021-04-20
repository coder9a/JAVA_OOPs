import java.io.*;
import java.util.*;

public class ArrayClass
{
    public static void main(String[] args) throws IOException
    {
        int [] arr = new int[5];
        int choice=0, position, element;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Array Size is 5");
        while(true)
        {
            System.out.println("Array Operations");
            System.out.println("1. Insert\n2. Sort\n3. Display\n4. Search\n5. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(br.readLine());
            switch (choice)
            {
                case 1:
                    System.out.println("Enter element to Insert");
                    element = Integer.parseInt(br.readLine());
                    System.out.println("Enter position(between 1 to 5)");
                    position = Integer.parseInt(br.readLine());
                    arr[position-1] = element;
                    break;
                case 2:
                    Arrays.sort(arr);
//                    System.out.println("Enter element");
//                    element = Integer.parseInt(br.readLine());
//                    System.out.println("Enter position(between 1 to 5)");
//                    position = Integer.parseInt(br.readLine());
//                    arr[position-1] = Integer.parseInt(null);
                    break;
                case 3:
                    System.out.println("Array is");
                    for(int i=0;i< arr.length;i++)
                        if(arr[i]!=0)
                            System.out.print(arr[i]+" ");
                    break;
                case 4:
                    System.out.println("Enter element");
                    element = Integer.parseInt(br.readLine());
                    int val = Arrays.binarySearch(arr,element);
                    if(val == -1)
                        System.out.println("Element not found");
                    else
                        System.out.println("Element found at position "+(val+1));
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
