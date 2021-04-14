//Sub class reference used to refer super class object
class One2
{
    void show1()
    {
        System.out.println("This is super class method");
    }
}
class Two2 extends One2
{
    void show2()
    {
        System.out.println("This is sub class method");
    }
}

public class Main_3
{
    public static void main(String[] args)
    {
//        Two2 t = (Two2)new One2();     ----->>>   This gives error
//        t.show1();
    }
}
