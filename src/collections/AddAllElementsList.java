package collections;

import java.util.ArrayList;
import java.util.List;

public class AddAllElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {
        if (left.contains(str) && right.contains(str)) {
            left.remove(str);
            left.addAll(right);
        }
        return left.indexOf(str);
    }

    public static void main(String[] args) {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("fifth");
        int result = containsElement(left, right, "second");
        System.out.println(result);
    }
}