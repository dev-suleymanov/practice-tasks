package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        StringBuilder builder = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (Character el : s.toCharArray()) {
            list.add(el);
        }
        list.sort(Comparator.naturalOrder());
        list.stream()
                .forEach(el -> builder.append(el));
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reformat("javascript"));
    }
}