// Class to create objects with the attributes of numberOfItems and pricePerItem
import java.text.DecimalFormat;

public class Supplies extends Account {
    private double numberOfItems;
    private double pricePerItem;

    public Supplies() { // Default Constructor
        numberOfItems = 1;
        pricePerItem = 1;
    }

    public Supplies(double numberOfItems, double pricePerItem, String fullName, int accountNum) { // Non-Default Constructor
        super(fullName, accountNum);
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }

    public void setNumberOfItems(double numberOfItems) { // Setter for numberOfItems
        this.numberOfItems = numberOfItems;
    }

    public double numberOfItems() { // Getter for numberOfItems
        return numberOfItems;
    }

    public void setPricePerItem(double pricePerItem) { // Setter for pricePerItem
        this.pricePerItem = pricePerItem;
    }

    public double pricePerItem() { // Getter for pricePerItem
        return pricePerItem;
    }

    public double calculateSales() { // Calculates cost
        return (numberOfItems * pricePerItem);
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat(".00");
        return(super.toString() + " The cost of the supplies is: " + df.format(calculateSales()));
    }
}