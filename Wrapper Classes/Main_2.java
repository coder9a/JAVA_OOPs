import java.io.*;

// Convert integer to other number system
public class Main_2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an Integer");
        String str = br.readLine();
        int i = Integer.parseInt(str);
        System.out.println("In decimal : "+i);
        float ft = Float.parseFloat(str);
        System.out.println("In Float : "+ft);
        double d = Double.parseDouble(str);
        System.out.println("In Double : "+d);
        str = Integer.toBinaryString(i);
        System.out.println("In Binary : "+str);
        str = Integer.toHexString(i);
        System.out.println("In Hexadecimal : "+str);
        str = Integer.toOctalString(i);
        System.out.println("In Octal : "+str    );
    }
}
