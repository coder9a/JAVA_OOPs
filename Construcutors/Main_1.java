//Initailizing the instace variables using default constructor
class Person1
{
    private String name;
    private int age;
//    Default Constructor
    Person1()
    {
        this.name = "Smith";
        this.age = 21;
    }
//    Parameterized constructor
    Person1(String myname, int myage)
    {
        this.name = myname;
        this.age = myage;
    }
    void talk()
    {
        System.out.println("Hello I am "+ name);
        System.out.println("My age is "+age);
    }
}
public class Main_1
{
    public static void main(String[] args)
    {
//        Crete person class object
        Person1 John = new Person1();
        John.talk();
        Person1 Smith = new Person1("Jason", 25);
        Smith.talk();

    }
}
