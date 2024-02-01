import java.util.ArrayList;
import java.util.Collections;
class Arraylists{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        // add the element
        list.add(0);
        list.add(1);
        list.add(4);
        list.add(2);
       System.out.println(list);
        // for get the element
         int element=list.get(1);
         System.out.println(element);
         // add the element at any position
         list.add(1,3);
         System.out.println(list);
         // set the element
         list.set(2,5);
         System.out.println(list);
          list.remove(2);
         System.out.println(list);
         // size 
         int size= list.size();
         System.out.println(size);
         //loops
         for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
         }
         System.out.println();
         // sorting
         Collections.sort(list);
         System.out.println(list);



    }
}