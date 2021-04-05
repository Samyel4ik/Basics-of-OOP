package Task6;

import java.util.ArrayList;


public class Supermarket {
    ArrayList<Sweetness> sweetnessArray;
    ArrayList<Packaging> packagingArray;

    public void setSupermarket(ArrayList<Sweetness> sweetnessArray, ArrayList<Packaging> packagingArray) {
        this.sweetnessArray = sweetnessArray;
        this.packagingArray = packagingArray;
    }


    public String[] getSweetnessList() {
        String[] strings = new String[this.sweetnessArray.size()];

        for (int i = 0; i < this.sweetnessArray.size(); i++) {
            strings[i] = this.sweetnessArray.get(i).getName();
        }
        return strings;
    }

    public Sweetness purchaseSweetnees(String str) {
        Sweetness sweetness = null;

        for (int i = 0; i < this.sweetnessArray.size(); i++) {
            if (str.equalsIgnoreCase(this.sweetnessArray.get(i).getName())) {
                sweetness = this.sweetnessArray.get(i);
            }
        }
        return sweetness;
    }

    public String[] getPackagingList() {
        String[] strings = new String[this.packagingArray.size()];

        for (int i = 0; i < this.packagingArray.size(); i++) {
            strings[i] = this.packagingArray.get(i).getNamePackaging();
        }
        return strings;
    }

    public Packaging purchasePackaging(String str) {
        Packaging packaging = null;

        for (int i = 0; i < this.packagingArray.size(); i++) {
            if (str.equalsIgnoreCase(this.packagingArray.get(i).getNamePackaging()))
                packaging = this.packagingArray.get(i);
        }
        return packaging;
    }

    public ArrayList<Sweetness> getSweetnessArray() {
        return sweetnessArray;
    }

    public ArrayList<Packaging> getPackagingArray() {
        return packagingArray;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "sweetnessArray=" + sweetnessArray +
                ", packagingArray=" + packagingArray +
                '}';
    }
}
