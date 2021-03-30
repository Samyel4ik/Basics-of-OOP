package Task4;

public class Treasure {
    Color color;
    Prise prise;

    public Treasure(Color color, Prise prise) {
        this.color = color;
        this.prise = prise;
    }

    public Prise getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "color=" + color +
                ", prise=" + prise +
                '}';
    }
}
