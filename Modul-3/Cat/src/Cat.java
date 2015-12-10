public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;
    public static Integer catCount = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        catCount++;

    }

// Урок 3.3
    public double food() //сколько сьел котик
    {
        double amount = 0;
        if (originWeight < weight){
            amount = weight - originWeight;
        }
        return amount;
    }

    public void wc() // котики идут в туалет
    {
        weight = weight - 10;
        System.out.println("Puk, puk...");

    }

// Урок 3.5 Создаем конструктор чтобы самим задавать вес котика
    public Cat(Double weight)
    {
        this();     //Конструктор использет this() чтобы сослаться на другой конструктор в этом же классе
        this.weight = weight;
        this.originWeight = weight;

    }

// Урок 3.6 конструктор для создания копии котика
    public Cat(Cat cat)
    {
        this.weight = cat.weight;
        this.originWeight = cat.weight;
        this.minWeight = cat.minWeight;
        this.maxWeight = cat.maxWeight;
        catCount++;
    }

//создаем метод для копирования котика
    public static Cat createTwin(Cat cat)
    {
        cat = new Cat(cat); //создаем близница котика с помощью конструктора
        return cat;
    }

// метод для копирования веса котика
    public void setWeight(Double weight)
    {
        this.weight = weight;
        this.originWeight = weight;
    }

// метод нахождения разниы в весе между котками
    public static double getWeightDifference(Cat cat1, Cat cat2)
    {
        double difference = Math.abs(cat1.getWeight() - cat2.getWeight());

        return difference;
    }

// методы именения веса без учета количесва котиков
    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");

    }

    public void meow(Double weaght)
    {
        this.weight = this.weight - weaght;
        System.out.println("Meow");

    }

    public void feed(Double amount)
    {
        weight = weight + amount;

    }

    public void drink(Double amount)
    {
        weight = weight + amount;

    }

//Урок 3.4
    public static int getCount() // сколько созданно котиков
    {
        return catCount;
    }

// Функции изменения веса с условием меньшения количества котов

    public void wcCatCount() // котики идут в туалет
    {
        weight = weight - 10;
        System.out.println("Puk, puk...");
        if(weight < minWeight) { //Котик помер от даиреи, хороним котика
            catCount--;
        }
    }

    public void meowCatCount()
    {
        weight = weight - 1;
        System.out.println("Meow");
        if(weight < minWeight) { //Котик домяукался хороним котика
            catCount--;
        }
    }

    public void meowCatCount(Double weaght)
    {
        this.weight = this.weight - weaght;
        System.out.println("Meow");

        if(weight < minWeight) { //Котик домяукался хороним котика
            catCount--;
        }
    }

    public void drinkCatCount(Double amount)
    {
        weight = weight + amount;
        if(weight > maxWeight) {
            catCount--;              // котик взорвался уменьшаем хороним котика
        }
    }

    public void feedCatCount(Double amount)
    {
        weight = weight + amount;

        if(weight > maxWeight) {// котик взорвался уменьшаем количество
            catCount--;
        }

    }
//----------------------------------------------

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
           return "Dead";

        }
        else if(weight > maxWeight) {
             return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

 // созаднем катёнка
    public static Cat getKitten()
    {
        double weigth= 100.0 + 200.0 * Math.random();
        Cat cat = new Cat(weigth);
        return cat;
    }


}