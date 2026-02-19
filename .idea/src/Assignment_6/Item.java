package Assignment_6;

    public class Item {
        String name;
        int value;
        String type;
        int totalItemsCreated = 0;

        public Item(String name, int value, String type) {
            this.name = name;
            this.value = value;
            this.type = type;
            this.totalItemsCreated = totalItemsCreated +1;
        }
    }
