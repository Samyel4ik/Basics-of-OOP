package Task6;

public class Gift {
    Sweetness sweetness;
    Packaging packaging;
    int quantityOfSweets;

    public void setGift(Sweetness sweetness, Packaging packaging, int quantityOfSweets) {
        this.sweetness = sweetness;
        this.packaging = packaging;
        this.quantityOfSweets = quantityOfSweets;

    }

    @Override
    public String toString() {
        return "Gift{" +
                "sweetness=" + sweetness +
                ", packaging=" + packaging +
                ", quantityOfSweets=" + quantityOfSweets +
                '}';
    }
}
