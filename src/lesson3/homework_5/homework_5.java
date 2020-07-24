package lesson3.homework_5;

// Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
// для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class homework_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " inch(es)\t" + i * 2.54 + " cm");
        }
    }
}