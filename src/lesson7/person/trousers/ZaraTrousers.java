package lesson7.person.trousers;

public class ZaraTrousers implements ITrousers {
    @Override
    public void dressUp() {
        System.out.println("Надеть штаны Zara");
    }

    @Override
    public void undress() {
        System.out.println("Снять штаны Zara");
    }
}
