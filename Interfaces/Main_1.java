interface Father
{
    float Ht = 6.4f;
    void height();
}
interface Mother
{
    float Ht = 5.6f;
    void height();
}
class Child implements Father,Mother
{

    @Override
    public void height()
    {
        float Ht = (Father.Ht+Mother.Ht)/2;
        System.out.println("Child's height = "+Ht);
    }
}
public class Main_1
{
    public static void main(String[] args)
    {
        Child ch = new Child();
        ch.height();
    }
}
