package Task4;

public class Treasure {
    String name;
    String color;
    int weight;
    int price;

    public Treasure (String name,String color, int weight,int price){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
