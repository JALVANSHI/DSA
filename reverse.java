// write a program to reverse a Stringby using StringBuilder
public class reverse {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hi raj");
        System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){
            int front =i;
            int back=sb.length()-i-1;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
            System.out.println(sb);
        }
       
    }
}
