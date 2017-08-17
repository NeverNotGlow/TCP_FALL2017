import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Double> dubs = new ArrayList<Double>();
        dubs.add(0.1);
        dubs.add(0.2);

        System.out.println(dubs);

        dubs.add(1, 5.0);

        System.out.println(dubs);

        System.out.println(dubs.get(1)); //[] = get()
    }
}