/**
 * Created by papa on 25.11.15.
 */
public class Loader3_6 {
    public static void main(String[] args) {
               //Урок 3.6
        Cat murzik = new Cat();
        Cat barsik = murzik.createTwin(murzik); //клонируем из мурзика  браскиа

        System.out.println("Вес Мурзика " + murzik.getWeight());
        System.out.println("Вес Барсика " + barsik.getWeight());
        System.out.println("Количество котиков " + Cat.getCount());
        System.out.println();
           //кормим Мурзика на убой для проверки
        murzik.feedCatCount(12000.0);
        System.out.println("Кормим Мурзика на убой...");
        System.out.println("Мурзик - " + murzik.getStatus());
        System.out.println("Барсик - " + barsik.getStatus());
        System.out.println();
        System.out.println("Вес Мурзика " + murzik.getWeight());
        System.out.println("Вес Барсика " + barsik.getWeight());
        System.out.println("Количество котиков " + Cat.getCount());

    }

}
