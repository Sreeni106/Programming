// Given an array of n integers. Write a program to print the second largest element present in the array.(only one traversal is allowed,no sorting is allowed and largest of first and second should not be equal)
class Secondlargest
{
    public static void main(String [] args){
        int[] arr={5,2,4,8,6,8};
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
        System.out.println(vicePres);
    }
}