//package stack;
import java.util.Scanner;

class ravi{
    static final int n=10;
    int top=-1;
    int arr[]=new int[n];//max size of the stack
    Scanner num=new Scanner(System.in);
   void push(){
    if(top==(n-1)){
        System.out.println("overflow");
    }
    else{
        System.out.println("enter your data");
       int i=num.nextInt();
       top=top+1;
       arr[top]=i;
       System.out.println("the item is inserted");
       
    }
   }
   void pop(){
    if(top==-1){
        System.out.println("underflow");
    }
    else{
        top=top-1;
        System.out.println("item deleted");
    }
   }
   void Display(){
    System.out.println("items are:");
    for(int j=top;j>=0;j--){
        System.out.println(arr[j]);
    }
   }
}
public class ravi1 {
  public static void main(String[] args) {
    Scanner num=new Scanner(System.in);
    ravi s=new ravi();
    /*obj.push();
    obj.pop();
    obj.Display();*/
    int d;
    int l;
    do
    {
        System.out.println("press 1 to push");
        System.out.println("press 2 to pop");
        System.out.println("press 3 to display");
        System.out.println("Enter your choice");
        d=num.nextInt();
        switch(d)
        {
            case 1:
            {
                s.push();
                break;
            }
            case 2:
            {
                s.pop();
                break;
            }
            case 3:
            {
                s.Display();
                break;
            }

        }System.out.println("Enter 0 to go back to the main menu");
        System.out.println("enter any key to exit");
        l=num.nextInt();
    }while(l==0);
    System.out.println("exit sucessfully");
  }
}
