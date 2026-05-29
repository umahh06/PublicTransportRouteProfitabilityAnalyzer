// Main.java
// Entry point of the application
// Displays a menu and takes user input to run the program

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner is used to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Create an analyzer object to manage routes
        ProfitAnalyzer analyzer = new ProfitAnalyzer();

        int choice = 0;  // Stores the user's menu choice

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   PUBLIC TRANSPORT ROUTE PROFITABILITY       ║");
        System.out.println("║              ANALYZER  v1.0                  ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        // Loop keeps the menu running until the user chooses Exit
        do {
            // Display the menu options
            System.out.println("\n----------- MAIN MENU -----------");
            System.out.println("1. Add Route");
            System.out.println("2. View All Routes");
            System.out.println("3. Show Most Profitable Route");
            System.out.println("4. Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter your choice (1-4): ");

            // Read user's menu choice safely
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("⚠ Invalid input! Please enter a number between 1 and 4.");
                continue;
            }

            // Perform action based on choice
            switch (choice) {

                case 1:
                    // ----- ADD ROUTE -----
                    System.out.println("\n--- Add New Route ---");

                    // Get Route Number
                    System.out.print("Enter Route Number (e.g., RT001): ");
                    String routeNum = sc.nextLine().trim();

                    // Check for duplicate route number
                    if (analyzer.routeExists(routeNum)) {
                        System.out.println("⚠ Route '" + routeNum + "' already exists. Try a different number.");
                        break;
                    }

                    // Get Number of Passengers
                    int passengers = 0;
                    try {
                        System.out.print("Enter Number of Passengers per Day: ");
                        passengers = Integer.parseInt(sc.nextLine().trim());
                        if (passengers < 0) throw new NumberFormatException();
                    } catch (NumberFormatException e) {
                        System.out.println("⚠ Invalid input! Passengers must be a positive number.");
                        break;
                    }

                    // Get Ticket Price
                    double ticketPrice = 0;
                    try {
                        System.out.print("Enter Ticket Price (in Rs.): ");
                        ticketPrice = Double.parseDouble(sc.nextLine().trim());
                        if (ticketPrice < 0) throw new NumberFormatException();
                    } catch (NumberFormatException e) {
                        System.out.println("⚠ Invalid input! Ticket price must be a positive number.");
                        break;
                    }

                    // Get Fuel Cost
                    double fuelCost = 0;
                    try {
                        System.out.print("Enter Daily Fuel Cost (in Rs.): ");
                        fuelCost = Double.parseDouble(sc.nextLine().trim());
                        if (fuelCost < 0) throw new NumberFormatException();
                    } catch (NumberFormatException e) {
                        System.out.println("⚠ Invalid input! Fuel cost must be a positive number.");
                        break;
                    }

                    // Create a Route object and add it to the analyzer
                    Route newRoute = new Route(routeNum, passengers, ticketPrice, fuelCost);
                    analyzer.addRoute(newRoute);
                    break;

                case 2:
                    // ----- VIEW ALL ROUTES -----
                    analyzer.viewAllRoutes();
                    break;

                case 3:
                    // ----- SHOW MOST PROFITABLE ROUTE -----
                    analyzer.showMostProfitable();
                    break;

                case 4:
                    // ----- EXIT -----
                    System.out.println("\nThank you for using the Transport Profitability Analyzer.");
                    System.out.println("Goodbye! 👋\n");
                    break;

                default:
                    // Handle numbers outside 1-4
                    System.out.println("⚠ Invalid choice! Please enter a number between 1 and 4.");
            }

        } while (choice != 4);  // Keep looping until user selects Exit

        sc.close();  // Close the Scanner when done
    }
}
