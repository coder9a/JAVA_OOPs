abstract class Car
{
    int regno;
    Car(int r)
    {
        this.regno = r;
    }
    void regno()
    {
        System.out.println(regno);
    }
    void opentank()
    {
        System.out.println("Fill the tank");
    }
//    abstract void setRegno(int regno);
    abstract void steering(int direction, int angle);
    abstract void braking(int force);
}
class Maruti extends Car
{
    Maruti(int regno)
    {
        super(regno);
    }
    @Override
    void steering(int direction, int angle)
    {
        System.out.println("Take turn in right direction");
        System.out.println("Move an angle of 45 degree");
    }
    @Override
    void braking(int force)
    {
        System.out.println("Apply Brakes (Maruti)");
    }
}
class Honda extends Car
{
    Honda(int regno)
    {
        super(regno);
    }
    @Override
    void steering(int direction, int angle)
    {
        System.out.println("Take turn in left direction");
        System.out.println("Move an angle of 55 degree");
    }
    @Override
    void braking(int force)
    {
        System.out.println("Apply Brakes (Honda)");
    }
}
public class Main_2
{
    public static void main(String[] args)
    {
        Maruti m = new Maruti(11221);
        Honda h = new Honda(232333);
        Car obj;
        obj = m;
//        obj = h;
        obj.opentank();
        obj.steering(12,23);
        obj.braking(12);
        obj.regno();
    }
}
