
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] values = {1, 10, 2, 5, 6, 4, 0, 3};

        System.out.println( "Array: " + Arrays.toString(values));

        int min = values[0];
        int min_position = 0;

        int max = values[0];
        int max_position = 0;

        for(int i = 0; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
                min_position = i;
            }
            if(values[i] > max){
                max = values[i];
                max_position = i;
            }
        }

        System.out.println("min = " + min + " position = " + min_position);
        System.out.println("max = " + max + " position = " + max_position);

        int start = Math.min(min_position, max_position) + 1;
        int end = Math.max(min_position, max_position);

        int result = 0;

        for(; start < end ; start ++ ){
            result += values[start];
        }

        System.out.println("Result = " + result);
    }
}
