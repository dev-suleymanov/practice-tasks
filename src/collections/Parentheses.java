package collections;

public class Parentheses {
    public static boolean valid(char[] data) {
        if (data[0] == ')' || data[data.length - 1] == '(') {
            return false;
        }
        int result = 0;
        for (char el : data) {
            result = el == '(' ? result + 1 : result - 1;
        }
        return result == 0;
    }

    public static void main(String[] args) {
        char[] data = {'(', ')', '('};
        System.out.println(valid(data));
    }
}