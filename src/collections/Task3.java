package collections;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        left.forEach(
                el -> {
                    if (right.contains(el)) {
                        result.add(el);
                    }
                }
        );
        return result;
    }
}
