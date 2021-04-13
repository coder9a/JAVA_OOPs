class One
{
    int i = 10;
//    Super class method
    void show()
    {
        System.out.println("Super Class method i = "+i);
    }
}
class Two extends One
{
    int i = 20;
//    Sub Class method
    void show()
    {
        System.out.println("Sub Class method i = "+i);
    }
}
public class Main_2
{
    public static void main(String[] args)
    {
        Two t = new Two();
        t.show();
    }
}
