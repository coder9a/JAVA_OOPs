// Static method trying to access instance variable
class Sample4
{
//    static int x;
//    Sample4(int x1)
//    {
//        this.x = x1;
//    }
//    OR
    static  int x = 23;
    static void access()
    {
        System.out.println("x = "+x);
    }
}
public class Main_4
{
    public static void main(String[] args)
    {
//        Sample4 s = new Sample4(12);
//        s.access();
        Sample4.access();
    }
}
