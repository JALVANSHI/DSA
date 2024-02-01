// sum and average of an array
class pro2{
    public static void main(String args[]){
        int[] numbers={10,14,12,15,13,17,19,21,54};
        int sum=0;
        double average;
        for(int number:numbers)
        {
            sum +=number;
        }
        
        int arraylength=numbers.length;
        average=((double)sum/(double)arraylength);
        System.out.println("the sum is:"+sum);
        System.out.println("the average is:"+average);
    }
}