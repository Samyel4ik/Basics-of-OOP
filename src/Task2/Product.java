package Task2;

public class Product {
    String name;
    int theCost;
    int theWeight;


    public Product(String name, int theCost, int theWeight) {
        this.name = name;
        this.theCost = theCost;
        this.theWeight = theWeight;
    }

    public int getTheCost() {
        return theCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", theCost=" + theCost +
                ", theWeight=" + theWeight +
                '}';
    }
}

