//Initailizing the instace variables
class Person2
{
    String name = "Smith";
    int age = 21;
    void talk()
    {
        System.out.println("Hello I am "+ name);
        System.out.println("My age is "+age);
    }
}
public class Main_2
{
    public static void main(String[] args)
    {
//        Crete person class object
        Person2 Raj = new Person2();
        Raj.name = "Raj";
        Raj.age = 23;
        Raj.talk();
    }
}
