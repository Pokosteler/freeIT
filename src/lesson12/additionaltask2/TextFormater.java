package lesson12.additionaltask2;

public class TextFormater {
    public static boolean palindrome(String sentence) {
        String[] words = sentence.split("[, !?.@]+");
        for (String word : words) {
            char arrayStringBackwards[] = new char[word.length()];
            for (int i = word.length() - 1; i >= 0; i--) {
                arrayStringBackwards[word.length() - i - 1] = word.charAt(i);
            }
            if (word.equalsIgnoreCase(String.valueOf(arrayStringBackwards))) {
                return true;
            }
        }
        return false;
    }

    public static Integer wordCount(String sentence) {
        return sentence.split("[, !?.@]+").length;
    }
}
