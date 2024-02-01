import java.util.Scanner;

public class arrdel {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.println("enter the values of n:");
        int n=a1.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        System.out.println("enter the element of array:");
        for(int i=0;i<n;i++){
            a[i]=a1.nextInt();
        }
        System.out.println("enter the index of item that you want to delete ");
        int m=a1.nextInt();
        for(int i=0;i<a.length;i++){
            if(i<m){
                b[i]=a[i];
            }
            else if(i==m)
                //System.out.println("");
                continue;
            
            else{
                b[i-1]=a[i];
            }
        }
        System.out.println("the element is:");
        for(int i=0;i<a.length-1;i++){
            System.out.println(b[i]);
        }
    }
}
