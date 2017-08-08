public class DubsTest
{
    public static void main(String[] args)
    {
        double pi = Math.PI;
        int r = (int)40.40;

        //area of circle = pi * r^2
        double area = pi * r * r;

        //double area = 3.14 * 40 * 40;
        //double area = 3.14 * 40.0 * 40; coversion
        //double area = 125.6 * 40;
        //double area = 125.6 * 40.0; coversion
        //double area = 5026.0;

        System.out.println("Area = " + area);
    }
}