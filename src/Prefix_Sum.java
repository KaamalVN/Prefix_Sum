import java.util.Arrays;
import java.util.Scanner;

public class Prefix_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(prefix_sum(array)));

    }

    private static int[] prefix_sum(int[] array) {
        for(int iterator=1;iterator<array.length;iterator++){
            array[iterator]+=array[iterator-1];
        }
        return array;
    }
}
