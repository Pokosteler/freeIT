package lesson7.javaBeginnerChapter2.task27;

public class Visa extends CashCard implements Configuration {
    public Visa(String name) {
        super(name);
    }

    @Override
    public void cardBlocking(Boolean block) {
        if (block) {
            System.out.println("Владелец заблокировал свою карту Visa");
        } else {
            System.out.println("Владелец разлокировал свою карту Visa");
        }
    }
}