//Setter and Getter Methods
class Methods
{
    private String name;
    private int age;
//    Setter or Mutator Method
    void setName(String myName)
    {
        this.name = myName;
    }
    void setAge(int myAge)
    {
        this.age = myAge;
    }
//    Getter or Accessor Method
    String getName()
    {
        return  this.name;
    }
    int getAge()
    {
        return this.age;
    }
}
public class Main_10
{
    public static void main(String[] args)
    {
        Methods m = new Methods();
        m.setAge(23);
        m.setName("alpha");
        System.out.println("Name = "+m.getName());
        System.out.println("Age = "+m.getAge());
    }
}
