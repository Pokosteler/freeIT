package lesson7.robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand() {
        this.price = 5;
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
