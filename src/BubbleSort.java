import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean hasExchanged = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    hasExchanged = true;
                }
            }

            if (!hasExchanged) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        // int[] array = {17, 16, 5, 14, 13, 12, 11, 15, 4, 3};
        int[] array = { 7, 5, 6, 4, 9, 8, 2, 1, 3, 17, 16, 14, 13, 12, 11, 15, 19, 23, 65, 48};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
