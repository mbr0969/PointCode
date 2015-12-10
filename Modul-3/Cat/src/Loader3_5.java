/**
 * Created by papa on 24.11.15.
 */
public class Loader3_5 {
    public static void main(String[] args)
    {

        // Урок 3.5 делаем котика и задем его вес.
        Cat murzik = new Cat(2000.0);
              //делем катенка
        Cat kitten = getKitten();
              //выводим вес кота и котика
        System.out.println("Вес нашего котка " + murzik.getWeight());
        System.out.println("Котенок весит " + kitten.getWeight());

        System.out.println("Количество котиков " + Cat.catCount);
    }
              //медот создающий  маленького котенка
public static Cat getKitten()
    {
        double weigth= 100.0 + 200.0 * Math.random();
        Cat cat = new Cat(weigth);
        return cat;
    }

}
