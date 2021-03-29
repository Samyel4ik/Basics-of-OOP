package Task5;

import java.util.Arrays;

public class Packages {
    Packaging[] packagings;

    public void setPackages(Packaging[] packagings) {
        this.packagings = packagings;
    }

    public Packaging choiceOfPackaging(int number) {
        return this.packagings[number - 1];
    }


    @Override
    public String toString() {
        return "Packages{" +
                "packagings=" + Arrays.toString(packagings) +
                '}';
    }
}
