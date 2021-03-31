package Task6;

public class Packaging {

    String name;
    int pricePackaging;

    public Packaging(String name, int pricePackaging) {
        this.pricePackaging = pricePackaging;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getPricePackaging() {
        return pricePackaging;
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "name='" + name + '\'' +
                ", pricePackaging=" + pricePackaging +
                '}';
    }
}
