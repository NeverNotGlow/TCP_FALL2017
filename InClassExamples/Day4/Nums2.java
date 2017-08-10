public class Nums2
{
    public static void main(String[] args)
    {
        double value = Double.parseDouble(args[0]);
        int exp = Integer.parseInt(args[1]);

        System.out.println("Happy birthday Tom!");

        System.out.println(square(value)); 
        System.out.println(myPow(value, exp)); 

        funA();
    }

    public static void funA()
    {
        funB();
    }


    public static void funB()
    {
        funA();
    }


    //static function that returns a double and takes one argument
    public static double square(double a)
    {
        return myPow(a, 2);
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
