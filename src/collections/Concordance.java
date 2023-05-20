package collections;

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> result = new HashMap<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        list.add(j);
                    }
                }
                result.put(array[i], list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, List<Integer>> result = collectCharacters(str);
        System.out.println(result);
    }
}
