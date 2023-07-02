package algorithms;

public class BinarySearch {
    public static int binarySearch(int[] array, int value) {
        int middle = array[(array.length - 1) / 2];
        int start = value <= middle ? 0 : middle;
        int end = value <= middle ? middle : array.length - 1;
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 7;
        System.out.println(binarySearch(array, value));
    }
}
