package StreamApi;
import java.util.Arrays;
public class SumOfTwoDArray {
    public void getSum(){
        int[][] arr = {
                {1, 1, 1},
                {1, 1},
                {1, 4, 5, 6}
        };

        int sum = Arrays.stream(arr).flatMapToInt(Arrays::stream).sum();

        System.out.println("Sum of elements: " + sum);
    }

}
