import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] values = {1, 10, 2, 5, 6, 4, 0, 3};

        System.out.println( "To:" + Arrays.toString(values));

        int[] newArray = new int[values.length];

        newArray[0] = values[values.length -1];
        System.arraycopy(values, 0, newArray, 1, values.length - 1 - 1);

        System.out.println("After:" + Arrays.toString(newArray));
    }
}
