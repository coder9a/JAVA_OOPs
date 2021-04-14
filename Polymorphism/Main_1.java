class Sample
{
    void add(int a, int b)
    {
        System.out.println("Sum is = "+(a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("Sum is = "+(a+b+c));
    }
}
public class Main_1
{
    public static void main(String[] args)
    {
        Sample s = new Sample();
        s.add(12,23);
        s.add(12,23,34);
    }
}
