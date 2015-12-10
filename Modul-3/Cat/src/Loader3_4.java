/**
 * Created by papa on 24.11.15.
 */
public class Loader3_4 {
    public static void main(String[] args) {

          //Урок 3.4
        Cat murzik = new Cat();
        Cat barsik = new Cat();

        System.out.println("Количество котов = " + Cat.getCount() );

        System.out.println("Мурзик кушает на убой");

        for (int i = 0; i < 100000; i++)
        {
            murzik.feed(10.0);
        }
        System.out.println("Myрзик - " + murzik.getStatus());

        System.out.println("Количество котов = " + Cat.getCount() );



    }
}
