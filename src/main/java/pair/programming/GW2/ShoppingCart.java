package pair.programming.GW2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart extends Item {
    private List<Item> cartItems = new ArrayList<>();
    public static  List<String> forReceipt = new ArrayList<>();
    public static Double totalCart;

    public ShoppingCart(){

    }

   public boolean getShoppingCartItems(){
       return cartItems.isEmpty();
   }
   public void getItemsInCart(){
        cartItems.forEach(item -> System.out.println("[" + cartItems.indexOf(item) + "]" + item));
   }

    public void addItem(Item item){
        cartItems.add(item);
    }

    public void removeItem(int indexOfItem){
        cartItems.remove(indexOfItem);
    }

    public double computeTotalPrice(){
        Double totalPrice = 0.0;
        for (Item cartItem : cartItems) {
            totalPrice += cartItem.getPrice();
        }
        setTotalCart(totalPrice);
        return totalPrice;

    }
    public void receiptBody() {

        //Copying cartItems to map
        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < cartItems.size(); i++) {
            String name = cartItems.get(i).getName();
            Double price = cartItems.get(i).getPrice();
            map.put(name, price);
        }

        ArrayList<String> listOfItemNames = new ArrayList<>();

        for (int i = 0; i < cartItems.size(); i++) {
            String name = cartItems.get(i).getName();

            listOfItemNames.add(name);
        }

        //Creating new map to count quantity of items
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : listOfItemNames) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        //Print receipt's body (With ITEM NAME, QTY, PRICE, & TOTAL PRICE)
        System.out.printf("%-10s %15s %-10s %-12s%n", "Item name", "Qty", "Price", "Total Price");

        for (Map.Entry<String, Integer> entry1 : hm.entrySet()) {
            String key = entry1.getKey();
            Integer value = entry1.getValue();
            Double key2 = map.get(key);

            String name = String.format("%-10s", key);
            String qty = String.format("%10d", value);
            String price = String.format("%10.2f", key2);
            String totalPrice = String.format("%11.2f", (value * key2));

            System.out.println(name + qty + price + totalPrice);
            String addToReceipt = name + qty + price + totalPrice;
            forReceipt.add(addToReceipt);
        }

        //Print total in console

        System.out.println("---------------------------------------------------------------");
        System.out.println("TOTAL:\t" + computeTotalPrice());
        System.out.println("---------------------------------------------------------------");
    }

    public List<Item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<Item> cartItems) {
        this.cartItems = cartItems;
    }

    public static Double getTotalCart() {
        return totalCart;
    }

    public static void setTotalCart(Double totalCart) {
        ShoppingCart.totalCart = totalCart;
    }
}
