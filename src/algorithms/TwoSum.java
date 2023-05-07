package algorithms;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int firstPos = 0;
        int secondPos = 1;
        while (nums[firstPos] + nums[secondPos] != target) {
            if (secondPos == nums.length - 1) {
                firstPos++;
                secondPos = firstPos + 1;
            } else {
                secondPos++;
            }
        }
        result[0] = firstPos;
        result[1] = secondPos;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println(result[0] + "," + result[1]);
    }
}
