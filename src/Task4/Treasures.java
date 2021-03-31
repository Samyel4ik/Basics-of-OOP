package Task4;


import java.util.Arrays;

public class Treasures {
    Treasure[] treasure;

    public void setTreasures(Treasure[] treasure) {
        this.treasure = treasure;
    }

    public Treasure maxTreasure() {
        int max = this.treasure[0].getPrise().getPriseTreasure();
        Treasure treasure = this.treasure[0];
        for (int i = 0; i < this.treasure.length; i++) {
            if (max < this.treasure[i].getPrise().priseTreasure) {
                max = this.treasure[i].getPrise().priseTreasure;
                treasure = this.treasure[i];
            }
        }
        return treasure;
    }


    public int arrayLength(int x) {
        int z = 0;
        int t = 0;
        for (int i = 0; i < this.treasure.length; i++) {
            if (t <= x) {
                t = t + this.treasure[i].getPrise().getPriseTreasure();
                z++;
            }
        }
        return z;
    }

    public Treasure[] treasurePrice(int x) {
        Treasure[] treasure1 = new Treasure[arrayLength(x)];
        int k = 0;
        int a = 0;
        for (int i = 0; i < this.treasure.length; i++) {
            if (k <= x) {
                k = k + this.treasure[i].getPrise().getPriseTreasure();
                treasure1[a] = this.treasure[i];
                a++;
            }
        }
        return treasure1;
    }

    @Override
    public String toString() {
        return "Treasures{" +
                "treasure=" + Arrays.toString(treasure) +
                '}';
    }
}

