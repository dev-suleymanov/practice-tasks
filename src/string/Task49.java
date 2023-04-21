package string;

public class Task49 {
    public static void isPalindrome(int number) {
        boolean result = true;
        char[] array = ("" + number).toCharArray();
        int length = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[length--]) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "Да" : "Нет");
    }
}
