package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        list.add(target);
        list.sort(Comparator.naturalOrder());
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int nums[] = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsertPosition.searchInsert(nums, target));
    }
}
