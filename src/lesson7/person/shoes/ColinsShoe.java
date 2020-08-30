package lesson7.person.shoes;

public class ColinsShoe implements IShoe{
    @Override
    public void dressUp() {
        System.out.println("Надеть обувь Colin's");
    }

    @Override
    public void undress() {
        System.out.println("Снять обувь Colin's");
    }
}
