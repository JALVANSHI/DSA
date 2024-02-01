//insert an element at any index of an array
import java.util.*;
class arrcreation{
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=num.nextInt();
        int a[]=new int[n];
        int b[]=new int[n+1];
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
             a[i]=num.nextInt();
        }
        System.out.println("enter the index where you want to insert the value:");
        int m=num.nextInt();
        System.out.println("enter the new value that you want to insert");
        int nv=num.nextInt();
        for(int i=0;i<n+1;i++){
            if(i<m){
                b[i]=a[i];
            }
            else if(i==m){
                b[i]=nv;
            }
            else{
                b[i]=a[i-1];
            }
        }
        System.out.println("the element are:");
        for(int i=0;i<n+1;i++){
            System.out.println(b[i]);
        }
    }
}