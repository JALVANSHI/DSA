class ram{
    public class Node{
        
    }
}
public class stack2 {
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
