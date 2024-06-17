import java.text.NumberFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Multi_Purpose_Class {
    // Initialize a NumberFormat object for currency formatting
    NumberFormat money = NumberFormat.getCurrencyInstance();

    // Flag to track login status
    static Boolean login = false;
    // String to store the selected account
    String selectedAccount = "";
    // Static variable to store the account balance
    static double Balance;
    // String to store the deposit amount
    String depositAmount = "";
    // String to store the deposit amount text
    String DepositAmountText = "";
    // String to store the deposit value
    String depositValue;
    // Strings to store loan and investment information
    String LoansString, InvestmentString;
    // Static variables to store user and password information
    static String user;
    static String password;
    static String userAccount;
    static String passwordAccount;
    // Variable to store withdrawal amount
    int Withdraw = 0;
    // Variables to store bill, investment, loan, and interest rate values
    double Bills = 0, Investment = 0, Loans = 0, rate = 10;
    // Static variable to store the account type
    static String accountType = "";


    // Main method of the class
    public static void main(String[] args) {
        // Try-with-resources block to read from "balance.txt" file
        try (Scanner scanner = new Scanner("balance.txt")) {
            // String to store the last line read from the file
            String lastLine = "";
            // Loop through each line in the file
            while (scanner.hasNextLine()) {
                // Update lastLine with the current line
                lastLine = scanner.nextLine(); // Keep track of the last line
            }
            // Split the last line by whitespace
            String[] parts = lastLine.split("\s+"); // Split by whitespace
            // If there are parts in the split array
            if (parts.length > 0) {
                // Try to parse the last part as a double and store it in Balance
                try {
                    Balance = Double.parseDouble(parts[parts.length - 1]); // Get the last part
                } catch (NumberFormatException e) {
                    // Print an error message if the parsing fails
                    System.out.println("Invalid number format in file: " + e.getMessage());
                }
            }
        }
    }
}
