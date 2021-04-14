class Commercial
{
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    void calculte(int units)
    {
        System.out.println("Name = "+getName());
        System.out.println("Bill Amount = "+(units*5));
    }
}
class Domestic extends Commercial
{
    void calculte(int units)
    {
        System.out.println("Name = "+getName());
        System.out.println("Bill Amount = "+(units*2.5));
    }
}
public class Main_3
{
    public static void main(String[] args)
    {
        Commercial com = new Commercial();
        Domestic dom = new Domestic();
        com.setName("Smith Finance Pvt. Ltd.");
        com.calculte(500);
        dom.setName("Aman Verma");
        dom.calculte(250);
    }
}
