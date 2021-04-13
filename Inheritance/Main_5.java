// Calling super class parameterized constructor from sub class
class sup
{
    int i;
    //    Super class Parameterized constructor
    sup(int x)
    {
        this.i = x;
    }
//    Super class method
    void show()
    {
        System.out.println("Super Class method i = "+i);
    }
}
class sub extends sup
{
    int i;
    //    Sub class Parameterized constructor
    sub(int x, int y)
    {
        super(x);
        this.i = y;
    }
    //    Sub Class method
    void show()
    {
        System.out.println("Sub Class method i = "+i);
        super.show();
//        Using super keyword to call super class method
        System.out.println("Super Class method from sub class i = "+super.i);
    }
}
public class Main_5
{
    public static void main(String[] args)
    {
//        Create Sub class object
        sub sb = new sub(12,23);
        sb.show();
    }
}
