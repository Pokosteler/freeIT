package lesson3.homework_2;

// Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class homework_2 {
    public static void main(String[] args) {
        int amoebas[] = new int[9];
        amoebas[0] = 1;
        System.out.println(amoebas[0] + " amoeba");
        for (int i = 1; i < amoebas.length; i++) {
            amoebas[i] = amoebas[i - 1] * 2;
            System.out.println("in " + (3 * i) + " hours: " + amoebas[i] + " amoebas");
        }
    }
}