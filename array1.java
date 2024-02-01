//print the element at the specific position
class array1{
    public static void main(String args[])
    {
        int[] arr;//declare an array
        arr= new int[5];//initialize an array
        arr[0]=10;
        arr[1]=20;
        arr[2]=10;
        arr[3]=40;
        arr[4]=50;
        for(int i=0;i<arr.length;i++){
            System.out.println("the value at "+arr[i]+" is:"+i);
        }


    }
}