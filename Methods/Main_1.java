class Sample
{
    private double num1, num2;
    Sample(double x, double y)
    {
        this.num1 = x;
        this.num2 = y;
    }
    public void sum()
    {
        System.out.println("Sum is = "+(num1+num2));
    }
    public double multiply()
    {
        double result = num1*num2;
        return result;
    }
}
public class Main_1
{
    public static void main(String[] args)
    {
        Sample s = new Sample(12,23.89);
        s.sum();
        double result = s.multiply();
        System.out.println("Multiplication is = "+result);
    }
}
