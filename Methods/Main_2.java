class Sample2
{
    static double sum(double x, double y)
    {
        double result = x+y;
        return result;
    }
}
public class Main_2
{
    public static void main(String[] args)
    {
        Sample2 s = new Sample2();
        double x = s.sum(12,23);
        double y = Sample2.sum(23,34);
        System.out.println(x);
        System.out.println(y);
    }
}
