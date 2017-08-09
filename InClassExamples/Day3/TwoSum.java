public class TwoSum
{
    public static void main(String[] args)
    {
        int[] input = new int[6];
        input[0] = 21;
        input[1] = 18;
        input[2] = 27;
        input[3] = 133;
        input[4] = 12;
        input[5] = 56;

        int[] result = TwoSum.twoSum(input, 160);

        System.out.println("First index = " + result[0]);
        System.out.println("Second index = " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) 
    {
        for(int i = 0; i<nums.length; i++)
        {
            //i represents the index of the first number 
            int first = nums[i];
            for(int j=0; j<nums.length; j++)
            {
               int second = nums[j];
                if(i!=j && first + second == target)
                {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    
                    return result;   
                }             
            }
        }
        
        return null;
    }
}