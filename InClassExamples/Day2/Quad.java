import java.util.Scanner;

public class Quad
{
    public static void main(String[] args)
    {
        System.out.println("Enter a, then b, then c");

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double disc = b * b - 4 * a * c;
        if(disc > 0) //2 real solutions
        {
            double root1 = (-b + Math.sqrt(disc) / (2 * a));
            double root2 = (-b - Math.sqrt(disc) / (2 * a));
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
        else if(disc == 0) //1 soution
        {
            double root1 = (-b / (2 * a));
            System.out.println("Root 1 = " + root1);
        }
        else
        {
            System.out.println("No Real Solutions");
        }
    }
}