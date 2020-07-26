package lesson3.Homework2;

// Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class Homework2 {
    public static void main(String[] args) {
        int numberOfAmoebas = 1;
        for (int i = 3; i <= 24; i += 3) {
            numberOfAmoebas = numberOfAmoebas * 2;
            System.out.println("in " + i + " hours: " + numberOfAmoebas + " amoebas");
        }
    }
}