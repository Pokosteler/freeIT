package lesson7.javaBeginnerChapter2.task26;

public class Сookstove extends LargeAppliance implements Configuration {
    public Сookstove(String name) {
        super(name);
    }

    @Override
    public void turn(Boolean switcher) {
        if (switcher == true) {
            System.out.println("Кухонная плита включена в розетку");
        } else {
            System.out.println("Кухонная плита не включена в розетку");
        }
    }
}