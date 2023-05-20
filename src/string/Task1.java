package string;

public class Task1 {
    public static String maxMatch(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        if (strings == null || strings.length == 0) {
            return stringBuilder.toString();
        }
        int length = strings[0].length();
        for (int i = 1; i < strings.length; i++) {
            if (length > strings[i].length()) {
                length = strings[i].length();
            }
        }
        for (int i = 0; i < length; i++) {
            char current = strings[0].charAt(i);
            for (String el : strings) {
                if (current != el.charAt(i)) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(current);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"стол", "стул", "столица"};
        System.out.println(maxMatch(strings));
    }
}