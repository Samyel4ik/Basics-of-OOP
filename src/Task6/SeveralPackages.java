package Task6;

import java.util.Arrays;

public class SeveralPackages {
    Packaging[] packagings;

    public void setSeveralPackages(Packaging[] packagings) {
        this.packagings = packagings;
    }

    public Packaging selectedPackaging(String str) {
        Packaging packaging = null;
        for (int i = 0; i < this.packagings.length; i++) {
            if (str.equalsIgnoreCase(this.packagings[i].getName())) {
                packaging = this.packagings[i];
            }
        }
        return packaging;
    }

    public String[] arrayOfPackages() {
        String[] array = new String[this.packagings.length];

        for (int i = 0; i < this.packagings.length; i++) {
            array[i] = this.packagings[i].getName();
        }
        return array;
    }

    @Override
    public String toString() {
        return "SeveralPackages{" +
                "packagings=" + Arrays.toString(packagings) +
                '}';
    }
}
