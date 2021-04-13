import java.text.NumberFormat;

//Shape is the super class for square and
//Square is the sub class for rectangle
class Shape
{
    protected double l;
    Shape(double l)
    {
        this.l = l;
    }
}
class Square extends Shape
{
//    Call shape constructor and send l value
    Square(double l)
    {
        super(l);
    }
//    Calculate area of square
    void area()
    {
        System.out.println("Area of square = "+(l*l));
    }
}
class Rectangle extends Square
{
    private double b;
    Rectangle(double l, double b)
    {
        super(l);
        this.b = b;
    }
    void area()
    {
        NumberFormat obj = NumberFormat.getNumberInstance();
        obj.setMinimumFractionDigits(3);
        double val = l*b;
        String str = obj.format(val);
        System.out.println("Area of rectangle = "+ str);
    }
}
public class Main_6
{
    public static void main(String[] args)
    {
        Square sq = new Square(12.1);
        sq.area();
        Rectangle rec = new Rectangle(12,23.4);
        rec.area();
    }
}
