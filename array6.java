class student{
    int roll_no;
    String name;
    student(int roll_no, String name){
       this.roll_no=roll_no;
        this.name=name;
    }
   
}
class array6{
    public static void main(String args[]){
        //declaration of an array
        student[] arr;
        arr=new student[5];//initialization of an array
        arr[0]=new student(1,"raman");
        arr[1]=new student(2,"rama");
        arr[2]=new student(3,"rahul");
        arr[3]=new student(15,"raja");
        arr[4]=new student(16,"ram");
        for(int i=0;i<arr.length;i++)
        System.out.println("the element at "+i+" is:"+arr[i].roll_no+" "+arr[i].name);
    }
}