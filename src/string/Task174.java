package string;

public class Task174 {
    public static void isPalindrome(int number) {
        String str = "" + number;
        String result = "Да";
        int size = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (size > 0 && str.charAt(i) != str.charAt(size--)) {
                result = "Нет";
                break;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int number = 292;
        isPalindrome(number);
        number = 1223;
        isPalindrome(number);
    }
}
