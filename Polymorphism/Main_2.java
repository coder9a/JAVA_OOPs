class One
{
    static void calculate(double x)
    {
        System.out.println("Square = "+(x*x));
    }
}
class Two extends One
{
    static void calculate(double x)
    {
        System.out.println("Squareroot = "+Math.sqrt(x));
    }
}
public class Main_2
{
    public static void main(String[] args)
    {
        One o = new Two();
        Two t = new Two();
        t.calculate(25);
        o.calculate(25);
    }
}
