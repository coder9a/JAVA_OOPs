public class Main_1
{
    public static void main(String[] args)
    {
        try {
            System.out.println("Open Files");
            int n = args.length;
            System.out.println(n);
            int a = 45/n;
            System.out.println(a);
        }
        catch (Exception e)
        {
            System.out.println("Exception = "+e);
        }
        finally {
            System.out.println("Close Files");
        }
    }
}
