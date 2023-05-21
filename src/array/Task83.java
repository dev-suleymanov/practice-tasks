package array;

import java.util.Arrays;

public class Task83 {
    public static int[] sumOfTwo(int[] numbers, int goal) {
        if (numbers == null || numbers.length <= 1) {
            return null;
        }
        int pos = 0, size = 1;
        while (numbers[pos] + numbers[size] != goal) {
            if (size++ == numbers.length - 1) {
                pos++;
                if (pos == numbers.length - 1) {
                    return null;
                }
                size = pos + 1;
            }
        }
        numbers[0] = pos;
        numbers[1] = size;
        return Arrays.copyOf(numbers, 2);
    }
}
