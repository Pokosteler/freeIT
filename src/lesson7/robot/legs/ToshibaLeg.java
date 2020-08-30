package lesson7.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg() {
        this.price = 3;
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
