package lesson7.person.shoes;

public class StradivariusShoe implements IShoe{
    @Override
    public void dressUp() {
        System.out.println("Надеть обувь Stradivarius");
    }

    @Override
    public void undress() {
        System.out.println("Снять обувь Stradivarius");
    }
}
