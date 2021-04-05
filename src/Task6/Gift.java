package Task6;


import java.util.List;

public class Gift {
    List<Sweetness> list1;
    Packaging packaging;

    public Gift(List<Sweetness> list1, Packaging packaging) {
        this.list1 = list1;
        this.packaging = packaging;
    }

    public void addSweetnees(Sweetness sweetness) {

        this.list1.add(sweetness);

    }

    public int costOfSweets() {
        int t = 0;

        for (int i = 0; i < this.list1.size(); i++) {
            t += this.list1.get(i).getPrise();
        }
        return t;
    }

    public int fullValueOfTheGift() {
        return costOfSweets() + this.packaging.getPricePackaging();
    }

    public int giftCalories() {
        int giftCalories = 0;

        for (int i = 0; i < this.list1.size(); i++) {
            giftCalories += this.list1.get(i).getCalories();
        }
        return giftCalories;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "list1=" + list1 +
                ", packaging=" + packaging +
                '}';
    }
}
