package Task6;

public class Sweetness {
    String name;
    int sweetPrice;

    public Sweetness(String name, int sweetPrice) {
        this.name = name;
        this.sweetPrice = sweetPrice;
    }

    public String getName() {
        return name;
    }

    public int getSweetPrice() {
        return sweetPrice;
    }

    @Override
    public String toString() {
        return "Sweetness{" +
                "name='" + name + '\'' +
                ", sweetPrice=" + sweetPrice +
                '}';
    }
}
