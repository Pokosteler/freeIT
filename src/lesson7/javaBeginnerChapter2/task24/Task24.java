package lesson7.javaBeginnerChapter2.task24;

//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных.
public class Task24 {
    public static void main(String[] args) {
        Time firstPeriod = new Time(3751);
        Time secondPeriod = new Time(500, 120, 13);
        firstPeriod.printTime();
        secondPeriod.printTime();
        System.out.println(firstPeriod.comparisonOfTwoObjects(secondPeriod));
    }
}