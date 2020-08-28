package lesson7.cosmodrome;

public class Cosmodrome {
    public void launch(IStart start) {
        if (start.systemsCheck()) {
            start.engineStart();
            System.out.println("10 ..... 1");
            start.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }
}
