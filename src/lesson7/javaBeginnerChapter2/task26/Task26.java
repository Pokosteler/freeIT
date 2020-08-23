package lesson7.javaBeginnerChapter2.task26;

//Создать иерархию классов, описывающих бытовую технику. Создать несколько
//объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.
public class Task26 {
    public static void main(String[] args) {
        Сookstove cookstove = new Сookstove("Gefest");
        cookstove.turn(true);
        ElectricKettle electricKettle = new ElectricKettle("Bosch");
        electricKettle.turn(false);
    }
}