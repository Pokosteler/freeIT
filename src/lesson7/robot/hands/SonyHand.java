package lesson7.robot.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand() {
        this.price = 6;
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
