/**
 * Created by Beven Lee on 24/10/17.
 */
public class InsertionSort {

    public static void main(String a[]) {
        int[] unsorted = {8, 77, 44, 78, 0, 88, 21, 55};
        int[] sorted = insertionSort(unsorted);

        System.out.print("Unsorted: ");
        printArray(unsorted);
        System.out.print("Sorted: ");
        printArray(sorted);
    }

    private static int[] insertionSort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

    private static void printArray(int[] input) {
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
