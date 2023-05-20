package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String str : strings) {
            long temp = Arrays.stream(strings)
                    .filter(el -> el.equals(str))
                    .count();
            result.put(str, temp == 1 ? false : true);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] data = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> rsl = checkData(data);
        System.out.println(rsl);
    }
}