package array;

import java.util.Arrays;

public class Task1 {
    public static int[] removeElement(int[] nums, int val) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[size++] = nums[i];
            }
        }
        return Arrays.copyOf(nums, size);
    }

    public static void main(String[] args) {
        int array[] = {0, 1, 2, 2, 3, 0, 4, 2};
        removeElement(array, 2);
        Arrays.stream(array).boxed()
                .forEach(System.out::println);
    }
}
