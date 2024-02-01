import java.util.Scanner;
class array4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("the size of an array is:");
        int size=sc.nextInt();
        System.out.println("the element of an array is:");
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("enter the element(x) which you want to find out :");
        int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("the element is at " +i+"th index");
            }
        }
    }
}