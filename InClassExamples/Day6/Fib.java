public class Fib
{
    public static void main(String[] args)
    {
        int commandLineArg0 = Integer.parseInt(args[0]);

        int result = fib(commandLineArg0);
        System.out.println(result);
    }

    static int fib(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(n == 1)
        {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
}
