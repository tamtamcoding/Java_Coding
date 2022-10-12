package pair.programming.GW2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int function = 1;
        int chosenItem;
        Scanner scan = new Scanner(System.in);
        Store myStore = new Store();
        Item item = new Item();
        ShoppingCart cart = new ShoppingCart();

        Cashier cashier = new Cashier("John", LocalTime.of(8, 00), LocalTime.of(18, 00));
        Customer customer = new Customer("Ella");
        Store setCashierAndCustomer = new Store(customer, cashier);

        myStore.readStoreItemsFromFile("C:\\Users\\rustam.arifin\\IdeaProjects\\FY22.53\\src\\main\\java\\pair\\programming\\GW2\\GW2.csv");


        while (function != 0) {
            try {
                System.out.println("---------------------------------------------------------------" +
                        "\nPress [1] Add Item | [2] Remove Item | [3] Checkout | [0] Exit" +
                        "\n---------------------------------------------------------------");
                function = scan.nextInt();

                switch (function) {
                    case 1:
                        try {

                            System.out.println("Store Items\n---------------------------------------------------------------");
                            myStore.printStoreItems();

                            System.out.println("---------------------------------------------------------------");


                            System.out.print("[0] - [" + myStore.getListLength() + "] to select items\nSelect items to add: ");
                            chosenItem = scan.nextInt();
                            System.out.println();

                            Item addItemToCart = myStore.addThisItem(chosenItem);
                            cart.addItem(addItemToCart);

                            System.out.println("---------------------------------------------------------------\nCart Items\n---------------------------------------------------------------");
                            cart.getItemsInCart();
                            System.out.println();


                        } catch (InputMismatchException e) {
                            System.out.println("Input error! Kindly enter numbers only.");
                        }
                        break;

                    case 2:
                        try {
                            if (cart.getShoppingCartItems() == false) {
                                System.out.println("---------------------------------------------------------------\nCart Items\n---------------------------------------------------------------");
                                cart.getItemsInCart();
                                System.out.print("Select item to remove: ");
                                chosenItem = scan.nextInt();
                                System.out.println();
                                cart.removeItem(chosenItem);

                                System.out.println("---------------------------------------------------------------\nCart Items\n---------------------------------------------------------------");
                                cart.getItemsInCart();
                                System.out.println();


                            } else {
                                System.out.println();
                                System.out.println("Cart is empty. No items to remove.");
                            }


                        } catch (InputMismatchException e) {
                            System.out.println("Input error! Kindly enter numbers only.");
                        }

                        break;
                    case 3:
                        if (cart.getShoppingCartItems() == false) {
                            myStore.printReceipt(cashier);
                            cart.receiptBody();
                            myStore.saveReceiptToFile("C:\\Users\\rustam.arifin\\IdeaProjects\\FY22.53\\src\\main\\java\\pair\\programming\\GW2\\receipt.txt");
                            System.exit(0);
                        } else {
                            System.out.println("No items inside cart.");
                        }
                        break;
                    case 0:
                        System.out.println("Will now exit the application. Thank you!");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter from the given choices only.");
                scan.next();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid Item Key");
            }
        }


    }

}

