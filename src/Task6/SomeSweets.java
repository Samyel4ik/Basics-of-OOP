package Task6;

import java.util.Arrays;

public class SomeSweets {
    Sweetness[] sweetnesses;

    public void setSomeSweets(Sweetness[] sweetnesses) {
        this.sweetnesses = sweetnesses;
    }

    public Sweetness chosenSweetness(String str) {
        Sweetness sweetness = null;

        for (int i = 0; i < this.sweetnesses.length; i++) {
            if (str.equalsIgnoreCase(this.sweetnesses[i].getName())) {
                sweetness = this.sweetnesses[i];
            }
        }
        return sweetness;
    }

    public String[] arrayOfSweets() {
        String[] array = new String[this.sweetnesses.length];
        for (int i = 0; i < this.sweetnesses.length; i++) {
            array[i] = this.sweetnesses[i].getName();
        }
        return array;
    }

    @Override
    public String toString() {
        return "SomeSweets{" +
                "sweetnesses=" + Arrays.toString(sweetnesses) +
                '}';
    }
}
