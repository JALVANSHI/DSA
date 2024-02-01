class arraysum{
    public static void main(String args[]){
         int arr[]={41,25,3,42,51,26,34,65};
         sum(arr);
    }
    public static void sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];
        System.out.println("the sum of array is"+sum);
    }
}