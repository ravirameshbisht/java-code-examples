import java.util.Scanner;

//Create a java program that simulates a simple ATM (Automated Teller Machine) 
//system using arrays. The program allows users to perform basic banking operations 
//such as checking balance, depositing money, withdrawing money, and viewing transaction history
public class ATMSystem {
    private static final int MAX_TRANSACTIONS = 100;
    private static final int MAX_USERS = 10;
    private static final double INITIAL_BALANCE = 1000.0;

    private static String[] usernames = new String[MAX_USERS];
    private static String[] passwords = new String[MAX_USERS];
    private static double[] balances = new double[MAX_USERS];
    private static int[] transactionCounts = new int[MAX_USERS];
    private static String[][] transactions = new String[MAX_USERS][MAX_TRANSACTIONS];

    private static int userCount = 0;

    public static void main(String[] args) {
        initializeDefaultUsers();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the ATM System!");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    System.out.println("Exiting the ATM System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 2);

        scanner.close();
    }

    // Method to initialize default users
    private static void initializeDefaultUsers() {
        addUser("user1", "password1");
        addUser("user2", "password2");
        addUser("user3", "password3");
    }

    // Method to add a user
    private static void addUser(String username, String password) {
        usernames[userCount] = username;
        passwords[userCount] = password;
        balances[userCount] = INITIAL_BALANCE;
        userCount++;
    }

    // Method to perform login
    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        int userId = authenticateUser(username, password);
        if (userId != -1) {
            performOperations(userId, scanner);
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    // Method to authenticate user
    private static int authenticateUser(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return i; // Return the user ID if authenticated
            }
        }
        return -1; // Return -1 if authentication fails
    }

    // Method to perform operations after successful login
    private static void performOperations(int userId, Scanner scanner) {
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Transaction History");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    checkBalance(userId);
                    break;
                case 2:
                    deposit(userId, scanner);
                    break;
                case 3:
                    withdraw(userId, scanner);
                    break;
                case 4:
                    viewTransactionHistory(userId);
                    break;
                case 5:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    // Method to check balance
    private static void checkBalance(int userId) {
        System.out.println("Current Balance: $" + balances[userId]);
    }

    // Method to deposit money
    private static void deposit(int userId, Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount.");
        } else {
            balances[userId] += amount;
            recordTransaction(userId, "Deposit", amount);
            System.out.println("$" + amount + " deposited successfully.");
        }
    }

    // Method to withdraw money
    private static void withdraw(int userId, Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        if (amount <= 0 || amount > balances[userId]) {
            System.out.println("Invalid amount. Please enter a valid amount.");
        } else {
            balances[userId] -= amount;
            recordTransaction(userId, "Withdrawal", amount);
            System.out.println("$" + amount + " withdrawn successfully.");
        }
    }

    // Method to record a transaction
    private static void recordTransaction(int userId, String type, double amount) {
        transactions[userId][transactionCounts[userId]] = type + ": $" + amount;
        transactionCounts[userId]++;
    }

    // Method to view transaction history
    private static void viewTransactionHistory(int userId) {
        System.out.println("Transaction History:");
        for (int i = 0; i < transactionCounts[userId]; i++) {
            System.out.println(transactions[userId][i]);
        }
    }
}
/*
 * This ATM System allows the user to perform the following operations:

Login: Users can log in with their username and password.
Check Balance: Users can check their account balance.
Deposit: Users can deposit money into their account.
Withdraw: Users can withdraw money from their account.
View Transaction History: Users can view their transaction history.
Logout: Users can logout from the ATM system.
Compile and run this program, and you can simulate an ATM system with basic banking operations.

 */