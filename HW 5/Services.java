// Class to create objects with the attributes of numberOfHours and ratePerHour
import java.text.DecimalFormat;

public class Services {
    private double numberOfHours;
    private double ratePerHour;

    public Services() { // Default Constructor
        numberOfHours = 1;
        ratePerHour = 1;
    }

    public Services(double numberOfHours, double ratePerHour) { // Non-Default Constructor
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    public void setNumberOfHours(double numberOfHours) { // Setter for numberOfHours
        this.numberOfHours = numberOfHours;
    }

    public double numberOfHours() { // Getter for numberOfHours
        return numberOfHours;
    }

    public void setRatePerHour(double ratePerHour) { // Setter for ratePerHour
        this.ratePerHour = ratePerHour;
    }

    public double ratePerHour() { // Getter for ratePerHour
        return ratePerHour;
    }

    public double calculateSales() { // Calculates cost
        return (numberOfHours * ratePerHour);
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat(".00");
        return ("The cost for services is: " + df.format(calculateSales()));
    }
}