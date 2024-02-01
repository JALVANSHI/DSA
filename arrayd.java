import java.util.*;
class arrayd{
    public static void main(String args[]){
        Scanner raju=new Scanner(System.in);
        int rows=raju.nextInt();
        int columns=raju.nextInt();
        int[][] numbers=new int[rows][columns];
        //for inputs
        //for rows
        for(int i=0;i<rows;i++){
            //for columns
            for(int j=0;j<columns;j++){
                 numbers[i][j]=raju.nextInt();
            }
        }
        System.out.println("enter the element which you want to search");
        //for search the particular element in an array
        int x=raju.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                // System.out.print(numbers[i][j] + " ");
                if(numbers[i][j]==x){
                    System.out.println("the number is at ("+ i +","+j+") position");
                }
            }
            System.out.println("");

        }
    }
}