import java.util.Scanner;
class array5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] numbers={12,45,24,26,23,14,25,15,18};//declaration of an array
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println("enter your particular number which you want to find out:");
        int x=sc.nextInt();
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("the element is at " +i+"th index");
            }
        }
    }
}