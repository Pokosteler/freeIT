package lesson7.robot.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg() {
        this.price = 7;
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
