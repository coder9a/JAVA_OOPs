class Teacher
{
    int id;
    String name, Address;
    float sal;

    public String getName()
    {
        return name;
    }

    public float getSal()
    {
        return sal;
    }

    public void setSal(float sal)
    {
        this.sal = sal;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        Address = address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }
    void setId(int MyId)
    {
        this.id = MyId;
    }

}
class Student extends Teacher
{
    int marks;

    public int getMarks()
    {
        return marks;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }
}
public class Main_1
{
    public static void main(String[] args)
    {
        Student stu = new Student();
        stu.setAddress("India");
        stu.setMarks(1212);
        stu.setId(33);
        stu.setName("John Smith");
        stu.setSal(340000f);
        System.out.println(stu.getId());
        System.out.println(stu.getName());
        System.out.println(stu.getMarks());
        System.out.println(stu.getAddress());
        System.out.println(stu.getSal());
    }
}
