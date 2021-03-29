package Task5;

public class Flower {
    int number;
    String name;
    int quantity;
    int prise;

    public Flower(int number, String name, int quantity, int prise) {
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.prise = prise;
    }

    public int getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", prise=" + prise +
                '}';
    }

}
