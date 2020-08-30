package lesson7.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand() {
        this.price = 4;
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
