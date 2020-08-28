package lesson7.person.jackets;

public class ColinsJacket implements IJacket {
    @Override
    public void dressUp() {
        System.out.println("Надеть куртку Colin's");
    }

    @Override
    public void undress() {
        System.out.println("Снять куртку Colin's");
    }
}
