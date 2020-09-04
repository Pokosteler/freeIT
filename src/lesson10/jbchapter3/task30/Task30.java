package lesson10.jbchapter3.task30;

import java.util.*;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
public class Task30 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        System.out.println("Random numbers: " + fillArrayRandom(array));
        System.out.println("Random numbers without repeat: " + deleteRepeatItems(array));
    }

    public static List<Integer> fillArrayRandom(List<Integer> array) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(10));
        }
        return array;
    }

    public static Collection<Integer> deleteRepeatItems(Collection<Integer> array) {
        return new HashSet<Integer>(array);
    }
}
