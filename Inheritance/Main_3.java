// Access super class method and instance variable using super keyword
class Alpha
{
    int i = 10;
    //    Super class method
    void show()
    {
        System.out.println("Super Class method i = "+i);
    }
}
class Beta extends Alpha
{
    int i = 20;
    //    Sub Class method
    void show()
    {
        System.out.println("Sub Class method i = "+i);
        super.show();
//        Using super keyword to call super class method
        System.out.println("Super Class method from sub class i = "+super.i);
    }
}
public class Main_3
{
    public static void main(String[] args)
    {
        Beta b = new Beta();
        b.show();
    }
}
