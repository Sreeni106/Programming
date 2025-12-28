// {3,2,7,4,9} the easy way to get the largest sum is to sum the first and second largest elements
class LargestPair
{
    public static void main(String[]args)
    {
        int[] arr={3,2,7,4,9};
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
        int sum=president+vicePres;
        System.out.println("The largest element sum is: "+sum);
    }
}