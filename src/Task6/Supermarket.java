package Task6;

import java.util.ArrayList;
import java.util.List;


public class Supermarket {
    List<Sweetness> sweetnesses;
    List<Packaging> packagings;

    public void setSweetnesses(List<Sweetness> sweetnesses) {
        this.sweetnesses = sweetnesses;
    }

    public void setPackagings(List<Packaging> packagings) {
        this.packagings = packagings;
    }

    public Packaging purchasePackaging(String str) {
        Packaging packaging = null;

        for (int i = 0; i < this.packagings.size(); i++) {
            if (str.equalsIgnoreCase(this.packagings.get(i).getName())) {
                packaging = this.packagings.get(i);
            }
        }
        return packaging;
    }

    public Sweetness purchaseSweetnees(String str) {
        Sweetness sweetness = null;

        for (int i = 0; i < this.sweetnesses.size(); i++) {
            if (str.equalsIgnoreCase(this.sweetnesses.get(i).getName())) {
                sweetness = this.sweetnesses.get(i);
            }
        }
        return sweetness;
    }

    public List<String> getPackagingList() {
        List<String> names = new ArrayList<>();

        for (Packaging packaging : this.packagings) {
            names.add(packaging.getName());
        }
        return names;
    }

    public List<String> getSweetnessList() {
        List<String> names = new ArrayList<>();

        for (Sweetness sweetness : this.sweetnesses) {
            names.add(sweetness.getName());
        }
        return names;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "sweetness=" + sweetnesses +
                ", packaging=" + packagings +
                '}';
    }
}
