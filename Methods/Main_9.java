//Use of this keyword
class Sample3
{
    private int x;
    Sample3()
    {
        this(55);
        this.access();
    }
    Sample3(int x)
    {
        this.x = x;
    }
    void access()
    {
        System.out.println("x = "+x);
    }
}
public class Main_9
{
    public static void main(String[] args)
    {
        Sample3 s = new Sample3();
    }
}
