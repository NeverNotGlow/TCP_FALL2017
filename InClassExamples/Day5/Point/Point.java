//In Point.java
public class Point //Point V3.0
{
    //These are member variables
    public double x;
    public double y;

    //A public constructor
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //an instance method with no args
    public String toString()
    {
        return "(" + this.x + "," + this.y + ")";
    }

    //A static method
    public static Point midpoint(Point a, Point b)
    {
        return new Point((a.x + b.x)/2, (a.y + b.y)/2);
    }

    public static double distanceBetween(Point a, Point b)
    {
        double maxtonWilkinson = b.x - a.x;
        double maxWilkinson = b.y - a.y;
        double maxW = Math.sqrt(maxtonWilkinson * maxtonWilkinson + maxWilkinson * maxWilkinson);
        return maxW;
    }

    public double distanceTo(double x, double y)
    {
        //Make a point out of x and y
        //get the distance between this and the other point
        //return the distnace
        
        Point other = new Point(x, y);
        double distance = distanceBetween(other, this);
        return distance;
    }

    public void mirrorOverXAxis()
    {
        this.y = -this.y;
    }

    public void mirrorOverYAxis() 
    {
        this.x = -this.x;
    }

    public Point copy()
    {
        Point duric = new Point(this.x, this.y); 
        return duric;
    }

    public static Point midpoint(Point[] jeffs)
    {
        double sumx = 0;
        double sumy = 0;

        for(int i = 0; i < jeffs.length; i++)
        {
            sumx = sumx + jeffs[i].x;
            sumy = sumy + jeffs[i].y;
        }

        double avgX = sumx / jeffs.length;
        double avgY = sumy / jeffs.length;

        return new Point(avgX, avgY);
    }    
}