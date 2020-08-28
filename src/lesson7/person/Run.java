package lesson7.person;

import lesson7.person.jackets.ColinsJacket;
import lesson7.person.jackets.StradivariusJacket;
import lesson7.person.jackets.ZaraJacket;
import lesson7.person.shoes.ColinsShoe;
import lesson7.person.shoes.StradivariusShoe;
import lesson7.person.shoes.ZaraShoe;
import lesson7.person.trousers.ColinsTrousers;
import lesson7.person.trousers.StradivariusTrousers;
import lesson7.person.trousers.ZaraTrousers;

//По аналогии с первым заданием делаем след. задание.
//Интерфейсы:
//- Куртка
//- Штаны
//- Обувь
//в каждом интерфейсе есть 2 метода (надеть и снять)
//Делаем несколько реализации каждого интерфейса.
//Создаём класс человек:
//У человека поля:
//-имя
//-куртка
//-штаны
//-обувь
//У человека есть 2 метода:
//- одеться(вызываются методы надеть у всех вещей)
//- раздеться (вызываются методы снять у всех вещей)
public class Run {
    public static void main(String[] args) {
        Person person1 = new Person("Nif", new ColinsJacket(), new ZaraShoe(), new StradivariusTrousers());
        Person person2 = new Person("Nuf", new ZaraJacket(), new StradivariusShoe(), new ColinsTrousers());
        Person person3 = new Person("Naf", new StradivariusJacket(), new ColinsShoe(), new ZaraTrousers());
        person1.dressUp();
        person2.undress();
        person3.dressUp();
    }
}
