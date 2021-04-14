//Overriding sub class method by the sub class
class One1
{
    void show1()
    {
        System.out.println("This is super class method");
    }
}
class Two1 extends One1
{
    void show1()
    {
        System.out.println("This is sub class method");
    }
}
public class Main_2
{
    public static void main(String[] args)
    {
        One1 o = new Two1();
        o.show1();
    }
}
