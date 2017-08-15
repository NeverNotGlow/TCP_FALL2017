public class LiftOff
{
    public static void main(String[] args)
    {
        launch(2);
    }

    public static void launch(int i)
    {
        System.out.println("Entering launch(" + i +")");

        if(i == 0) // Base Case
        {
            System.out.println("BLASTOFF!!!");
        }
        else
        {
            System.out.println(i + "!");
            launch(i - 1); //Recusive call
        }

        System.out.println("Exiting launch(" + i + ")");
    }
}
