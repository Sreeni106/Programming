// class LargestPair
// {
//     public static void main(String[]args)
//     {
//         int[] arr={3,2,7,4,9};
//         int president=Integer.MIN_VALUE;
//         int vicePres=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]>president )
//             {
//                 vicePres=president;
//                 president=arr[i];
//             }
//             else if(arr[i]>vicePres && arr[i]!=president){
//                 vicePres=arr[i];
//             }
//         }
//         int sum=president+vicePres;
//         System.out.println("The largest element sum is: "+sum);
//     }
// }

// The above is the pair sum code(ana namma adhula * panna product varanu la).But it is not possible for negative numbers because largest number is {-5,-8,-4,-2,-7} -2 and -4 are the largest  but product of -7 and -8 are the largest product , so we used thsi method
class LargestProduct
{
    public static void main(String[]args)
    {
        // int[] arr={3,2,7,4,9};
        int[] arr={-5,-8,-4,-2,-7};
        int largestSum=largestpair(arr);
        int smallestsum=smallestpair(arr);
        if(largestSum>smallestsum){
            System.out.println("The largest sum is:"+largestSum);
        }
        else{
            System.out.println("The largest sum is:"+smallestsum);
        }
    }
    static int largestpair(int [] arr)
    {
        int president=Integer.MIN_VALUE;
        int vicePres=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>president )
            {
                vicePres=president;
                president=arr[i];
            }
            else if(arr[i]>vicePres && arr[i]!=president){
                vicePres=arr[i];
            }
        }
        return president*vicePres;
    }
    static int smallestpair(int [] arr)
    {
        int president=Integer.MAX_VALUE;
        int vicePres=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<president )
            {
                vicePres=president;
                president=arr[i];
            }
            else if(arr[i]<vicePres && arr[i]!=president){
                vicePres=arr[i];
            }
        }
        return president*vicePres;
    }
}