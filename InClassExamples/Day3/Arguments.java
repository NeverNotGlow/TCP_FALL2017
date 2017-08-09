import java.lang.Exeption;

public class Arguments
{
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            String str = args[i];
            System.out.println(str);
        }
    }
}