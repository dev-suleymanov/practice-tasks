package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> set = new HashSet<>(Arrays.asList(s.split("")));
        return set.size() == s.length();
    }

    public static void main(String[] args) {
        String s = "uncopyrightables";
        System.out.println(checkString(s));
        s = "javascript";
        System.out.println(checkString(s));
    }
}
