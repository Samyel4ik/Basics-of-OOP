package Task6;

public class Sweetness {
    String name;
    int calories;


    public Sweetness(String name,  int calories) {
        this.name = name;

        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sweetness{" +
                "name='" + name + '\'' +

                '}';
    }
}
