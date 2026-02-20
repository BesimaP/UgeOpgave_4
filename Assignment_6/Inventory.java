import java.awt.*;
import java.util.ArrayList;

    public class Inventory {
        String playerName;
        ArrayList<Item>items = new ArrayList<>();
        int maxCapacity;

        public Inventory(String name, int maxCapacity){
            this.playerName = playerName;
            this.maxCapacity = maxCapacity;
            this.items = new ArrayList<>();
        }
    }
