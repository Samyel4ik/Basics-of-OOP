package Task4;

public class Prise {
    int priseTreasure;

    public Prise(int prise) {
        this.priseTreasure = prise;
    }

    public int getPriseTreasure() {
        return priseTreasure;
    }

    @Override
    public String toString() {
        return "Prise{" +
                "prise=" + priseTreasure +
                '}';
    }
}
