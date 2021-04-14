class One3
{
    void show1()
    {
        System.out.println("This is super class method");
    }
}
class Two3 extends One3
{
    void show2()
    {
        System.out.println("This is sub class method");
    }
}

public class Main_4
{
    public static void main(String[] args)
    {
//        Super class reference to sub class object
        One3 o = new Two3();
//        Converting class One reference type as class Two's reference type
        Two3 t = (Two3) o;
        t.show1();
        t.show2();

    }
}
