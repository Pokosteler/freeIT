package lesson3.homework_1;

// Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?
public class homework_1 {
    public static void main(String[] args) {
        double distance[] = new double[7];
        distance[0] = 10;
        double totalDistance = distance[0];
        System.out.print("1 day: " + distance[0] + " km\n");
        for (int i = 1; i < distance.length; i++) {
            distance[i] = distance[i - 1] + 0.1 * distance[i - 1];
            totalDistance += distance[i];
            System.out.print(i + 1 + " day: " + distance[i] + " km\n");
        }
        System.out.println("\nTotal distance in seven days: " + totalDistance + " km");
    }
}