package Task5;

public class Packaging {
    int number;
    String name;
    int pricePackaging;

    public Packaging(int number, String name, int pricePackaging) {
        this.number = number;
        this.name = name;

        this.pricePackaging = pricePackaging;
    }


    public int getPricePackaging() {
        return pricePackaging;
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "number=" + number +

                ", material='" + name + '\'' +
                ", pricePackaging=" + pricePackaging +
                '}';
    }
}
