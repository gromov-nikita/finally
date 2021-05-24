import Filter.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        Filter<Integer> filt = new Filter<Integer>();
        arr = filt.filter(arr, (IFilter<Integer>) value -> value % 2 == 0);
        System.out.println(Arrays.toString(arr));
    }
}
