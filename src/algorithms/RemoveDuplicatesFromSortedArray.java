package algorithms;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] < nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    }
}
