import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] values1 = {1, 2, 3, 4, 5};
        int[] values2 = {6, 7, 8, 9, 10, 11};

        int []values1and2 = new int[values2.length + values1.length];

        System.arraycopy(values1, 0 ,values1and2, 0, values1.length );
        System.arraycopy(values2, 0, values1and2, values1.length, values2.length);

        System.out.println("First Array: " + Arrays.toString(values1));
        System.out.println("Second Array: " + Arrays.toString(values2));
        System.out.println("\nResult: " + Arrays.toString(values1and2));
    }
}
