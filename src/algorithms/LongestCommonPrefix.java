package algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return stringBuilder.toString();
        }
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }
        for (int i = 0; i < minLength; i++) {
            char current = strs[0].charAt(i);
            for (String el : strs) {
                if (el.charAt(i) != current) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(current);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] array = {"zomb", "zombie", "zombiemod"};
        System.out.println(longestCommonPrefix(array));
    }
}
