import java.util.Scanner;

public class linked1 {
    public static void main(String[] args) {
        int i;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("print array");
        {
            for(i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }

    }
}
