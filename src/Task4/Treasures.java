package Task4;


import java.util.Arrays;

public class Treasures {
    Treasure[] treasure;

    public void setTreasures(Treasure[] treasure) {
        this.treasure = treasure;
    }

    public Treasure maxTreasure() {
        int max = this.treasure[0].getPrise().getPriseTreasure();
        Treasure treasure = null;
        for (int i = 0; i < this.treasure.length; i++) {
            if (max < this.treasure[i].getPrise().priseTreasure) {
                max = this.treasure[i].getPrise().priseTreasure;
                treasure = this.treasure[i];
            }
        }
        return treasure;
    }

    public Treasure treasurePrice(int x) {
        Treasure treasure = null;
        for (int i = 0; i < this.treasure.length; i++) {
            if (x == this.treasure[i].getPrise().getPriseTreasure()) {
                treasure = this.treasure[i];
            }
        }
        return treasure;
    }

    @Override
    public String toString() {
        return "Treasures{" +
                "treasure=" + Arrays.toString(treasure) +
                '}';
    }
}
