package lesson10.jbchapter3.task32;

import java.util.HashMap;
import java.util.Scanner;

//Имеется текст. Следует составить для него частотный словарь.
public class Task32 {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<String, Integer> dictionary = new HashMap<>();
        fillDictionary(dictionary, str);
        print(dictionary);
    }

    public static void print(HashMap<String, Integer> dictionary) {
        for (String word : dictionary.keySet()) {
            System.out.println(word + ": " + dictionary.get(word));
        }
    }

    public static void fillDictionary(HashMap<String, Integer> dictionary, String str) {
        if (str.length() != 0) {
            String[] words = str.split("[, !?.@]+");
            for (String word : words) {
                if (!dictionary.containsKey(word.toLowerCase())) {
                    dictionary.put(word.toLowerCase(), 0);
                }
                dictionary.put(word.toLowerCase(), dictionary.get(word.toLowerCase()) + 1);
            }
        }
    }
}
