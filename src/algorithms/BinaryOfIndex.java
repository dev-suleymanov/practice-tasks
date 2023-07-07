package algorithms;

public class BinaryOfIndex {
    public static int binaryOfIndex(int[] array, int value) {
        int index = -1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            int current = array[middle];
            if (current == value) {
                index = middle;
                break;
            }
            if (value < current) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 10;
        int result = binaryOfIndex(array, value);
        System.out.println(result);
    }
}
