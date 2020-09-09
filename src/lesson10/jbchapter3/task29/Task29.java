package lesson10.jbchapter3.task29;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.
public class Task29 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        System.out.println("All marks: " + fillArrayRandom(marks));
        System.out.println("Satisfactory ratings: " + deleteNegativeMarks(marks));
    }

    public static List<Integer> fillArrayRandom(List<Integer> array) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(11));
        }
        return array;
    }

    public static List<Integer> deleteNegativeMarks(List<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < 6) {
                array.remove(array.get(i));
            }
        }
        return array;
    }
}