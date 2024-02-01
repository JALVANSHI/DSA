public class substring1 {
    public static void main(String[] args) {
        String str="Raman is an intelligents student";
        int firstindex=str.indexOf("s");
        System.out.println("the occurance of String 's' "+"at index :"+firstindex);
        int lastindex=str.lastIndexOf("s");
        System.out.println("the occurance of String 's' "+"at index :"+lastindex);
        int first_in=str.indexOf("s" ,5);
        System.out.println("the occurance of String 's' after index 5 "+"at index :"+first_in);
        int last_in=str.indexOf("s", 20);
        System.out.println("the occurance of String 's' after 20 index "+"at index :"+last_in);
        int char_at=str.charAt(20);
        System.out.println("character at location 20 :"+char_at);
    }
    
}
