package lesson7.person.shoes;

public class ZaraShoe implements IShoe {
    @Override
    public void dressUp() {
        System.out.println("Надеть обувь Zara");
    }

    @Override
    public void undress() {
        System.out.println("Снять обувь Zara");
    }
}
