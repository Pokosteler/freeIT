package lesson7.javaBeginnerChapter2.task27;

//Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.
public class Task27 {
    public static void main(String[] args) {
        Visa visa = new Visa("Ivanov Ivan");
        visa.cardBlocking(true);
        MasterCard masterCard = new MasterCard("Petrov Petr");
        masterCard.cardBlocking(false);
    }
}