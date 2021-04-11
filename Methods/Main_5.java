//When instance variable is shared by two different objects
class Test
{
    int x = 10;
}
public class Main_5
{
    public static void main(String[] args)
    {
        Test obj1 = new Test();
        Test obj2 = new Test();
        obj1.x++;
//        obj2.x++;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
