package lesson12.jbchapter3.task34;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.
public class Task34 {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader
                ("freeIT/src/lesson12/jbchapter3/task34/File.txt")) {
            int result = fileReader.read();
            StringBuilder textFromFile = new StringBuilder();
            while (result != -1) {
                textFromFile.append((char) result);
                result = fileReader.read();
            }
            fileReader.close();
            int amount = 0;
            Set<Integer> withoutRepeatNumbers = new HashSet<>();
            Pattern p = Pattern.compile("[0-9]+");
            Matcher m = p.matcher(textFromFile.toString());
            while (m.find()) {
                System.out.print(m.group() + " ");
                amount += Integer.parseInt(m.group());
                withoutRepeatNumbers.add(Integer.valueOf(m.group()));
            }
            System.out.println("\nAmount: " + amount);
            System.out.println(withoutRepeatNumbers.toString());
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        }
    }
}
