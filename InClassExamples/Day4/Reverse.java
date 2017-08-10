public class Reverse
{
    public static void main(String[] args)
    {
        String original = args[0];
        String reversed = "";

        for(int i = original.length() - 1; i >= 0; i--)
        {
            System.out.println("i = " + i);
            System.out.println("original.charAt(i) = " + original.charAt(i));

            reversed = reversed + original.charAt(i);
            System.out.println("reversed = " + reversed);
        }

        System.out.println(reversed);
    }
}