package lesson7.person.trousers;

public class StradivariusTrousers implements ITrousers {
    @Override
    public void dressUp() {
        System.out.println("Надеть штаны Stradivarius");
    }

    @Override
    public void undress() {
        System.out.println("Снять штаны Stradivarius");
    }
}
