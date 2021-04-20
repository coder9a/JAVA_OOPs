import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Stack Operations
public class Main_3
{
    public static void main(String[] args) throws IOException
    {
        Stack<Integer> st = new Stack<>();
        int choice=0, position,element;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Stack Operations");
            System.out.println("1. PUSH\n2. POP\n3. PEEK\n4. Dsiplay\n5. Search\n6. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(br.readLine());
            switch (choice)
            {
                case 1:
                    System.out.println("Enter element");
                    element = Integer.parseInt(br.readLine());
                    st.push(element);
                    break;
                case 2:
//                    Top most integer object is popped out
                    Integer obj = st.pop();
                    System.out.println("Popped = "+obj);
                    break;
                case 3:
                    System.out.println("Top-most element of stack "+st.peek());
                    break;
                case 4:
                    System.out.println("All elements of stack");
                    System.out.println(st);
                    break;
                case 5:
                    System.out.println("Enter element to be searched");
                    element = Integer.parseInt(br.readLine());
                    position = st.search(element);
                    if (position==-1)
                        System.out.println("Element not found");
                    else
                        System.out.println("Found at position "+ position);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice, Enter again");
            }
        }
    }
}
