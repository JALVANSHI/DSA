public class sb1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("shivam");
           System.out.println(sb.charAt(0));
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);
        // sb.insert(1,'h');
        // System.out.println(sb);
        // sb.delete(3,4);
        // System.out.println(sb);
        sb.append(" raj");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
