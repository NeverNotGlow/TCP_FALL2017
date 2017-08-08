import java.util.Scanner;

public class DoLoopTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number bigger than 10:");
        int x = scan.nextInt();

        while(x < 10)
        {
            System.out.println("Bad Input");
            System.out.println("Enter a number bigger than 10:");
            x = scan.nextInt();
        } 

        System.out.println("You entered: " + x);
    }
}