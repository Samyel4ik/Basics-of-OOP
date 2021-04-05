package Task6;


import java.util.List;

public class Gift {
    List<Sweetness> sweetnesses;
    Packaging packaging;

    public Gift(List<Sweetness> sweetnesses, Packaging packaging) {
        this.sweetnesses = sweetnesses;
        this.packaging = packaging;
    }

    public void addSweetnees(Sweetness sweetness) {
        this.sweetnesses.add(sweetness);

    }

    public int costOfSweets() {
        int costOfSweets = 0;

        for (Sweetness sweetness : this.sweetnesses) {
            costOfSweets += sweetness.getPrise();
        }
        return costOfSweets;
    }

    public int getTotalPrise() {
        return costOfSweets() + this.packaging.getPrice();
    }

    public int getTotalCalories() {
        int calories = 0;
        for (Sweetness sweetness:this.sweetnesses ) {
            calories +=sweetness.getCalories();
        }
        return calories;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "sweetnesses=" + sweetnesses +
                ", packaging=" + packaging +
                '}';
    }
}
