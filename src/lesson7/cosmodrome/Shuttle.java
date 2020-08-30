package lesson7.cosmodrome;

public class Shuttle implements IStart {
    @Override
    public Boolean systemsCheck() {
        int check = (int) (Math.random() * 10);
        return check > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
