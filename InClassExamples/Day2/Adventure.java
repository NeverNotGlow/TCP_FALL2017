import java.util.Scanner;

public class Adventure
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        if(name.equals("Ian"))
        {
            System.out.println("Yo man!");
        }

        System.out.println("Hello " + name + "!");

        System.out.println("Which door do you go through:");
        System.out.println("0) Blue Door");
        System.out.println("1) Red Door");
        int choice = scan.nextInt();

        if(choice == 0)
        {
            System.out.println("You went throught the blue door");
            System.out.println("You were eaten by a lion");
        }
        else
        {
            System.out.println("You go through the red door");
            System.out.println("Now you:");
            System.out.println("0) Go out the exit");
            System.out.println("1) Jump into a pit");
            choice = scan.nextInt();

            if(choice == 0)
            {
                System.out.println("You feel the sun and are content");
            }
            else
            {
                System.out.println("You die");
                main(null);
            }
        }


    }
}