import java.util.Scanner;

public class raj1{
    public static void main(String[] args) {
        // String name="raj";
        // String fullname="raj saini";
        // String sentence="raj is an intelligent student";
        // System.out.println(name+""+fullname);
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String name=sc.nextLine();
        // System.out.println("my  name is: " +name);
        String firstname="raj";
        String lasttname="saini";
        String fullname=firstname+ " "+lasttname;
        System.out.println(fullname);
        //charAt
        for(int i=0;i<fullname.length();i++)
        System.out.println(fullname.charAt(i));
    }
}