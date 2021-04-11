//When static variable is shared by two different objects
class Test1
{
    static int x = 10;
}
public class Main_6
{
    public static void main(String[] args)
    {
        Test1 obj1 = new Test1();
        Test1 obj2 = new Test1();
        obj1.x++;
//        obj2.x++;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
