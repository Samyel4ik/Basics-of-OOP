package Task5;

public class FlowerComposition {
    Flower flower;
    Packaging packaging;


    public void setFlowerComposition(Flower flower, Packaging packaging) {
        this.flower = flower;
        this.packaging = packaging;

    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "flowerName='" + flower + '\'' +
                ", packaging='" + packaging + '\'' +
                '}';
    }
}
