package Task1;

public class Directory {
    String location;

    public Directory(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "location='" + location + '\'' +
                '}';
    }
}
