import java.util.*;
class selectionsort{
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,7,2,8,6};
        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
                {
                for(int j=i+1;j<arr.length;j++){
                    if(arr[smallest]>arr[j]){
                        smallest=j;
                        }
                    }
                       {
                             //swap
                        int temp=arr[smallest];
                        arr[smallest]=arr[i];
                        arr[i]=temp;
                        }
                       
                }
        }
        show(arr);
        
    }
}