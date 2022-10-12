package shoppingcart;

public class Item {
    private String itemName;
    private double price;

    public Item(){

    }

    @Override
    public String toString() {

        //String format = "%-20s %5d\n";
        String printItems = String.format("%-20s %-20s",itemName,price);
        return printItems;
    }

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName() {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
