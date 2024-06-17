import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

/**
 * Financial_Tools class provides a graphical user interface for managing
 * financial operations like investments, loans, and bills.
 */
public class Financial_Tools extends Multi_Purpose_Class implements ActionListener {
    JFrame frame; // Main JFrame for the application
    JButton financialCalculator, budgetingTool, Transactions, withdrawals, BackToMenu, LogOut, redBox1, yellowBox1,
            redBox2, yellowBox2, investButton, sellinvestButton, loansButton, sellLoansButton, billsButton,
            payBillsButton; // Buttons for various actions
    JPanel balancePanel, investmentsPanel, loansPanel, billsPanel, balancePanel2, investmentsPanel2, loansPanel2,
            billsPanel2, BillsLabelPanel; // Panels for different sections of the UI
    int count1 = 0, count2 = 0, count3 = 0, count4 = 0; // Counters for toggling panel visibility
    JTextField InvestmentAmount, sellInvestmentAmount, loansAmount, sellLoansAmount; // Text fields for input
    JLabel InvestmentLabel, sellInvestmentLabel, investmentsExplanation, loansLabel, sellLoansLabel, loansExplanation,
            BillsLabel, BillsExplanation, sellBillsLabel, LoansLabel, balancepLabel, InvestmentsLabel, balance,
            billsLabel; // Labels for displaying information
    JTextField paymentAmountField; // Text field for payment amount
    private double Investment = 0; // Investment amount
    private double Loans = 0; // Loan amount
    private double Bills = 0; // Bill amount
    ArrayList<Bill> bills = new ArrayList<>(); // List to store bill objects

    /**
     * Constructor for the Financial_Tools class.
     * Initializes the UI components and loads values from the Transactions_Log
     * file.
     */
    Financial_Tools() {
        loadValuesFromLog(); // Load values from the log file
        ImageIcon image = new ImageIcon("LOGO6.png"); // Load the logo image
        NumberFormat money = NumberFormat.getCurrencyInstance(); // Format the money

        // Create and configure the NIBI label
        JLabel label = new JLabel("N I B I");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP); // set text top, center, or bottom of image
        label.setHorizontalAlignment(JLabel.CENTER); // set text left, center, or right of image
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, or right of image
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text top, center, or bottom of image
        label.setFont(new Font("Open Sans", Font.PLAIN, 20)); // set font of text
        label.setForeground(new Color(0xFFFFFF)); // set color of text

        // Create and configure the menu buttons
        JButton BalanceButton = new JButton("       Balance     ");
        BalanceButton.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        BalanceButton.setForeground(new Color(0xFFFFFF)); // set color of text
        BalanceButton.setBounds(10, 10, 100, 50);
        BalanceButton.setBorderPainted(false); // Hide the border
        BalanceButton.setFocusPainted(false); // Hide the text border
        BalanceButton.setContentAreaFilled(false);

        // Create and configure the menu buttons
        JButton Investments = new JButton("Investments");
        Investments.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        Investments.setForeground(new Color(0xFFFFFF)); // set color of text
        Investments.setBounds(10, 10, 100, 50);
        Investments.setBorderPainted(false); // Hide the border
        Investments.setFocusPainted(false); // Hide the text border
        Investments.setContentAreaFilled(false);

        JButton loans = new JButton("       Loans       ");
        loans.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        loans.setForeground(new Color(0xFFFFFF)); // set color of text
        loans.setBounds(10, 10, 100, 50);
        loans.setBorderPainted(false); // Hide the border
        loans.setFocusPainted(false); // Hide the text border
        loans.setContentAreaFilled(false);

        JButton billButton = new JButton("          Bills          ");
        billButton.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        billButton.setForeground(new Color(0xFFFFFF)); // set color of text
        billButton.setBounds(10, 10, 100, 50);
        billButton.setBorderPainted(false); // Hide the border
        billButton.setFocusPainted(false); // Hide the text border
        billButton.setContentAreaFilled(false);

        JButton BackToMenu = new JButton("Back To Main Menu");
        BackToMenu.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        BackToMenu.setForeground(new Color(0xFFFFFF)); // set color of text
        BackToMenu.setBounds(10, 10, 100, 50);
        BackToMenu.setBorderPainted(false); // Hide the border
        BackToMenu.setFocusPainted(false); // Hide the text border
        BackToMenu.setContentAreaFilled(false);
        BackToMenu.addActionListener(this);
        BackToMenu.setActionCommand("BackToMenu");

        JButton LogOut = new JButton("Log Out");
        LogOut.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        LogOut.setForeground(new Color(0xFFFFFF)); // set color of text
        LogOut.setBounds(10, 10, 100, 50);
        LogOut.setBorderPainted(false); // Hide the border
        LogOut.setFocusPainted(false); // Hide the text border
        LogOut.setContentAreaFilled(false);
        LogOut.addActionListener(this);
        LogOut.setActionCommand("terminate");

        // Create and configure the menu panel
        JPanel MenuPanel = new JPanel();
        MenuPanel.setBackground(new Color(0x010000));
        MenuPanel.setBounds(10, 10, 240, 630);

        // Create and configure the blue panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(0xFFFFFF));
        bluePanel.setBounds(230, 10, 1040, 100);

        // Create and configure the background panel
        JPanel backGround = new JPanel();
        backGround.setBackground(new Color(0xEFEFEF));
        backGround.setBounds(0, 0, 1300, 690);
        backGround.setLayout(new BorderLayout());

        // Create and configure the red boxes
        JButton redBox1 = new JButton();
        redBox1.setBackground(new Color(0xFF1616));
        redBox1.setBounds(260, 120, 245, 150);
        redBox1.setLayout(new BorderLayout());
        redBox1.setBorderPainted(false); // Hide the border
        redBox1.setFocusPainted(false); // Hide the text border
        redBox1.setVisible(true);
        redBox1.addActionListener(this);
        redBox1.setActionCommand("redBox1");

        // Create and configure the balance label
        balance = new JLabel("<html> Balance <br>" + String.valueOf(money.format(Balance)) + "<html>");
        balance.setHorizontalAlignment(JLabel.CENTER);
        balance.setVerticalAlignment(JLabel.CENTER);
        balance.setFont(new Font("Open Sans", Font.PLAIN, 30));
        balance.setForeground(new Color(0xFFFFFF));
        balance.setVisible(true);

        // Create and configure the yellow boxes
        JButton yellowBox1 = new JButton();
        yellowBox1.setBackground(new Color(0xFFDE00));
        yellowBox1.setBounds(515, 120, 245, 150);
        yellowBox1.setLayout(new BorderLayout());
        yellowBox1.setBorderPainted(false); // Hide the border
        yellowBox1.setFocusPainted(false); // Hide the text border
        yellowBox1.setVisible(true);
        yellowBox1.addActionListener(this);
        yellowBox1.setActionCommand("yellowBox1");

        // Create and configure the investments label
        InvestmentsLabel = new JLabel(
                "<html>Investments<br>" + String.valueOf(money.format(Investment)) + "<html>");
        InvestmentsLabel.setHorizontalAlignment(JLabel.CENTER);
        InvestmentsLabel.setVerticalAlignment(JLabel.CENTER);
        InvestmentsLabel.setFont(new Font("Open Sans", Font.PLAIN, 30));
        InvestmentsLabel.setForeground(new Color(0xFFFFFF));
        InvestmentsLabel.setVisible(true);

        // Create and configure the red boxes
        JButton redBox2 = new JButton();
        redBox2.setBackground(new Color(0xFF1616));
        redBox2.setBounds(770, 120, 245, 150);
        redBox2.setLayout(new BorderLayout());
        redBox2.setBorderPainted(false); // Hide the border
        redBox2.setFocusPainted(false); // Hide the text border
        redBox2.setVisible(true);
        redBox2.addActionListener(this);
        redBox2.setActionCommand("redBox2");

        // Create and configure the loans label
        LoansLabel = new JLabel("<html>Loans<br>" + String.valueOf(money.format(Loans)) + "<html>");
        LoansLabel.setHorizontalAlignment(JLabel.CENTER);
        LoansLabel.setVerticalAlignment(JLabel.CENTER);
        LoansLabel.setFont(new Font("Open Sans", Font.PLAIN, 30));
        LoansLabel.setForeground(new Color(0xFFFFFF));
        LoansLabel.setVisible(true);

        // Create and configure the yellow boxes
        JButton yellowBox2 = new JButton();
        yellowBox2.setBackground(new Color(0xFFDE00));
        yellowBox2.setBounds(1025, 120, 245, 150);
        yellowBox2.setLayout(new BorderLayout());
        yellowBox2.setBorderPainted(false); // Hide the border
        yellowBox2.setFocusPainted(false); // Hide the text border
        yellowBox2.setVisible(true);
        yellowBox2.addActionListener(this);
        yellowBox2.setActionCommand("yellowBox2");

        // Create and configure the bills label
        billsLabel = new JLabel("<html>Bills<br>" + String.valueOf(money.format(Bills)) + "<html>");
        billsLabel.setHorizontalAlignment(JLabel.CENTER);
        billsLabel.setVerticalAlignment(JLabel.CENTER);
        billsLabel.setFont(new Font("Open Sans", Font.PLAIN, 30));
        billsLabel.setForeground(new Color(0xFFFFFF));
        billsLabel.setVisible(true);

        // Create and configure the balance panel
        balancePanel = new JPanel();
        balancePanel.setBackground(new Color(0xFF1616));
        balancePanel.setBounds(260, 280, 1010, 360);
        balancePanel.setLayout(new BorderLayout());
        balancePanel.setVisible(false);

        // Create and configure the balance panel 2
        balancePanel2 = new JPanel();
        balancePanel2.setBackground(new Color(0xFF1616));
        balancePanel2.setBounds(260, 270, 245, 10);
        balancePanel2.setVisible(false);

        // Create and configure the balance label
        balancepLabel = new JLabel(
                "<html>Your current balance is : " + String.valueOf(money.format(Balance)) + "<br>"
                        +
                        "<br> Your balance is being increased by : " + String.valueOf(money.format(Investment))
                        + " By a rate of " + rate + "% which yields "
                        +
                        String.valueOf(money.format(Investment)) + " in interest" + " <br>" +
                        "<br> Your balance is being decreased by : " + String.valueOf(money.format(Loans))
                        + " By a rate of " + rate + "% which yields " +
                        String.valueOf(money.format(Loans)) + " in interest" +
                        "<html>");
        balancepLabel.setHorizontalAlignment(JLabel.CENTER);
        balancepLabel.setVerticalAlignment(JLabel.CENTER);
        balancepLabel.setFont(new Font("Open Sans", Font.PLAIN, 30));
        balancepLabel.setForeground(new Color(0xFFFFFF));

        // Create and configure the investments panel
        investmentsPanel = new JPanel();
        investmentsPanel.setBackground(new Color(0xFFDE00));
        investmentsPanel.setBounds(260, 280, 1010, 360);
        investmentsPanel.setLayout(new BorderLayout());
        investmentsPanel.setVisible(false);

        // Create and configure the investments panel 2
        investmentsPanel2 = new JPanel();
        investmentsPanel2.setBackground(new Color(0xFFDE00)); // 0x010000
        investmentsPanel2.setBounds(515, 270, 245, 10);
        investmentsPanel2.setVisible(false);

        // Create and configure the investment amount text field
        InvestmentAmount = new JTextField();
        InvestmentAmount.setBounds(280, 300, 300, 60);
        InvestmentAmount.setFont(new Font("Open Sans", Font.PLAIN, 30));
        InvestmentAmount.setForeground(new Color(0x010000));
        InvestmentAmount.setVisible(false);

        // Create and configure the investment label
        InvestmentLabel = new JLabel(
                "<html>Enter the amount you want to invest (It must not exceed the balance of the account )<html>");
        InvestmentLabel.setFont(new Font("Open Sans", Font.PLAIN, 20));
        InvestmentLabel.setBounds(280, 350, 300, 100);
        InvestmentLabel.setForeground(new Color(0x010000));
        InvestmentLabel.setVisible(false);

        // Create and configure the invest button
        investButton = new JButton("Invest");
        investButton.setBackground(new Color(0x010000));
        investButton.setForeground(new Color(0xFFFFFF));
        investButton.setFont(new Font("Open Sans", Font.PLAIN, 30));
        investButton.setBounds(280, 450, 300, 60);
        investButton.setBorderPainted(false); // Hide the border
        investButton.setFocusPainted(false); // Hide the text border
        investButton.setVisible(false);
        investButton.addActionListener(this);
        investButton.setActionCommand("investButton");

        // Create and configure the sell investment amount text field
        sellInvestmentAmount = new JTextField();
        sellInvestmentAmount.setBounds(600, 300, 300, 60);
        sellInvestmentAmount.setFont(new Font("Open Sans", Font.PLAIN, 30));
        sellInvestmentAmount.setForeground(new Color(0x010000));
        sellInvestmentAmount.setVisible(false);

        // Create and configure the sell investment label
        sellInvestmentLabel = new JLabel(
                "<html>Enter the amount you want to sell (It must not exceed the Investment of the account )<html>");
        sellInvestmentLabel.setFont(new Font("Open Sans", Font.PLAIN, 20));
        sellInvestmentLabel.setBounds(600, 350, 300, 100);
        sellInvestmentLabel.setForeground(new Color(0x010000));
        sellInvestmentLabel.setVisible(false);

        // Create and configure the sell invest button
        sellinvestButton = new JButton("Sell Invest");
        sellinvestButton.setBackground(new Color(0x010000));
        sellinvestButton.setForeground(new Color(0xFFFFFF));
        sellinvestButton.setFont(new Font("Open Sans", Font.PLAIN, 30));
        sellinvestButton.setBounds(600, 450, 300, 60);
        sellinvestButton.setBorderPainted(false); // Hide the border
        sellinvestButton.setFocusPainted(false); // Hide the text border
        sellinvestButton.setVisible(false);
        sellinvestButton.addActionListener(this);
        sellinvestButton.setActionCommand("sellinvestButton");

        // Create and configure the investments explanation label
        investmentsExplanation = new JLabel(
                "<html>The way investments work is by putting money into investment. This acts as a Saving Account. You can later sell your investment to gain money back.<html>");
        investmentsExplanation.setFont(new Font("Open Sans", Font.PLAIN, 20));
        investmentsExplanation.setBounds(920, 300, 300, 200);
        investmentsExplanation.setForeground(new Color(0x010000));
        investmentsExplanation.setVisible(false);

        // Create and configure the loans panel
        loansPanel = new JPanel();
        loansPanel.setBackground(new Color(0xFF1616));
        loansPanel.setBounds(260, 280, 1010, 360);
        loansPanel.setLayout(new BorderLayout());
        loansPanel.setVisible(false);

        // Create and configure the loans panel 2
        loansPanel2 = new JPanel();
        loansPanel2.setBackground(new Color(0xFF1616));
        loansPanel2.setBounds(770, 270, 245, 10);
        loansPanel2.setVisible(false);

        loansAmount = new JTextField(); // Text field for entering the loan amount
        loansAmount.setBounds(280, 300, 300, 60); // Set the bounds of the text field
        loansAmount.setFont(new Font("Open Sans", Font.PLAIN, 30)); // Set the font of the text field
        loansAmount.setForeground(new Color(0x010000)); // Set the foreground color of the text field
        loansAmount.setVisible(false); // Initially hide the text field

        loansLabel = new JLabel(
                "<html>Enter the amount you want to loan (Be mindfull you will be charged a fee of 10% per month )<html>"); // Label
                                                                                                                            // explaining
                                                                                                                            // loan
                                                                                                                            // terms
        loansLabel.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font of the label
        loansLabel.setBounds(280, 350, 300, 100); // Set the bounds of the label
        loansLabel.setForeground(new Color(0x010000)); // Set the foreground color of the label
        loansLabel.setVisible(false); // Initially hide the label

        loansButton = new JButton("Take Loan"); // Button to initiate taking a loan
        loansButton.setBackground(new Color(0x010000)); // Set the background color of the button
        loansButton.setForeground(new Color(0xFFFFFF)); // Set the foreground color of the button
        loansButton.setFont(new Font("Open Sans", Font.PLAIN, 30)); // Set the font of the button
        loansButton.setBounds(280, 450, 300, 60); // Set the bounds of the button
        loansButton.setBorderPainted(false); // Hide the border of the button
        loansButton.setFocusPainted(false); // Hide the focus indicator of the button
        loansButton.setVisible(false); // Initially hide the button
        loansButton.addActionListener(this); // Add an ActionListener to handle button clicks
        loansButton.setActionCommand("loansButton"); // Set the action command for the button

        sellLoansAmount = new JTextField(); // Text field for entering the amount to pay back
        sellLoansAmount.setBounds(600, 300, 300, 60); // Set the bounds of the text field
        sellLoansAmount.setFont(new Font("Open Sans", Font.PLAIN, 30)); // Set the font of the text field
        sellLoansAmount.setForeground(new Color(0x010000)); // Set the foreground color of the text field
        sellLoansAmount.setVisible(false); // Initially hide the text field

        sellLoansLabel = new JLabel(
                "<html>Enter the amount you want to pay back (It must not exceed the balance of the account )<html>"); // Label explaining payback v
        sellLoansLabel.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font of the label
        sellLoansLabel.setBounds(600, 350, 300, 100); // Set the bounds of the label
        sellLoansLabel.setForeground(new Color(0x010000)); // Set the foreground color of the label
        sellLoansLabel.setVisible(false); // Initially hide the label

        sellLoansButton = new JButton("Pay Back Loan"); // Button to initiate paying back a loan
        sellLoansButton.setBackground(new Color(0x010000)); // Set the background color of the button
        sellLoansButton.setForeground(new Color(0xFFFFFF)); // Set the foreground color of the button
        sellLoansButton.setFont(new Font("Open Sans", Font.PLAIN, 30)); // Set the font of the button
        sellLoansButton.setBounds(600, 450, 300, 60); // Set the bounds of the button
        sellLoansButton.setBorderPainted(false); // Hide the border of the button
        sellLoansButton.setFocusPainted(false); // Hide the focus indicator of the button
        sellLoansButton.setVisible(false); // Initially hide the button
        sellLoansButton.addActionListener(this); // Add an ActionListener to handle button clicks
        sellLoansButton.setActionCommand("sellLoansButton"); // Set the action command for the button

        loansExplanation = new JLabel(
                "<html>The way loans work is by asking for money. This can be used to buy a house or a car. You can later pay back your loan.<html>"); // Explanation of loans
        loansExplanation.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font of the label
        loansExplanation.setBounds(920, 300, 300, 200); // Set the bounds of the label
        loansExplanation.setForeground(new Color(0x010000)); // Set the foreground color of the label
        loansExplanation.setVisible(false); // Initially hide the label
        // ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        // ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        // ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        billsPanel = new JPanel(); // Create a JPanel for the bills section
        billsPanel.setBackground(new Color(0xFFDE00)); // Set the background color of the bills panel
        billsPanel.setBounds(260, 280, 1010, 360); // Set the bounds of the bills panel
        billsPanel.setLayout(new BorderLayout()); // Set the layout of the bills panel to BorderLayout
        billsPanel.setVisible(false); // Initially hide the bills panel

        billsPanel2 = new JPanel(); // Create a JPanel for the bills section (used for visual separation)
        billsPanel2.setBackground(new Color(0xFFDE00)); // Set the background color of the bills panel 2
        billsPanel2.setBounds(1025, 270, 245, 10); // Set the bounds of the bills panel 2
        billsPanel2.setVisible(false); // Initially hide the bills panel 2

        BillsLabelPanel = new JPanel(); // Create a JPanel to hold the BillsLabel
        BillsLabelPanel.setBounds(280, 370, 360, 270); // Set the bounds of the BillsLabelPanel
        BillsLabelPanel.setBackground(new Color(0xFFDE00)); // Set the background color of the BillsLabelPanel
        BillsLabelPanel.setVisible(false); // Initially hide the BillsLabelPanel

        BillsLabel = new JLabel(); // Create a JLabel to display the list of bills
        BillsLabel.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font of the BillsLabel
        BillsLabel.setForeground(new Color(0x010000)); // Set the foreground color of the BillsLabel
        BillsLabel.setHorizontalTextPosition(JLabel.CENTER); // Center the text horizontally within the label
        BillsLabel.setVerticalTextPosition(JLabel.TOP); // Align the text at the top of the label
        BillsLabel.setVisible(false); // Initially hide the BillsLabel

        billsButton = new JButton("Add Bills"); // Create a JButton to add new bills
        billsButton.setBackground(new Color(0x010000)); // Set the background color of the bills button
        billsButton.setForeground(new Color(0xFFFFFF)); // Set the foreground color of the bills button
        billsButton.setFont(new Font("Open Sans", Font.PLAIN, 30)); // Set the font of the bills button
        billsButton.setBounds(280, 300, 300, 60); // Set the bounds of the bills button
        billsButton.setBorderPainted(false); // Hide the border of the bills button
        billsButton.setFocusPainted(false); // Hide the focus indicator of the bills button
        billsButton.setVisible(false); // Initially hide the bills button
        billsButton.addActionListener(this); // Add an ActionListener to handle button clicks
        billsButton.setActionCommand("addBill"); // Set the action command for the bills button

        payBillsButton = new JButton("Pay Bills"); // Create a JButton to pay existing bills
        payBillsButton.setBackground(new Color(0x010000)); // Set the background color of the pay bills button
        payBillsButton.setForeground(new Color(0xFFFFFF)); // Set the foreground color of the pay bills button
        payBillsButton.setFont(new Font("Open Sans", Font.PLAIN, 30)); // Set the font of the pay bills button
        payBillsButton.setBounds(650, 300, 300, 60); // Set the bounds of the pay bills button
        payBillsButton.setBorderPainted(false); // Hide the border of the pay bills button
        payBillsButton.setFocusPainted(false); // Hide the focus indicator of the pay bills button
        payBillsButton.setVisible(false); // Initially hide the pay bills button
        payBillsButton.addActionListener(this); // Add an ActionListener to handle button clicks
        payBillsButton.setActionCommand("payBill"); // Set the action command for the pay bills button

        sellBillsLabel = new JLabel(
                "<html>Bills Due: <br> <html>"); // Create a JLabel to display the list of bills due
        sellBillsLabel.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font of the sell bills label
        sellBillsLabel.setBounds(600, 350, 300, 100); // Set the bounds of the sell bills label
        sellBillsLabel.setForeground(new Color(0x010000)); // Set the foreground color of the sell bills label
        sellBillsLabel.setVisible(false); // Initially hide the sell bills label

        BillsExplanation = new JLabel(
                "<html>The way invesmnets work is by putting money into invesment. This acts as a Saving Acount. You can later sell your invesment to gain money back.<html>"); // Create a JLabel to explain how investments work
        BillsExplanation.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font of the BillsExplanation label
        BillsExplanation.setBounds(920, 300, 300, 200); // Set the bounds of the BillsExplanation label
        BillsExplanation.setForeground(new Color(0x010000)); // Set the foreground color of the BillsExplanation label
        BillsExplanation.setVisible(false); // Initially hide the BillsExplanation label
        // ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        // ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        // ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
        frame = new JFrame(); // Create a new JFrame (main window) for the application
        ImageIcon image2 = new ImageIcon("LOGO8.png"); // Load the icon image from the "LOGO8.png" file
        frame.setIconImage(image2.getImage()); // Set the icon of the JFrame to the loaded image
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation to exit the application
                                                              // when the frame is closed
        frame.setLayout(null); // Use a null layout manager, allowing manual positioning of components
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame to fill the entire screen
        frame.setVisible(true); // Make the frame visible on the screen
        // *****************************************************************************************************/
        MenuPanel.add(label); // Add the NIBI label to the MenuPanel
        MenuPanel.add(BalanceButton); // Add the Balance button to the MenuPanel
        MenuPanel.add(Investments); // Add the Investments button to the MenuPanel
        MenuPanel.add(loans); // Add the Loans button to the MenuPanel
        MenuPanel.add(billButton); // Add the Bills button to the MenuPanel
        MenuPanel.add(BackToMenu); // Add the Back To Main Menu button to the MenuPanel
        MenuPanel.add(LogOut); // Add the Log Out button to the MenuPanel
        // *****************************************************************************************************/
        redBox1.add(balance, BorderLayout.CENTER); // Add the balance label to the center of the redBox1 panel
        redBox2.add(LoansLabel, BorderLayout.CENTER); // Add the Loans label to the center of the redBox2 panel
        yellowBox1.add(InvestmentsLabel, BorderLayout.CENTER); // Add the Investments label to the center of the
                                                               // yellowBox1 panel
        yellowBox2.add(billsLabel, BorderLayout.CENTER); // Add the Bills label to the center of the yellowBox2 panel
        // *****************************************************************************************************/
        balancePanel.add(balancepLabel, BorderLayout.CENTER); // Add the balancepLabel to the center of the balancePanel
        frame.add(InvestmentAmount); // Add the InvestmentAmount text field to the frame
        frame.add(InvestmentLabel); // Add the InvestmentLabel to the frame
        frame.add(investButton); // Add the investButton to the frame
        frame.add(sellInvestmentAmount); // Add the sellInvestmentAmount text field to the frame
        frame.add(sellInvestmentLabel); // Add the sellInvestmentLabel to the frame
        frame.add(sellinvestButton); // Add the sellinvestButton to the frame
        frame.add(investmentsExplanation); // Add the investmentsExplanation label to the frame
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        frame.add(loansAmount); // Add the loansAmount text field to the frame
        frame.add(loansLabel); // Add the loansLabel to the frame
        frame.add(loansButton); // Add the loansButton to the frame
        frame.add(sellLoansAmount); // Add the sellLoansAmount text field to the frame
        frame.add(sellLoansLabel); // Add the sellLoansLabel to the frame
        frame.add(sellLoansButton); // Add the sellLoansButton to the frame
        frame.add(loansExplanation); // Add the loansExplanation label to the frame
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        frame.add(billsButton); // Add the billsButton to the frame
        frame.add(payBillsButton); // Add the payBillsButton to the frame
        BillsLabelPanel.add(BillsLabel, BorderLayout.CENTER); // Add the BillsLabel to the center of the BillsLabelPanel
        frame.add(BillsLabelPanel); // Add the BillsLabelPanel to the frame
        frame.add(BillsExplanation); // Add the BillsExplanation label to the frame
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        balancePanel.add(balancepLabel, BorderLayout.CENTER); // Add the balancepLabel to the center of the balancePanel
        balancePanel.add(balancepLabel, BorderLayout.CENTER); // Add the balancepLabel to the center of the balancePanel
        // *****************************************************************************************************/
        frame.add(balancePanel); // Add the balancePanel to the JFrame
        frame.add(balancePanel2); // Add the balancePanel2 to the JFrame
        frame.add(investmentsPanel); // Add the investmentsPanel to the JFrame
        frame.add(investmentsPanel2); // Add the investmentsPanel2 to the JFrame
        frame.add(loansPanel); // Add the loansPanel to the JFrame
        frame.add(loansPanel2); // Add the loansPanel2 to the JFrame
        frame.add(billsPanel); // Add the billsPanel to the JFrame
        frame.add(billsPanel2); // Add the billsPanel2 to the JFrame
        frame.add(redBox1); // Add the redBox1 to the JFrame
        frame.add(redBox2); // Add the redBox2 to the JFrame
        frame.add(yellowBox1); // Add the yellowBox1 to the JFrame
        frame.add(yellowBox2); // Add the yellowBox2 to the JFrame
        frame.add(MenuPanel); // Add the MenuPanel to the JFrame
        frame.add(bluePanel); // Add the bluePanel to the JFrame
        frame.add(backGround); // Add the backGround panel to the JFrame
        // *****************************************************************************************************/
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("BackToMenu")) {
            frame.dispose(); // Terminate the frame
        }
        if (e.getActionCommand().equals("Terminate")) {
            frame.dispose(); // Terminate the frame
            login = false;
        }
        if (e.getActionCommand().equals("redBox1")) { // Check if the action command matches "redBox1" (meaning the redBox1 button was clicked)
            count1++; // Increment the count1 counter (used to toggle the visibility of the balance panel)
            if (count1 % 2 != 0) { // Check if count1 is odd (this is used to alternate between showing and hiding the balance panel)
                balancePanel.setVisible(true); // Make the balancePanel visible
                balancePanel2.setVisible(true); // Make the balancePanel2 visible
                investmentsPanel.setVisible(false); // Hide the investmentsPanel
                investmentsPanel2.setVisible(false); // Hide the investmentsPanel2
                loansPanel.setVisible(false); // Hide the loansPanel
                loansPanel2.setVisible(false); // Hide the loansPanel2
                billsPanel.setVisible(false); // Hide the billsPanel
                billsPanel2.setVisible(false); // Hide the billsPanel2
            } else { // If count1 is even
                balancePanel.setVisible(false); // Hide the balancePanel
                balancePanel2.setVisible(false); // Hide the balancePanel2
            }
        }
        if (e.getActionCommand().equals("redBox2")) { // Check if the action command matches "redBox2" (meaning the redBox2 button was clicked)
            count2++; // Increment the count2 counter (used to toggle the visibility of the loans panel)
            System.out.println(count2); // Print the value of count2 to the console (for debugging purposes)
            if (count2 % 2 != 0) { // Check if count2 is odd (this is used to alternate between showing and hiding the loans panel)
                balancePanel.setVisible(false); // Hide the balancePanel
                balancePanel2.setVisible(false); // Hide the balancePanel2
                investmentsPanel.setVisible(false); // Hide the investmentsPanel
                investmentsPanel2.setVisible(false); // Hide the investmentsPanel2
                loansPanel.setVisible(true); // Make the loansPanel visible
                loansPanel2.setVisible(true); // Make the loansPanel2 visible
                loansAmount.setVisible(true); // Make the loansAmount text field visible
                loansLabel.setVisible(true); // Make the loansLabel visible
                loansButton.setVisible(true); // Make the loansButton visible
                sellLoansAmount.setVisible(true); // Make the sellLoansAmount text field visible
                sellLoansLabel.setVisible(true); // Make the sellLoansLabel visible
                sellLoansButton.setVisible(true); // Make the sellLoansButton visible
                loansExplanation.setVisible(true); // Make the loansExplanation label visible
                billsPanel.setVisible(false); // Hide the billsPanel
                billsPanel2.setVisible(false); // Hide the billsPanel2
            } else { // If count2 is even
                loansPanel.setVisible(false); // Hide the loansPanel
                loansPanel2.setVisible(false); // Hide the loansPanel2
                loansAmount.setVisible(false); // Hide the loansAmount text field
                loansLabel.setVisible(false); // Hide the loansLabel
                loansButton.setVisible(false); // Hide the loansButton
                sellLoansAmount.setVisible(false); // Hide the sellLoansAmount text field
                sellLoansLabel.setVisible(false); // Hide the sellLoansLabel
                sellLoansButton.setVisible(false); // Hide the sellLoansButton
                loansExplanation.setVisible(false); // Hide the loansExplanation label
            }
        }
        if (e.getActionCommand().equals("yellowBox1")) { // Check if the action command matches "yellowBox1" (meaning the yellowBox1 button was clicked)
            count3++; // Increment the count3 counter (used to toggle the visibility of the investments panel)
            if (count3 % 2 != 0) { // Check if count3 is odd (this is used to alternate between showing and hiding the investments panel)
                balancePanel.setVisible(false); // Hide the balancePanel
                balancePanel2.setVisible(false); // Hide the balancePanel2
                investmentsPanel.setVisible(true); // Make the investmentsPanel visible
                investmentsPanel2.setVisible(true); // Make the investmentsPanel2 visible
                InvestmentAmount.setVisible(true); // Make the InvestmentAmount text field visible
                InvestmentLabel.setVisible(true); // Make the InvestmentLabel visible
                investButton.setVisible(true); // Make the investButton visible
                sellInvestmentAmount.setVisible(true); // Make the sellInvestmentAmount text field visible
                sellInvestmentLabel.setVisible(true); // Make the sellInvestmentLabel visible
                sellinvestButton.setVisible(true); // Make the sellinvestButton visible
                investmentsExplanation.setVisible(true); // Make the investmentsExplanation label visible
                loansPanel.setVisible(false); // Hide the loansPanel
                loansPanel2.setVisible(false); // Hide the loansPanel2
                billsPanel.setVisible(false); // Hide the billsPanel
                billsPanel2.setVisible(false); // Hide the billsPanel2
            } else { // If count3 is even
                investmentsPanel.setVisible(false); // Hide the investmentsPanel
                investmentsPanel2.setVisible(false); // Hide the investmentsPanel2
                InvestmentAmount.setVisible(false); // Hide the InvestmentAmount text field
                InvestmentLabel.setVisible(false); // Hide the InvestmentLabel
                investButton.setVisible(false); // Hide the investButton
                sellInvestmentAmount.setVisible(false); // Hide the sellInvestmentAmount text field
                sellInvestmentLabel.setVisible(false); // Hide the sellInvestmentLabel
                sellinvestButton.setVisible(false); // Hide the sellinvestButton
                investmentsExplanation.setVisible(false); // Hide the investmentsExplanation label

            }
        }
        if (e.getActionCommand().equals("yellowBox2")) { // Check if the action command matches "yellowBox2" (meaning the yellowBox2 button was clicked)
            count4++; // Increment the count4 counter (used to toggle the visibility of the bills panel)
            if (count4 % 2 != 0) { // Check if count4 is odd (this is used to alternate between showing and hiding the bills panel)
                balancePanel.setVisible(false); // Hide the balancePanel
                balancePanel2.setVisible(false); // Hide the balancePanel2
                investmentsPanel.setVisible(false); // Hide the investmentsPanel
                investmentsPanel2.setVisible(false); // Hide the investmentsPanel2
                loansPanel.setVisible(false); // Hide the loansPanel
                loansPanel2.setVisible(false); // Hide the loansPanel2
                billsPanel.setVisible(true); // Make the billsPanel visible
                billsPanel2.setVisible(true); // Make the billsPanel2 visible
                BillsLabel.setVisible(true); // Make the BillsLabel visible
                billsButton.setVisible(true); // Make the billsButton visible
                payBillsButton.setVisible(true); // Make the payBillsButton visible
                sellBillsLabel.setVisible(true); // Make the sellBillsLabel visible
                BillsExplanation.setVisible(true); // Make the BillsExplanation label visible
                BillsLabelPanel.setVisible(true); // Make the BillsLabelPanel visible

            } else { // If count4 is even
                billsPanel.setVisible(false); // Hide the billsPanel
                billsPanel2.setVisible(false); // Hide the billsPanel2
                BillsLabel.setVisible(false); // Hide the BillsLabel
                billsButton.setVisible(false); // Hide the billsButton
                payBillsButton.setVisible(false); // Hide the payBillsButton
                sellBillsLabel.setVisible(false); // Hide the sellBillsLabel
                BillsExplanation.setVisible(false); // Hide the BillsExplanation label
                BillsLabelPanel.setVisible(false); // Hide the BillsLabelPanel

            }
        }

        if (e.getActionCommand().equals("loansButton")) { // Check if the action command matches "loansButton" (meaning  the "Take Loan" button was clicked)
            LoansString = loansAmount.getText(); // Get the text from the loansAmount text field (which represents the loan amount)
            double depositAmount = Double.parseDouble(LoansString); // Parse the text as a double to get the loan amount
            Loans += depositAmount; // Add the loan amount to the total Loans value
            Balance += depositAmount; // Add the loan amount to the total Balance value
            balance.setText("<html> Balance <br>" + String.valueOf(money.format(Balance)) + "<html>"); // Update the  balance label with the new Balance value
                                                                                                       
                                                                                                       
                                                                                                       
            LoansLabel.setText("<html>Loans<br>" + String.valueOf(money.format(Loans)) + "<html>"); // Update the Loans label with the new Loans value
                                                                                                  
            balancepLabel.setText("<html>Your current balance is : " + String.valueOf(money.format(Balance)) + "<br>"
                    +
                    "<br> Your balance is being increased by : " + String.valueOf(money.format(Investment))
                    + " By a rate of " + rate + "% which yields "
                    +
                    String.valueOf(money.format(Investment)) + " in interest" + " <br>" +
                    "<br> Your balance is being decreased by : " + String.valueOf(money.format(Loans))
                    + " By a rate of " + rate + "% which yields " +
                    String.valueOf(money.format(Loans)) + " in interest" +
                    "<html>"); // Update the balancepLabel with the new Balance, Investment, and Loans values
            saveValuesToLog(); // Save the updated values to the Transactions_Log file
        }

        if (e.getActionCommand().equals("sellLoansButton")) { // Check if the action command matches "sellLoansButton" (meaning the "Pay Back Loan" button was clicked)
            LoansString = sellLoansAmount.getText(); // Get the text from the sellLoansAmount text field (which represents the amount to pay back)
            double depositAmount = Double.parseDouble(LoansString); // Parse the text as a double to get the payback amount
            if ((depositAmount <= Balance) && (depositAmount <= Loans)) { // Check if the payback amount is less than or equal to both the current balance and the total loan amount 
                Loans -= depositAmount; // Subtract the payback amount from the total Loans value
                Balance -= depositAmount; // Subtract the payback amount from the total Balance value
                balance.setText("<html> Balance <br>" + String.valueOf(money.format(Balance)) + "<html>"); // Update the balance label with the new Balance value
                LoansLabel.setText("<html>Loans<br>" + String.valueOf(money.format(Loans)) + "<html>"); // Update the  Loans label with the new Loans value
                balancepLabel
                        .setText("<html>Your current balance is : " + String.valueOf(money.format(Balance)) + "<br>"
                                +
                                "<br> Your balance is being increased by : " + String.valueOf(money.format(Investment))
                                + " By a rate of " + rate + "% which yields "
                                +
                                String.valueOf(money.format(Investment)) + " in interest" + " <br>" +
                                "<br> Your balance is being decreased by : " + String.valueOf(money.format(Loans))
                                + " By a rate of " + rate + "% which yields " +
                                String.valueOf(money.format(Loans)) + " in interest" +
                                "<html>"); // Update the balancepLabel with the new Balance, Investment, and Loans values
                saveValuesToLog(); // Save the updated values to the Transactions_Log file
            } else { // If the payback amount is greater than either the balance or the loan amount
                JOptionPane.showMessageDialog(null, "You do not have enough money to pay back the loan"); // Display an error message to the user                                                                               
            }
        }

        if (e.getActionCommand().equals("investButton")) { // Check if the action command matches "investButton" (meaning the "Invest" button was clicked)
            InvestmentString = InvestmentAmount.getText(); // Get the text from the InvestmentAmount text field (which (meaning the "Invest" button was clicked)
            double depositAmount = Double.parseDouble(InvestmentString); // Parse the text as a double to get the investment amount
            if (Balance >= depositAmount) { // Check if the investment amount is less than or equal to the current balance
                Investment += depositAmount; // Add the investment amount to the total Investment value
                Balance -= depositAmount; // Subtract the investment amount from the total Balance value
                balance.setText("<html> Balance <br>" + String.valueOf(money.format(Balance)) + "<html>"); // Update the balance label with the new Balance value
                InvestmentsLabel.setText("<html>Investments<br>" + String.valueOf(money.format(Investment)) + "<html>"); // Update the Investments label with the new Investment value
                balancepLabel
                        .setText("<html>Your current balance is : " + String.valueOf(money.format(Balance)) + "<br>"
                                +
                                "<br> Your balance is being increased by : " + String.valueOf(money.format(Investment))
                                + " By a rate of " + rate + "% which yields "
                                +
                                String.valueOf(money.format(Investment)) + " in interest" + " <br>" +
                                "<br> Your balance is being decreased by : " + String.valueOf(money.format(Loans))
                                + " By a rate of " + rate + "% which yields " +
                                String.valueOf(money.format(Loans)) + " in interest" +
                                "<html>"); // Update the balancepLabel with the new Balance, Investment, and Loans
                                           // values
                saveValuesToLog(); // Save the updated values to the Transactions_Log file
            } else { // If the investment amount is greater than the balance
                JOptionPane.showMessageDialog(null, "You do not have enough money to invest"); // Display an error message to the user
            }
        }
        if (e.getActionCommand().equals("sellinvestButton")) { // Check if the action command matches "sellinvestButton" (meaning the "Sell Invest" button was clicked)
            InvestmentString = sellInvestmentAmount.getText(); // Get the text from the sellInvestmentAmount text field (which represents the amount to sell)
            double depositAmount = Double.parseDouble(InvestmentString); // Parse the text as a double to get the sell amount
            if (depositAmount <= Investment) { // Check if the sell amount is less than or equal to the total Investment amount
                Investment -= depositAmount; // Subtract the sell amount from the total Investment value
                Balance += depositAmount; // Add the sell amount to the total Balance value
                balance.setText("<html> Balance <br>" + String.valueOf(money.format(Balance)) + "<html>"); // Update the balance label with the new Balance value
                InvestmentsLabel.setText("<html>Investments<br>" + String.valueOf(money.format(Investment)) + "<html>"); // Update the Investments label with the new Investment value                                                                                           
                balancepLabel
                        .setText("<html>Your current balance is : " + String.valueOf(money.format(Balance)) + "<br>"
                                +
                                "<br> Your balance is being increased by : " + String.valueOf(money.format(Investment))
                                + " By a rate of " + rate + "% which yields "
                                +
                                String.valueOf(money.format(Investment)) + " in interest" + " <br>" +
                                "<br> Your balance is being decreased by : " + String.valueOf(money.format(Loans))
                                + " By a rate of " + rate + "% which yields " +
                                String.valueOf(money.format(Loans)) + " in interest" +
                                "<html>"); // Update the balancepLabel with the new Balance, Investment, and Loans values
                saveValuesToLog(); // Save the updated values to the Transactions_Log file
            } else { // If the sell amount is greater than the total Investment amount
                JOptionPane.showMessageDialog(null, "You do not have enough investment to sell"); // Display an error message to the user
            }
        }
        if (e.getActionCommand().equals("addBill")) { // Check if the action command matches "addBill" (meaning the "Add Bills" button was clicked)
            String billName = JOptionPane.showInputDialog("Enter bill name:"); // Prompt the user to enter the name of the bill
            String billAmountString = JOptionPane.showInputDialog("Enter bill amount:"); // Prompt the user to enter the amount of the bill
            String billDueDate = JOptionPane.showInputDialog("Enter due date (YYYY-MM-DD):"); // Prompt the user to enter the due date of the bill
            if (billName != null && billAmountString != null && billDueDate != null) { // Check if all input fields are filled
                try {
                    double billAmount = Double.parseDouble(billAmountString); // Parse the bill amount string as a double
                    Bills += billAmount; // Add the bill amount to the total Bills value
                    billsLabel.setText("<html>Bills<br>" + String.valueOf(money.format(Bills)) + "<html>"); // Update the billsLabel with the new Bills value                                                                                                               
                    bills.add(new Bill(billName, billAmount, billDueDate)); // Create a new Bill object and add it to the bills ArrayList
                    StringBuilder billsText = new StringBuilder("<html>Bills Due: <br>"); // Create a StringBuilder to store the formatted bill information
                    for (int i = 0; i < bills.size(); i++) { // Iterate through the bills ArrayList
                        Bill bill = bills.get(i); // Get the current Bill object from the ArrayList
                        billsText = new StringBuilder(billsText.toString() + String.format("%s: %s (Due: %s) <br>", bill.name, money.format(bill.amount), bill.dueDate));// Format the bill information and append it to the StringBuilder
                    }
                    // billsText.append("<html>");
                    BillsLabel.setText(billsText.toString()); // Set the text of the BillsLabel to the formatted bill information
                    saveValuesToLog(); // Save the updated values to the Transactions_Log file
                } catch (NumberFormatException ex) { // Catch any NumberFormatException that might occur if the user enters an invalid bill amount
                    JOptionPane.showMessageDialog(null, "Invalid bill amount. Please enter a number."); // Display an error message to the user
                }
            }
        }
        if (e.getActionCommand().equals("payBill")) { // Check if the action command matches "payBill" (meaning the "Pay Bills" button was clicked)
            if (bills.size() > 0) { // Check if there are any bills in the bills ArrayList
                // Display a list of bills to choose from
                String[] billNames = new String[bills.size()]; // Create an array of bill names to display in the dialog
                for (int i = 0; i < bills.size(); i++) { // Iterate through the bills ArrayList
                    billNames[i] = bills.get(i).name; // Get the name of the current bill and add it to the billNames array
                }
                String selectedBill = (String) JOptionPane.showInputDialog( // Display a dialog box to allow the user to select a bill
                        frame,
                        "Select a bill to pay:", // Set the title of the dialog box
                        "Pay Bill", // Set the title of the dialog box
                        JOptionPane.QUESTION_MESSAGE, // Set the message type to a question
                        null, // Set the icon to null (no icon)
                        billNames, // Set the options for the dialog box to the bill names
                        billNames[0]); // Set the initial selection to the first bill in the list

                if (selectedBill != null) { // Check if the user selected a bill Find the selected bill
                    int billIndex = -1; // Initialize the billIndex to -1 (indicating the bill hasn't been found yet)
                    for (int i = 0; i < bills.size(); i++) { // Iterate through the bills ArrayList
                        if (bills.get(i).name.equals(selectedBill)) { // Check if the name of the current bill matches the selected bill
                            billIndex = i; // Set the billIndex to the index of the selected bill
                            break; // Exit the loop since the bill has been found
                        }
                    }
                    if (billIndex != -1) { // Check if the bill was found
                        Bill billToPay = bills.get(billIndex); // Get the Bill object corresponding to the selected bill Prompt for payment amount
                        String paymentAmountString = JOptionPane.showInputDialog( // Display a dialog box to prompt the user for the payment amount
                                frame,
                                "Enter payment amount for " + billToPay.name + " (Due: " + billToPay.dueDate + "):", // Set the message for the dialog box
                                "Pay Bill", // Set the title of the dialog box
                                JOptionPane.QUESTION_MESSAGE); // Set the message type to a question
                        if (paymentAmountString != null) { // Check if the user entered a payment amount
                            try {
                                double paymentAmount = Double.parseDouble(paymentAmountString); // Parse the payment amount string as a double
                                // Check if enough balance
                                if (paymentAmount <= Balance) { // Check if the payment amount is less than or equal to the current balance Update balance and bill
                                    Balance -= paymentAmount; // Subtract the payment amount from the total Balance value
                                    billToPay.amount -= paymentAmount; // Subtract the payment amount from the bill's amount
                                    Bills -= paymentAmount; // Subtract the payment amount from the total Bills value Remove bill if fully paid
                                    if (billToPay.amount <= 0) { // Check if the bill has been fully paid
                                        bills.remove(billIndex); // Remove the bill from the bills ArrayList
                                    }
                                    // Update UI
                                    balance.setText(
                                            "<html> Balance <br>" + String.valueOf(money.format(Balance)) + "<html>"); // Update the balance label with the new Balance value
                                    billsLabel.setText(
                                            "<html>Bills<br>" + String.valueOf(money.format(Bills)) + "<html>"); // Update the bills Label with the new Bills value
                                    StringBuilder billsText = new StringBuilder("<html>Bills Due: <br>"); // Create a StringBuilder to store the formatted bill information
                                    for (int i = 0; i < bills.size(); i++) { // Iterate through the bills ArrayList
                                        Bill bill = bills.get(i); // Get the current Bill object from the ArrayList
                                        billsText = new StringBuilder(
                                                billsText.toString() + String.format("%s: %s (Due: %s) <br>",
                                                        bill.name, money.format(bill.amount), bill.dueDate)); // Format the bill information and append it to the StringBuilder
                                    }
                                    BillsLabel.setText(billsText.toString()); // Set the text of the BillsLabel to the formatted bill information
                                    saveValuesToLog(); // Save the updated values to the Transactions_Log file
                                    JOptionPane.showMessageDialog(frame, "Bill payment successful!"); // Display a success message to the user
                                } else { // If the payment amount is greater than the balance
                                    JOptionPane.showMessageDialog(frame, "Insufficient balance to pay the bill."); // Display an error message to the user
                                }
                            } catch (NumberFormatException ex) { // Catch any NumberFormatException that might occur if the user enters an invalid payment amount
                                JOptionPane.showMessageDialog(frame, "Invalid payment amount. Please enter a number."); // Display an error message to the user
                            }
                        }
                    } else { // If the bill was not found
                        JOptionPane.showMessageDialog(frame, "Bill not found."); // Display an error message to the user
                    }
                }
            } else { // If there are no bills in the bills ArrayList
                JOptionPane.showMessageDialog(frame, "No bills added yet."); // Display a message to the user
            }
        }
    }
    class Bill { // Define a class named Bill to represent individual bills
        String name; // String variable to store the name of the bill
        double amount; // Double variable to store the amount of the bill
        String dueDate; // String variable to store the due date of the bill
        public Bill(String name, double amount, String dueDate) { // Constructor for the Bill class
            this.name = name; // Initialize the name of the bill
            this.amount = amount; // Initialize the amount of the bill
            this.dueDate = dueDate; // Initialize the due date of the bill
        }
    }
    private void loadValuesFromLog() { // Method to load values from the Transactions_Log.txt file
        try (BufferedReader reader = new BufferedReader(new FileReader("Transactions_Log.txt"))) { // Create a BufferedReader to read the file
            String line; // Declare a String variable to store each line read from the file
            while ((line = reader.readLine()) != null) { // Read lines until the end of the file
                String[] parts = line.split(","); // Split the line into parts based on the comma delimiter
                if (parts.length == 2) { // Check if the line has two parts (variable name and value)
                    String variableName = parts[0].trim(); // Get the variable name and trim any leading or trailing whitespace
                    double value = Double.parseDouble(parts[1].trim()); // Parse the value as a double and trim any leading or trailing whitespace
                    switch (variableName) { // Use a switch statement to handle different variable names
                        case "Investment": // If the variable name is "Investment"
                            Investment = value; // Assign the value to the Investment variable
                            break; // Exit the switch statement
                        case "Loans": // If the variable name is "Loans"
                            Loans = value; // Assign the value to the Loans variable
                            break; // Exit the switch statement
                        case "Bills": // If the variable name is "Bills"
                            Bills = value; // Assign the value to the Bills variable
                            break; // Exit the switch statement
                    }
                }
            }
        } catch (FileNotFoundException e) { // Catch any FileNotFoundException that might occur if the file is not found
            System.err.println("Transactions_Log.txt not found: " + e.getMessage()); // Print an error message to the console
        } catch (IOException e) { // Catch any IOException that might occur during file reading
            System.err.println("Error reading Transactions_Log.txt: " + e.getMessage()); // Print an error message to the console
        }
    }
    private void saveValuesToLog() { // Method to save values to the Transactions_Log.txt file
        try (FileWriter fileWriter = new FileWriter("Transactions_Log.txt")) { // Create a FileWriter to write to the file
            fileWriter.write("Investment," + Investment + "\n"); // Write the Investment value to the file
            fileWriter.write("Loans," + Loans + "\n"); // Write the Loans value to the file
            fileWriter.write("Bills," + Bills + "\n"); // Write the Bills value to the file
        } catch (IOException e) { // Catch any IOException that might occur during file writing
            System.err.println("Error writing to Transactions_Log.txt: " + e.getMessage()); // Print an error message to the console
        }
    }

}