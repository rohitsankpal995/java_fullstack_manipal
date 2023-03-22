package CodingQuetions;

class MaxMin{
    public  void getMax(int [] arr){
        int max =Integer.MIN_VALUE;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println("max of array is ::" + max);

    }
    public  void getMin(int [] arr){
        int min = Integer.MAX_VALUE;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println("min of array is ::" + min);

    }
}
public class MaxAndMin {
    public static void main(String[] args) {
        int []arr = { 1, 3, 1, 78, 67, 23, 56, 90, 2, 45 };
        MaxMin op = new MaxMin();
        op.getMax(arr);
        op.getMin(arr);
    }
}
