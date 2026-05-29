// Route.java
// This class stores the details of one bus route

public class Route {

    // Fields (data) for each route
    String routeNumber;      // e.g., "RT001"
    int passengers;          // number of passengers per day
    double ticketPrice;      // price per ticket in rupees
    double fuelCost;         // daily fuel cost in rupees

    // Constructor - used to create a Route object with all details
    public Route(String routeNumber, int passengers, double ticketPrice, double fuelCost) {
        this.routeNumber = routeNumber;
        this.passengers = passengers;
        this.ticketPrice = ticketPrice;
        this.fuelCost = fuelCost;
    }

    // Method to calculate total revenue earned from this route
    public double calculateRevenue() {
        return passengers * ticketPrice;
    }

    // Method to calculate profit (can be negative = loss)
    public double calculateProfit() {
        return calculateRevenue() - fuelCost;
    }

    // Method to display route details in a formatted way
    public void displayRoute() {
        System.out.println("--------------------------------------------");
        System.out.println("Route Number   : " + routeNumber);
        System.out.println("Passengers     : " + passengers);
        System.out.println("Ticket Price   : Rs. " + ticketPrice);
        System.out.println("Fuel Cost      : Rs. " + fuelCost);
        System.out.printf ("Total Revenue  : Rs. %.2f%n", calculateRevenue());
        System.out.printf ("Profit / Loss  : Rs. %.2f%n", calculateProfit());

        // Show profit or loss status
        if (calculateProfit() >= 0) {
            System.out.println("Status         : ✔ PROFIT");
        } else {
            System.out.println("Status         : ✘ LOSS  --> Consider Shutdown");
        }
        System.out.println("--------------------------------------------");
    }
}
