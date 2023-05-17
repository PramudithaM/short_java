import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] x = {-99,5,2,3,6,4,5,66,-89};

        Arrays.sort(x, 1,7);

        for (int i : x) {
            System.out.print(i+ ",");
        }
    }
}