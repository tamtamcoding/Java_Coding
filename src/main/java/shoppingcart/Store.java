package shoppingcart;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Store extends Item {
    private Customer customer;
    private Cashier cashier;
    private List<Item> storeItems = new ArrayList<>();
    private static String receiptHeaderTxt;
    private ShoppingCart getCart = new ShoppingCart();

    public Store() {

    }

    public Store(Customer customer, Cashier cashier) {
        this.customer = customer;
        this.cashier = cashier;
    }

    public void printStoreItems() {
        storeItems.forEach(item -> System.out.println("[" + storeItems.indexOf(item) + "] " + item));
    }

    public void readStoreItemsFromFile(String fileName) {

        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String readRows = br.readLine();
            while (readRows != null) {
                String[] rowValues = readRows.split(",");
                String itemName = rowValues[0];
                double itemPrice = Double.parseDouble(rowValues[1]);

                Item saveFileItems = new Item(itemName, itemPrice);
                storeItems.add(saveFileItems);
                readRows = br.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error with loading the CSV file with error message: " + e.getMessage());
        }
    }

    public void printReceipt(Cashier cashier) {
        String receipt = String.format("%35s", "RECEIPT");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();

        receiptHeaderTxt = "---------------------------------------------------------------\n" + receipt
                + "\n---------------------------------------------------------------"
                + "\nCashier: " + cashier.getName() + "\tShift: " + cashier.getStartOfShift() + " - " + cashier.getEndOfShift()
                + "\nDate: " + dtf.format(now)
                + "\n---------------------------------------------------------------"
                + "\nItems:\n";
        System.out.println(receiptHeaderTxt);
    }

    public void saveReceiptToFile(String fileName) {
        try {

            File receipt = new File(fileName);
            PrintWriter writer = new PrintWriter(receipt);

            writer.write(receiptHeaderTxt);
            writer.printf("%-10s %15s %-10s %-12s%n","Item name","Qty","Price","Total Price");

            getCart.forReceipt.forEach(item -> writer.println(item.toString()));
            writer.println("---------------------------------------------------------------");
            writer.println("TOTAL:\t" + getCart.getTotalOfCart());
            writer.println("---------------------------------------------------------------");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public List<Item> getStoreItems() {
        return storeItems;
    }

    public void setStoreItems(List<Item> storeItems) {
        this.storeItems = storeItems;
    }

    public int getListLength() {
        int listSize = this.storeItems.size() - 1;
        return listSize;
    }


    public Item addThisItem(int indexOfItem) {
        String itemName = storeItems.get(indexOfItem).getItemName();
        Double itemPrice = storeItems.get(indexOfItem).getPrice();
        Item addThisItem = new Item(itemName, itemPrice);

        return addThisItem;
    }

}
