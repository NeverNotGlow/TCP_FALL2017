public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i * 2;
        }

        boolean result = binarySearch(arr, 126);
        System.out.println(result);
    }

    //this is for convinece
    public static boolean binarySearch(int[] arr, int val)
    {
        return binarySearch(arr, val, 0, arr.length);
    }

    public static boolean binarySearch(int[] arr, int val, int left, int right)
    {
        int range = right - left;
        int middle = left + range / 2; 

        System.out.print("range = " + range + ", middle = " + middle);
        System.out.print(", left = " + left + ", right = " + right);
        System.out.println(", val = " + val + ", arr[middle] = " + arr[middle]);

        if(range == 0) //Base case 1 left
            return (arr[left] == val);

        if(arr[middle] == val) //Base case found val
            return true;

        if(arr[middle] > val) 
            return binarySearch(arr, val, left, middle - 1); //Check left half
        else 
            return binarySearch(arr, val, middle + 1, right); //Check right half
    }

}
