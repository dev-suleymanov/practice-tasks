package algorithms;

public class OccurrenceString {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        OccurrenceString occurrenceString = new OccurrenceString();
        String str = "sadbutsad";
        System.out.println(occurrenceString.strStr(str, "sad"));
        str = "leetcode";
        System.out.println(occurrenceString.strStr(str, "leeto"));
    }
}
