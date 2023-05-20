package collections;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        String finalStr = str.replaceAll("\\s+", "");
        char result = ' ';
        char[] array = finalStr.toCharArray();
        long max = finalStr.chars().
                filter(el -> el == finalStr.charAt(0))
                .count();
        for (int i = 1; i < array.length; i++) {
            int index = i;
            long count = finalStr.chars()
                    .filter(el -> el == array[index])
                    .count();
            if (max < count) {
                max = count;
                result = array[index];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Мама мыла раму";
        System.out.println(getMaxCount(str));
    }
}