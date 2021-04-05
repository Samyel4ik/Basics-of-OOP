package Task6;

public class Packaging {

    String namePackaging;
    int pricePackaging;

    public Packaging(String namePackaging, int pricePackaging) {
        this.pricePackaging = pricePackaging;
        this.namePackaging = namePackaging;

    }

    public int getPricePackaging() {
        return pricePackaging;
    }

    public String getNamePackaging() {
        return namePackaging;
    }


    @Override
    public String toString() {
        return "Packaging{" +
                "namePackaging='" + namePackaging + '\'' +
                ", pricePackaging=" + pricePackaging +
                '}';
    }
}
