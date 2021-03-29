package Task5;

import java.util.Arrays;

public class Flowers {
    Flower[] flowerNames;

    public void setFlowers(Flower[] flowerNames) {
        this.flowerNames = flowerNames;
    }

    public Flower choiceOfFlower(int number) {
        return this.flowerNames[number - 1];
    }


    @Override
    public String toString() {
        return "Flowers{" +
                "flowerNames=" + Arrays.toString(flowerNames) +
                '}';
    }
}
