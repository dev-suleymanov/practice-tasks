package collections;

import java.util.ArrayList;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        List<Character> leftList = new ArrayList<>(left.chars()
                .mapToObj(c -> (Character) (char) c)
                .toList());
        List<Character> rightList = new ArrayList<>(right.chars()
                .mapToObj(c -> (Character) (char) c)
                .sorted()
                .toList());
        return leftList.equals(rightList);
    }

    public static void main(String[] args) {
        String left = "Hello";
        String right = "Hlloe";
        System.out.println(eq(left, right));
    }
}
