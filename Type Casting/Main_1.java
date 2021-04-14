//Super Class reference is used to refer to sub class object
class One
{
    void show1()
    {
        System.out.println("This is super class method");
    }
}
class Two extends One
{
    void show2()
    {
        System.out.println("This is sub class method");
    }
}
public class Main_1
{
    public static void main(String[] args)
    {
//        Left side is o whose data type is class One
//        Right side is object whose data type is class Two
//        Now Two is explicitly type casted to One
        One o = (One)new Two();
//        But this can be done implicitly by the JAVA Complier like,
//        One o = new Two();
//        Both give same result
        o.show1();
//        o.show2();   ---->>> show2() can't be called because o is refering to super class only
    }
}
