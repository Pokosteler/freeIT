package lesson7.person.trousers;

public class ColinsTrousers implements ITrousers {
    @Override
    public void dressUp() {
        System.out.println("Надеть штаны Colins");
    }

    @Override
    public void undress() {
        System.out.println("Снять штаны Colins");
    }
}
