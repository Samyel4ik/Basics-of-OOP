package Task6;

public class Packaging {

    String name;
    int price;

    public Packaging(String namePackaging, int pricePackaging) {
        this.price = pricePackaging;
        this.name = namePackaging;

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Packaging{" +
                "namePackaging='" + name + '\'' +
                ", pricePackaging=" + price +
                '}';
    }
}
