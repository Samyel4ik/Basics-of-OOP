package Task6;

public class Sweetness {
    String name;
    int calories;
    int prise;


    public Sweetness(String name, int calories, int prise) {
        this.name = name;
        this.prise = prise;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public int getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "Sweetness{" +
                "name='" + name + '\'' +

                '}';
    }
}
