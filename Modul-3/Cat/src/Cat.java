
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

    //Урок 3.4
    public static int getCount() // сколько созданно котиков
    {
        return catCount;
    }

     // Урок 3.5 Создаем конструктор чтобы самим задавать вес котика
    public Cat(Double weight)
    {
        this.weight = weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        catCount++;
    }

    // Урок 3.6 конструктор для создания копии котика
    public Cat(Cat cat)
    {
        this.weight = cat.weight;
        this.originWeight = cat.weight;
        this.minWeight = 1000.0;
        this.maxWeight = 9000.0;
        catCount++;
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



    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            catCount--;              // уменьшаем котиков
            return "Dead";

        }
        else if(weight > maxWeight) {
            catCount--;              // котик взорвался уменьшаем количество
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}