import java.util.Scanner;

public class ArrayTest
{
    public static void main(String[] args)
    {
        int[] favNums = new int[5];

        favNums[0] = 21;
        favNums[1] = 27;
        favNums[2] = 100;
        favNums[3] = 0;
        favNums[4] = 4;

        Scanner scan = new Scanner(System.in);
        int numberWeAreLookingAt = scan.nextInt();

        System.out.println(favNums[numberWeAreLookingAt - 1]);
    }
}