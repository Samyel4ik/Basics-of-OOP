package Task5;

public class FlowerComposition {
    Flower flower;
    Packaging packaging;
    int numberOfFlowers;


    public void setFlowerComposition(Flower flower, Packaging packaging, int numberOfFlowers) {
        this.flower = flower;
        this.packaging = packaging;
        this.numberOfFlowers = numberOfFlowers;

    }


    @Override
    public String toString() {
        return "FlowerComposition{" +
                "flowerName='" + flower + '\'' +
                ", packaging='" + packaging + '\'' +
                '}';
    }
}
