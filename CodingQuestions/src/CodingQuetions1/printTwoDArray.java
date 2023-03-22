package CodingQuetions;
class Sum {
    public int getSum(){
        int [][] arr = {{1,1,1,},{1,1},{1,4,5,6}};
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int l = arr[i].length;
            for(int k=0;k<l;k++){
                sum = sum +arr[i][k];
            }
        }
        return  sum;
    }

}
public class printTwoDArray {

    public static void main(String[] args) {
        Sum output = new Sum();
        int result =output.getSum();
        System.out.println("sum of array is ::" + result);

    }


}
