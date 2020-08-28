package lesson7.person.jackets;

public class ZaraJacket implements IJacket {
    @Override
    public void dressUp() {
        System.out.println("Надеть куртку Zara");
    }

    @Override
    public void undress() {
        System.out.println("Снять куртку Zara");
    }
}
