import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee
{
    int id;
    String name;
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id+"\t"+name);
    }
}
public class Main_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Create an array of Employee type with size 5
//        Here we are creating an array object of Employee Class
        Employee arr[] = new Employee[5];
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter ID");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Enter Name");
            String name = br.readLine();
            arr[i] = new Employee(id, name);
        }
        System.out.println("\t Employee Data\t");

        for (int i=0;i<5;i++)
        {
            arr[i].display();
        }
    }
}
