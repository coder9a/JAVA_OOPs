import java.io.*;

// Accepts character and displays its type
public class Main_1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter character");
        char ch = (char)br.read();
        System.out.print("You Entered: ");
        if(Character.isDigit(ch))
            System.out.println("Digit");
        else if(Character.isAlphabetic(ch))
            System.out.println("Alphanumeric");
        else if (Character.isUpperCase(ch))
            System.out.println("Uppercase");
        else if(Character.isLowerCase(ch))
            System.out.println("LowerCase");
        else
            System.out.println("Don't Know");
    }
}
