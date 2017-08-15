//Easier to read, more comprehndable, and more modular
//In PointTester.java
public class PointTester
{
    public static void main(String[] args)
    {
        Point p1 = new Point(10, 10); 
        Point p2 = new Point(100, 0);

        Point p3 = p1.copy();
        
        p1.mirrorOverXAxis();
        p1.mirrorOverYAxis();

        System.out.println("p1 = " + p1.toString());
        System.out.println("p3 = " + p3.toString());

        Point pMid = Point.midpoint(p1, p2);
        System.out.println(pMid.toString());
    
        System.out.println("distance between p1 & p2 = " + Point.distanceBetween(p1,p2));
        System.out.println("distance between p1 & (0,0) = " + p1.distanceTo(0,0) );

        Point[] points = new Point[4];
        points[0] = new Point(1,1);
        points[1] = new Point(2,17);
        points[2] = new Point(3,6);
        points[3] = new Point(4,76);
        
        Point answer = Point.midpoint(points);
        System.out.println(answer.toString());        
    }
}