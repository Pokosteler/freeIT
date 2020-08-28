package lesson7.cosmodrome;

public class Vostok1 implements IStart {
    @Override
    public Boolean systemsCheck() {
        int check = (int) (Math.random() * 15 + 4);
        if (check > 13) {
            return true;
        }
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Восток-1 запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Восток-1");
    }
}
