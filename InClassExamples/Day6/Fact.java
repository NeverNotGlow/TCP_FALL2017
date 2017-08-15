public class Fact
{
    public static void main(String[] args)
    {
        int result = factorial(0);
        System.out.println(result);
    }

    static int factorial(int n)
    {
        if (n == 1)
        {
            //Base case -> factorial(1) = 1
            return 1;
        } 
        else
        {
            //Recursive call -> factorial(n) =  n * factorial(n - 1)
            return n * factorial(n - 1); 
        }
    }
}
