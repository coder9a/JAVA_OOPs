import java.util.*;
public class CreatingVector
{
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<>();
        int x[] = {12,23,34,45,56,67};
//        Adding elements to the vector
        for(int i=0;i<x.length;i++)
        {
            v.add(x[i]);
        }
//        Displaying the elements of the vector
        for (int i=0;i< v.size();i++)
        {
            System.out.print(v.get(i)+" ");
        }
//        Retrieving elements using list iterator
        System.out.println("Elements using list iterator");
        ListIterator lit = v.listIterator();
        while (lit.hasNext())
            System.out.print(lit.next()+" ");
        System.out.println("\nIn backward direction");
        while (lit.hasPrevious())
            System.out.print(lit.previous()+" ");

    }
}
