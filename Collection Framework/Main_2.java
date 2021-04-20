import java.util.*;

// HashSet and Iterator
public class Main_2
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<>();
        hs.add("alpha");
        hs.add("Beta");
        hs.add("Gamma");
        hs.add("Delta");
//        View the hashset
        System.out.println("HashSet = "+hs);
//        add iterator to the hs
        Iterator it = hs.iterator();
        System.out.println("Element using Iterator");
        System.out.println(it.hasNext());
        System.out.println((it.next()).getClass().getName());
        System.out.println((String)it.toString());
        System.out.println((String)it.next());
        System.out.println((String)it.next());
        System.out.println((String)it.next());
        System.out.println((String)it.next());
        while (it.hasNext())
        {
            String s = (String)it.next();
//            System.out.println(s);
        }
    }
}
