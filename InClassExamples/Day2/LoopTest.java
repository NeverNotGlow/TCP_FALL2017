import java.lang.Exception;

public class LoopTest
{
    public static void main(String[] args)
    {
        int x = 10;
        while(x > 0)
        {
            System.out.println(x + "!");
            x = x - 1;

            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println("Blast off!!!");

    }
}