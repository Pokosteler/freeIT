package lesson7.cosmodrome;

public class SpaceX implements IStart {
    @Override
    public Boolean systemsCheck() {
        int check = (int) (Math.random() * 8 + 4);
        return check > 10;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
