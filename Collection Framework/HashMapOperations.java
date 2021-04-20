import java.io.*;
import java.util.*;
public class HashMapOperations
{
    public static void main(String[] args) throws IOException
    {
        HashMap<String, Long> hm = new HashMap<>();
        int choice=0;
        String name;
        long phno;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Hash Map Operations");
            System.out.println("1. Enter Phone number\n" +
                    "2. Lookup in the book\n" +
                    "3. Display names in book\n" +
                    "4. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(br.readLine());
            switch (choice)
            {
                case 1:
                    System.out.println("Enter name");
                    name = br.readLine();
                    System.out.println("Enter phone number");
                    phno = Integer.parseInt(br.readLine());
                    hm.put(name,phno);
                    break;
                case 2:
                    System.out.println("Enter name");
                    name = br.readLine();
                    name = name.trim();
                    phno = hm.get(name);
                    System.out.println(phno);
                    break;
                case 3:
                    Set<String> set = new HashSet<String>();
                    set = hm.keySet();
                    System.out.println(set);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice! Enter again");
            }
        }
    }
}
