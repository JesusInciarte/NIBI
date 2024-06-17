import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transactions_Log extends Multi_Purpose_Class implements ActionListener {

  // Define colors for UI elements
  Color backGroundColor = new Color(10, 9, 9);
  Color letterCouColor = new Color(251, 215, 31);
  Color buttonColor = new Color(22, 17, 11, 255);
  Color white = new Color(243, 243, 243);

  // Lists to store transaction and balance history
  List<String> transactionHistory = new ArrayList<>(); // Store transaction history
  List<String> balanceHistory = new ArrayList<>(); // Store transaction history

  // Declare UI components
  JFrame frame;
  JPanel MenuPanel;
  JPanel bluePanel;
  JPanel backGround;
  JButton BackToMenu, LogOut, Transactions, withdrawals, deposits;
  JButton Deposit, Withdrawal;
  JLabel balance;
  JTextField DepositAmountText;
  JTextArea transactionTextArea;

  // Constructor for the Transactions_Log class
  Transactions_Log() {


    // Load logo image
    ImageIcon image = new ImageIcon("LOGO6.png");
    // Get currency formatter
    NumberFormat money = NumberFormat.getCurrencyInstance();

    //try (BufferedReader reader = new BufferedReader(new FileReader("balance.txt"))) {
    //  String line = reader.readLine();
    //  if (line != null) {
    //    Balance = Double.parseDouble(line);
    //  }
    //} catch (IOException ex) {
    //  System.out.println("Error reading balance from file: " + ex.getMessage());
    //}

    

    // Create and configure the "N I B I" label
    JLabel label = new JLabel("N I B I");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, or right of image
    label.setVerticalTextPosition(JLabel.BOTTOM); // set text top, center, or bottom of image
    label.setFont(new Font("Open Sans", Font.PLAIN, 20)); // set font of text
    label.setForeground(new Color(0xFFFFFF)); // set color of text
    label.setBounds(0, 0, 100, 100);

    // Create and configure the "Transactions" button
    JButton Transactions = new JButton("Transactions ");
    Transactions.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
    Transactions.setForeground(new Color(0xFFFFFF)); // set color of text
    Transactions.setBounds(10, 10, 100, 50);
    Transactions.setBorderPainted(false); // Hide the border
    Transactions.setFocusPainted(false); // Hide the text border
    Transactions.setContentAreaFilled(false);

    // Create and configure the "Withdrawals" button
    JButton withdrawals = new JButton("Withdrawals");
    withdrawals.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
    withdrawals.setForeground(new Color(0xFFFFFF)); // set color of text
    withdrawals.setBounds(10, 10, 100, 50);
    withdrawals.setBorderPainted(false); // Hide the border
    withdrawals.setFocusPainted(false); // Hide the text border
    withdrawals.setContentAreaFilled(false);

    // Create and configure the "Deposits" button
    JButton deposits = new JButton("Deposits");
    deposits.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
    deposits.setForeground(new Color(0xFFFFFF)); // set color of text
    deposits.setBounds(10, 10, 100, 50);
    deposits.setBorderPainted(false); // Hide the border
    deposits.setFocusPainted(false); // Hide the text border
    deposits.setContentAreaFilled(false);

    // Create and configure the "Back To Main Menu" button
    JButton BackToMenu = new JButton("Back To Main Menu");
    BackToMenu.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
    BackToMenu.setForeground(new Color(0xFFFFFF)); // set color of text
    BackToMenu.setBounds(10, 10, 100, 50);
    BackToMenu.setBorderPainted(false); // Hide the border
    BackToMenu.setFocusPainted(false); // Hide the text border
    BackToMenu.setContentAreaFilled(false);
    BackToMenu.addActionListener(this);
    BackToMenu.setActionCommand("BackToMenu");

    // Create and configure the "Log Out" button
    JButton LogOut = new JButton("Log Out");
    LogOut.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
    LogOut.setForeground(new Color(0xFFFFFF)); // set color of text
    LogOut.setBounds(10, 10, 100, 50);
    LogOut.setBorderPainted(false); // Hide the border
    LogOut.setFocusPainted(false); // Hide the text border
    LogOut.setContentAreaFilled(false);
    LogOut.addActionListener(this);
    LogOut.setActionCommand("Terminate");

    // Create and configure the Menu Panel
    JPanel MenuPanel = new JPanel();
    MenuPanel.setBackground(new Color(0x010000));
    MenuPanel.setBounds(10, 10, 900, 220);

    // Create and configure the Balance Panel
    JPanel BalancePanel = new JPanel();
    BalancePanel.setBackground(new Color(0xFF2922));
    BalancePanel.setBounds(920, 10, 345, 220);
    BalancePanel.setLayout(new BorderLayout());

    // Create and configure the Withdraw and Deposit Panel
    JPanel WithdrawAndDepositPanel = new JPanel();
    WithdrawAndDepositPanel.setBackground(new Color(0xFF2922));
    WithdrawAndDepositPanel.setBounds(920, 240, 345, 390);
    WithdrawAndDepositPanel.setBackground(new Color(0xFFDE00));

    // Set layout for Withdraw and Deposit Panel
    BoxLayout withdrawAndDepositLayout = new BoxLayout(WithdrawAndDepositPanel, BoxLayout.Y_AXIS);
    WithdrawAndDepositPanel.setLayout(withdrawAndDepositLayout);

    // Create and configure the balance label
    balance = new JLabel(String.valueOf(money.format(Balance)));
    balance.setFont(new Font("Open Sans", Font.PLAIN, 50)); // set font of text
    balance.setForeground(new Color(0xFFFFFF)); // set color of text
    balance.setHorizontalAlignment(JLabel.CENTER);
    balance.setVerticalAlignment(JLabel.CENTER);

    // Create and configure the Deposit Amount text field
    DepositAmountText = new JTextField();
    DepositAmountText.setBounds(970, 280, 240, 50);
    DepositAmountText.setFont(new Font("Open Sans", Font.PLAIN, 30));
    DepositAmountText.setForeground(new Color(0x010000));

    // Create and configure the Deposit button
    Deposit = new JButton("Deposit");
    Deposit.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
    Deposit.setForeground(new Color(0xFFFFFF)); // set color of text
    Deposit.setBackground(new Color(0x010000)); // set color of text
    Deposit.setBorderPainted(false); // Hide the border
    Deposit.setFocusPainted(false); // Hide the text border
    Deposit.setBounds(970, 340, 240, 50);
    Deposit.addActionListener(this);
    Deposit.setActionCommand("Deposit");

    // Create and configure the Withdrawal button
    Withdrawal = new JButton("Withdrawal");
    Withdrawal.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
    Withdrawal.setForeground(new Color(0xFFFFFF)); // set color of text
    Withdrawal.setBackground(new Color(0x010000)); // set color of text
    Withdrawal.setBorderPainted(false); // Hide the border
    Withdrawal.setFocusPainted(false); // Hide the text border
    Withdrawal.setBounds(970, 400, 240, 50);
    Withdrawal.addActionListener(this);
    Withdrawal.setActionCommand("Withdrawal");

    // Create the transaction text area
    transactionTextArea = new JTextArea();
    transactionTextArea.setEditable(false); // Make it read-only
    transactionTextArea.setFont(new Font("Open Sans", Font.PLAIN, 15));
    transactionTextArea.setForeground(Color.WHITE);
    transactionTextArea.setBackground(new Color(0x49494d));
    transactionTextArea.setBounds(10, 240, 900, 390);
    transactionTextArea.setLineWrap(true); // Wrap text at line breaks
    transactionTextArea.setWrapStyleWord(true); // Wrap at word boundaries

    // Create and configure the background panel
    JPanel backGround = new JPanel();
    backGround.setBackground(new Color(0xEFEFEF));
    backGround.setBounds(0, 0, 1300, 690);
    backGround.setLayout(new BorderLayout());

    // Create and configure the main frame
    frame = new JFrame();
    ImageIcon image2 = new ImageIcon("LOGO8.png"); // creates a new ImageIcon
    frame.setIconImage(image2.getImage()); // sets the icon of the JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    frame.setVisible(true);

    // Add components to the Menu Panel
    MenuPanel.add(label);
    MenuPanel.add(Transactions);
    MenuPanel.add(deposits);
    MenuPanel.add(withdrawals);
    MenuPanel.add(BackToMenu);
    MenuPanel.add(LogOut);

    // Add the balance label to the Balance Panel
    BalancePanel.add(balance);

    // Add components to the main frame
    frame.add(Deposit);
    frame.add(Withdrawal);
    frame.add(DepositAmountText);
    frame.add(WithdrawAndDepositPanel);
    frame.add(transactionTextArea);
    frame.add(BalancePanel);
    frame.add(MenuPanel);
    frame.add(backGround);
  }

  // Method to handle button clicks
  public void actionPerformed(ActionEvent e) {
    // Handle "Back To Main Menu" button click
    if (e.getActionCommand().equals("BackToMenu")) {
      frame.dispose(); // Terminate the frame
    }
    // Handle "Log Out" button click
    if (e.getActionCommand().equals("Terminate")) {
      frame.dispose(); // Terminate the frame
      login = false;
    }
    // Handle "Deposit" button click
    if (e.getActionCommand().equals("Deposit")) {
      // Get deposit amount from text field
      depositValue = DepositAmountText.getText();
      double depositAmount = Double.parseDouble(depositValue);
      // Update balance
      Balance += depositAmount;
      balance.setText(String.valueOf(money.format(Balance)));

      // Add deposit to transaction history
      String transaction = String.format("Deposit: $%.2f", depositAmount);
      transactionHistory.add(transaction);

      // Write transaction history to a file
      try (FileWriter writer = new FileWriter("transactions.txt")) {
        for (int i = 0; i < transactionHistory.size(); i++) {
          writer.write(transactionHistory.get(i) + "\n");
        }
      } catch (IOException ex) {
        System.out.println("Error writing to file: " + ex.getMessage());
      }

      // Update transaction text area
      String transactionText = "";
      for (int i = 0; i < transactionHistory.size(); i++) {
        transactionText = transactionText + transactionHistory.get(i) + "\n";
      }
      transactionTextArea.setText(transactionText);

      // Update balance history
      String balanceString = String.format("Balance: $%.2f", Balance); // Corrected format specifier
      balanceHistory.add(balanceString);

      // Write balance history to a file
      try (FileWriter writer = new FileWriter(new File("balance.txt"))) {
        for (int i = 0; i < balanceHistory.size(); i++) {
          writer.write(balanceHistory.get(i) + "\n");
        }
      } catch (IOException ex) {
        System.out.println("Error writing to file: " + ex.getMessage());
      }
  
    }
  
    
    // Handle "Withdrawal" button click
    if (e.getActionCommand().equals("Withdrawal")) {
      // Get withdrawal amount from text field
      depositValue = DepositAmountText.getText();
      double depositAmount = Double.parseDouble(depositValue);
      // Update balance
      Balance -= depositAmount;
      balance.setText(String.valueOf(money.format(Balance)));

      // Add withdrawal to transaction history
      String transaction = String.format("Withdrawal: $%.2f", depositAmount);
      transactionHistory.add(transaction);
      // Write transaction history to a file
      try (FileWriter writer = new FileWriter(new File("transactions.txt"))) {
        for (int i = 0; i < transactionHistory.size(); i++) {
          writer.write(transactionHistory.get(i) + "\n");
        }
      } catch (IOException ex) {
        System.out.println("Error writing to file: " + ex.getMessage());
      }
      // Update transaction text area
      String transactionText = "";
      for (int i = 0; i < transactionHistory.size(); i++) {
        transactionText = transactionText + transactionHistory.get(i) + "\n";
      }
      transactionTextArea.setText(transactionText);
    }
  }
}