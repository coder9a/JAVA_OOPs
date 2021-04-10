class Person
{
    //    Properties - variables
    String name;
    int age;
    //    Actions - methods()
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
        Person Raj = new Person();
        Raj.talk();
//        Finding the hash code of object
        System.out.println(Raj.hashCode());
    }
}
