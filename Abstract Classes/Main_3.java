abstract class plan
{
    protected double rate;
    public abstract void getRate();
    public void calculate(int units)
    {
        System.out.print("Bill amount for "+units+" units: ");
        System.out.println(rate*units);
    }
}
class Commercial extends plan
{
    @Override
    public void getRate()
    {
        rate = 5.0;
    }
}
class Domestic extends plan
{
    @Override
    public void getRate()
    {
        rate = 2.5;
    }
}
public class Main_3
{
    public static void main(String[] args)
    {
        plan p;
        p = new Commercial();
        p.getRate();
        p.calculate(250);
    }
}
