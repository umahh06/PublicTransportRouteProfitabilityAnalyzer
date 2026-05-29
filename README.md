# Public Transport Route Profitability Analyzer

## Project Objective

This is a beginner-level Java console application that helps transport managers 
analyze the profitability of their bus routes. It calculates revenue, profit/loss, 
and identifies the most profitable route from the entered data.

---

## Features

- Add multiple bus routes with route number, passengers, ticket price, and fuel cost
- Automatically calculate:
  - Total Revenue = Passengers × Ticket Price
  - Profit/Loss = Revenue − Fuel Cost
- View all routes with their profit/loss status
- Identify the most profitable route
- Displays "Consider Shutdown" warning for loss-making routes
- Input validation to prevent invalid data entry

---

## Project Structure

```
TransportAnalyzer/
├── src/
│   ├── Main.java            → Entry point, menu-driven interface
│   ├── Route.java           → Route data model with calculations
│   └── ProfitAnalyzer.java  → Manages routes and analysis logic
├── README.md
└── Documentation.md
```

---

## Software Requirements

| Requirement      | Details                        |
|-----------------|--------------------------------|
| Language         | Java (Core Java only)         |
| JDK Version      | JDK 8 or higher               |
| IDE (optional)   | Eclipse / IntelliJ / VS Code  |
| OS               | Windows / Linux / macOS       |
| Database         | Not required                  |
| Frameworks       | Not required                  |

---

## How to Compile and Run

### Option 1: Using Command Prompt / Terminal

**Step 1: Navigate to the src folder**
```
cd TransportAnalyzer/src
```

**Step 2: Compile all Java files**
```
javac Route.java ProfitAnalyzer.java Main.java
```

**Step 3: Run the program**
```
java Main
```

---

### Option 2: Using Eclipse IDE

1. Open Eclipse → File → New → Java Project
2. Name the project `TransportAnalyzer`
3. Copy all three `.java` files into the `src` folder
4. Right-click `Main.java` → Run As → Java Application

---

## Sample Output

```
╔══════════════════════════════════════════════╗
║   PUBLIC TRANSPORT ROUTE PROFITABILITY       ║
║              ANALYZER  v1.0                  ║
╚══════════════════════════════════════════════╝

----------- MAIN MENU -----------
1. Add Route
2. View All Routes
3. Show Most Profitable Route
4. Exit
---------------------------------
Enter your choice (1-4): 1

--- Add New Route ---
Enter Route Number (e.g., RT001): RT001
Enter Number of Passengers per Day: 120
Enter Ticket Price (in Rs.): 25
Enter Daily Fuel Cost (in Rs.): 2000

✔ Route 'RT001' added successfully!
```

---

## Team Details

- **Project Title:** Public Transport Route Profitability Analyzer
- **Technology:** Core Java
- **College:** Knowledge Institute of Technology
- **Department:** [Your Department]
- **Academic Year:** 2025–2026
"# PublicTransportRouteProfitabilityAnalyzer" 
