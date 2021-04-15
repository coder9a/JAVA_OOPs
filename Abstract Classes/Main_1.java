abstract class MyClass
{
    abstract void calculate(double x);
}
class sub1 extends MyClass
{
    void calculate(double x)
    {
        System.out.println("Square = "+(x*x));
    }
}
class sub2 extends MyClass
{
    void calculate(double x)
    {
        System.out.println("Square Root = "+Math.sqrt(x));
    }
}
class sub3 extends MyClass
{
    void calculate(double x)
    {
        System.out.println("Cube = "+(x*x*x));
    }
}
public class Main_1
{
    public static void main(String[] args)
    {
        sub1 s1 = new sub1();
        sub2 s2 = new sub2();
        sub3 s3 = new sub3();
        s1.calculate(5);
        s2.calculate(5);
        s3.calculate(5);
    }
}
