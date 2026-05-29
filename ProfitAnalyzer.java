// ProfitAnalyzer.java
// This class manages the list of routes and provides analysis functions

import java.util.ArrayList;

public class ProfitAnalyzer {

    // ArrayList to store all routes added by the user
    ArrayList<Route> routeList = new ArrayList<>();

    // Method to add a new route to the list
    public void addRoute(Route r) {
        routeList.add(r);
        System.out.println("\n Route '" + r.routeNumber + "' added successfully!\n");
    }

    // Method to display all routes
    public void viewAllRoutes() {
        // Check if no routes have been added yet
        if (routeList.isEmpty()) {
            System.out.println("\n No routes added yet. Please add a route first.\n");
            return;
        }

        System.out.println("\n========== ALL BUS ROUTES ==========");
        // Loop through each route and display its details
        for (Route r : routeList) {
            r.displayRoute();
        }
        System.out.println("=====================================\n");
    }

    // Method to find and show the most profitable route
    public void showMostProfitable() {
        // Check if no routes have been added yet
        if (routeList.isEmpty()) {
            System.out.println("\n No routes available to analyze.\n");
            return;
        }

        // Start by assuming the first route is the most profitable
        Route best = routeList.get(0);

        // Compare each route's profit with the current best
        for (Route r : routeList) {
            if (r.calculateProfit() > best.calculateProfit()) {
                best = r;  // Update best if a more profitable route is found
            }
        }

        System.out.println("\n========== MOST PROFITABLE ROUTE ==========");
        best.displayRoute();
        System.out.println("============================================\n");
    }

    // Method to check if a route number already exists (avoid duplicates)
    public boolean routeExists(String routeNumber) {
        for (Route r : routeList) {
            if (r.routeNumber.equalsIgnoreCase(routeNumber)) {
                return true;
            }
        }
        return false;
    }
}
