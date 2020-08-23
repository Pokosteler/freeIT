package lesson7.javaBeginnerChapter2.task27;

public class MasterCard extends CreditCard implements Configuration {
    public MasterCard(String name) {
        super(name);
    }

    @Override
    public void cardBlocking(Boolean block) {
        if (block == true) {
            System.out.println("Владелец заблокировал свою карту MasterCard");
        } else {
            System.out.println("Владелец разлокировал свою карту MasterCard");
        }
    }
}