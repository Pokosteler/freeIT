package lesson10.jbchapter3.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.
public class Task31 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        System.out.println("All marks: " + fillArrayRandom(marks));
        System.out.println("Max mark: " + findMaxMark(marks));
    }

    public static List<Integer> fillArrayRandom(List<Integer> array) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(11));
        }
        return array;
    }

    public static Integer findMaxMark(List<Integer> array) {
        Iterator<Integer> it = array.iterator();
        Integer max = null;
        while (it.hasNext()) {
            if (max == null) {
                max = it.next();
            } else {
                Integer e = it.next();
                if (e.compareTo(max) > 0) {
                    max = e;
                }
            }
        }
        return max;
    }
}
