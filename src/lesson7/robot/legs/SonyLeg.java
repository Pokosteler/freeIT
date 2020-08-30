package lesson7.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg() {
        this.price = 4;
    }

    @Override
    public void step() {
        System.out.println("Нога Sony делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
