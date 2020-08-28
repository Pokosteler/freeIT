package lesson7.person;

import lesson7.person.jackets.IJacket;
import lesson7.person.shoes.IShoe;
import lesson7.person.trousers.ITrousers;

public class Person implements IPerson {
    private String name;
    private IJacket jacket;
    private IShoe shoe;
    private ITrousers trousers;

    public Person(String name, IJacket jacket, IShoe shoe, ITrousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoe = shoe;
        this.trousers = trousers;
    }

    @Override
    public void dressUp() {
        jacket.dressUp();
        shoe.dressUp();
        trousers.dressUp();
    }

    @Override
    public void undress() {
        jacket.undress();
        shoe.undress();
        trousers.undress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IShoe getShoe() {
        return shoe;
    }

    public void setShoe(IShoe shoe) {
        this.shoe = shoe;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }
}
