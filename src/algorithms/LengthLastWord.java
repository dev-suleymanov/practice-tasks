package algorithms;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        return array[array.length - 1].length();
    }

    public static void main(String[] args) {
        LengthLastWord lengthLastWord = new LengthLastWord();
        String str = "Hello World";
        System.out.println(lengthLastWord.lengthOfLastWord(str));
        str = "   fly me   to   the moon  ";
        System.out.println(lengthLastWord.lengthOfLastWord(str));
        str = "luffy is still joyboy";
        System.out.println(lengthLastWord.lengthOfLastWord(str));
    }
}
