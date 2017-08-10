public class Nums
{
    public static void main(String[] args)
    {
        double value = Double.parseDouble(args[0]);
        int exp = Integer.parseInt(args[1]);

        System.out.println(square(value)); 
        System.out.println(myPow(value, exp)); 
    }

    //static function that returns a double and takes one argument
    public static double square(double a)
    {
        return a * a;
    }

    //static function that returns a double and takes two arguments
    public static double myPow(double val, int exponent)
    {
        double toReturn = val;
        for(int i = 0; i < exponent - 1; i++)
        {
            toReturn = toReturn * val;
        }

        return toReturn;
    }
}
