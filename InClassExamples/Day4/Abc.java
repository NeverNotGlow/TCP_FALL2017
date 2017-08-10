public class Abc
{
    public static void main(String[] args)
    {
        int sum = 0;

        //Maybe useful for hw5…
        String str = new String(); 
        for(char c = 'z'; c >= 'a'; c--)
        {
            str += c;
            System.out.println(str);

            //This turns into: sum = sum + str.length();
            sum += str.length();
        }

        System.out.println("We printed a total of " + sum + " numbers!");
    }
}
