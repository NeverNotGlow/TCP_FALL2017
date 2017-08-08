public class MathTest
{
    public static void main(String[] args)
    {
        double x1 = 10.5, y1 = 7.0, x2 = 0.5, y2 = 2.0; //Multiple definitions
        double xDiff = x1 - x2;
        double yDiff = y1 - y2;
        double xDiff2 = Math.pow(xDiff,2);
        double yDiff2 = Math.pow(yDiff,2);
        double distance = Math.sqrt(xDiff2 + yDiff2);

        //distance = square root of ((x1 – x2)^2 + (y1-y2)^2)
        System.out.print(distance);


        
    }
}