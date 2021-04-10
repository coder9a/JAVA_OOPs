
class Person3
{
    private String name = "Smith";
    private int age = 21;
    void talk()
    {
        System.out.println("Hello I am "+ name);
        System.out.println("My age is "+age);
    }
}
public class Main_3
{
    public static void main(String[] args)
    {
//        Crete person class object
        Person3 Raj = new Person3();
//        Raj.name = "Raj";         //   name has private access in Person3
//        Raj.age = 23;         //   age has private access in Person3
        Raj.talk();
    }
}
