// Explanation is written below.
class SmallestProduct
{
    public static void main(String[]args)
    {
        // int[] arr={3,2,7,4,9};
        int[] arr={3,7,5,-9,-5,2,9,-1};
        int largestSum=largestpair(arr);
        int smallestsum=smallestpair(arr);
        int comb=combination(arr);
        if(largestSum<smallestsum && largestSum<comb){
            System.out.println("The Smallest sum is:"+largestSum);
        }
        else if(smallestsum<largestSum && smallestsum<comb){
            System.out.println("The Smallest sum is:"+smallestsum);
        }
        else{
            System.out.println("The Smallest sum is:"+comb);
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
    static int combination(int[] arr)
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        return largest*smallest;
    }
}

// Note: we should add one more test case to this problem
// arr={3,7,5,-9,-5,2,9,-1} 
// largest:9*7--> 63
// smallest:-9*-4--> 36
// combine: -9(smallestelement)*9(largestelement)-->-81 so this is the result