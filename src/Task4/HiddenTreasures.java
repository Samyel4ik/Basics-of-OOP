package Task4;

import java.util.Arrays;

public class HiddenTreasures {
    Treasure [] treasures;

    public HiddenTreasures (Treasure [] treasures){
        this.treasures = treasures;

    }

    @Override
    public String toString() {
        return "HiddenTreasures{" +
                "treasures=" + Arrays.toString(treasures) +
                '}';
    }
}
