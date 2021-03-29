package Task5;

public class Packaging {
    int number;
    String color;
    String material;
    int pricePackaging;

    public Packaging(int number, String material, String color, int pricePackaging) {
        this.number = number;
        this.material = material;
        this.color = color;
        this.pricePackaging = pricePackaging;
    }


    public int getPricePackaging() {
        return pricePackaging;
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "number=" + number +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", pricePackaging=" + pricePackaging +
                '}';
    }
}
