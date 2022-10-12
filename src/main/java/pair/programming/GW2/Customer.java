package pair.programming.GW2;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private ShoppingCart cart = new ShoppingCart();

    public Customer(){

    }
    public Customer(String customerName){
        name = customerName;
    }

    public void addToCart(Item item){
        cart.addItem(item);

    }

    public void removeFromCart(int indexOfItem){
        cart.removeItem(indexOfItem);
    }



}
