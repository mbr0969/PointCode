
public class Loader
{
    public static void main(String[] args)
    {

        // Урок 3.2
        Cat murzik = new Cat();
        System.out.println("murzik " + murzik.getStatus());

        Cat vasjka = new Cat();
        System.out.println("vasjka " + vasjka.getStatus());

        Cat barsik = new Cat();
        System.out.println("barsik " + barsik.getStatus());

        Cat murka = new Cat();
        System.out.println("murka " + murka.getStatus());

        Cat musja = new Cat();
        System.out.println("musja " + musja.getStatus());


        // кормим Мурзика...
            System.out.println("murzik feed... ");
        for (int i = 0; i < 10000; i++)
        {
            murzik.feed(3.0);
        }


        // поим ваську
            System.out.println("vasjka drinking...");
        for (int i = 0; i < 100; i++)
        {
             vasjka.drink(1.0);
        }


        //Барсик мяукает
            System.out.println("barsik meow...");

        for (int i = 0; i < 100000; i++)
        {
              barsik.meow();
        }
        System.out.println();

        // что с котами???
        System.out.println("vasjka "  + vasjka.getStatus());
        System.out.println("murzik " + murzik.getStatus());
        System.out.println("barsik " + barsik.getStatus());
        System.out.println();

        // сколько весят котики
        System.out.println("vasika weight  " + vasjka.getWeight());
        System.out.println("murzik weight  " + murzik.getWeight());
        System.out.println("barsik weight  " + barsik.getWeight());
        System.out.println("murka weight  " + murka.getWeight());
        System.out.println("musja weight  " + musja.getWeight());

             //Урок 3.3
        //сколько съел мурзик
        System.out.println();
        System.out.println("murzik's food is  " + murzik.food());
        System.out.println();

        //васька идет в туалет.
        System.out.println("vasika going to WC with weight " + vasjka.getWeight());
        for (int i = 0; i < 10; i++ )
        {
            vasjka.wc();

        }
        System.out.println("vasika weight  " + vasjka.getWeight());
        System.out.println();

        // узанетм разницу в весе котиков
        System.out.println(murka.getWeight());
        System.out.println(musja.getWeight());
        System.out.println("difference = " + Cat.getWeightDifference( murka, musja));


    }
}