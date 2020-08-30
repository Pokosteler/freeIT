package lesson7.person.jackets;

public class StradivariusJacket implements IJacket {
    @Override
    public void dressUp() {
        System.out.println("Надеть куртку Stradivarius");
    }

    @Override
    public void undress() {
        System.out.println("Снять куртку Stradivarius");
    }
}
