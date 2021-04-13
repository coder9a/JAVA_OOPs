// Calling super class constructor from sub class
class oneone
{
    int i = 10;
    //    Super class method
    oneone()
    {
        System.out.println("oneone");
    }
    void show()
    {
        System.out.println("Super Class method i = "+i);
    }
}
class twotwo extends oneone
{
    int i = 20;
    twotwo()
    {
        System.out.println("twotwo");
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
public class Main_4
{
    public static void main(String[] args)
    {
//        Calling sub class constructor
        twotwo t = new twotwo();
    }
}
