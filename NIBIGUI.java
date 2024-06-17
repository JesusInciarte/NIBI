
/**
 * NIBIUI.java
 * A display for the Negron-Inciarte Banking Institucion user interface.
 * 
 * Jesus
 * MArch 29, 2024
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class NIBIGUI extends Multi_Purpose_Class implements ActionListener {
  JFrame frame; // The main JFrame for the application
  JPanel menu, panel, trasnLogPanel, trasnLogOptPanel; // Panels for different sections of the UI
  JLabel image, test, transLabel; // Labels for displaying images and text
  JButton label1, accountButton, loginButton, createAcountButton, emptyButton1, emptyButton2, trasnLogLabel;// Buttons for various actions
  JButton depositButton, Financial_Tools, Account_Management, Switch_Account, addButton; // More buttons
  JTextField textField; // Text field for user input
  Color buttonColor = new Color(22, 17, 11, 255); // Color for buttons
  Color backGroundColor = new Color(10, 9, 9); // Background color
  Color letterCouColor = new Color(251, 215, 31); // Color for text
  Color white = new Color(243, 243, 243); // White color
  String addString; // String variable for storing text

  /**
   * Constructor for the NIBIGUI class.
   * 
   * pre: None
   * post: All objects have been created and initialized.
   */
  public NIBIGUI() {
    // Create objects in Constructor
    // frame
    frame = new JFrame("NIBI | GUI"); // Create the main JFrame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation
    ImageIcon image2 = new ImageIcon("LOGO8.png"); // Create an ImageIcon for the frame icon
    frame.setIconImage(image2.getImage()); // Set the frame icon
    // menu
    menu = new JPanel(); // Create the menu panel
    menu.setLayout(new GridLayout(0, 4, 5, 5)); // Set the layout for the menu panel
    // panel
    panel = new JPanel(); // Create the main content panel
    // trasnLogPanel
    trasnLogPanel = new JPanel(); // Create a panel for transaction log
    trasnLogPanel.setLayout(new GridLayout(0, 1, 5, 5)); // Set the layout for the transaction log panel
    // trasnLogPanel
    trasnLogOptPanel = new JPanel(); // Create a panel for transaction log options
    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, menu, panel); // Create a split pane to divide the UI
    splitPane.setDividerLocation(50); // Set the initial position of the divider
    // button to deposit & withdraw money
    depositButton = new JButton("Deposit & Withdraw"); // Create the deposit/withdraw button
    depositButton.setActionCommand("createAcount"); // Set the action command for the button
    depositButton.addActionListener(this); // Add an ActionListener to handle button clicks
    depositButton.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font for the button
    depositButton.setBorderPainted(false); // Hide the border
    depositButton.setFocusPainted(false); // Hide the focus indicator
    depositButton.setContentAreaFilled(false); // Make the button transparent
    // button for financial tools for the user
    Financial_Tools = new JButton("Financial Tools"); // Create the Financial Tools button
    Financial_Tools.setActionCommand("createAcount"); // Set the action command
    Financial_Tools.addActionListener(this); // Add an ActionListener
    Financial_Tools.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font
    Financial_Tools.setBorderPainted(false); // Hide the border
    Financial_Tools.setFocusPainted(false); // Hide the focus indicator
    Financial_Tools.setContentAreaFilled(false); // Make the button transparent
    // button for Account Management
    Account_Management = new JButton("Account Management"); // Create the Account Management button
    Account_Management.setActionCommand("createAcount"); // Set the action command
    Account_Management.addActionListener(this); // Add an ActionListener
    Account_Management.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font
    Account_Management.setBorderPainted(false); // Hide the border
    Account_Management.setFocusPainted(false); // Hide the focus indicator
    Account_Management.setContentAreaFilled(false); // Make the button transparent
    // button to Switch Account
    Switch_Account = new JButton("Switch Account"); // Create the Switch Account button
    Switch_Account.setActionCommand("createAcount"); // Set the action command
    Switch_Account.addActionListener(this); // Add an ActionListener
    Switch_Account.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font
    Switch_Account.setBorderPainted(false); // Hide the border
    Switch_Account.setFocusPainted(false); // Hide the focus indicator
    Switch_Account.setContentAreaFilled(false); // Make the button transparent
    // add onjects to menu
    menu.add(depositButton); // Add the deposit/withdraw button to the menu
    menu.add(Financial_Tools); // Add the Financial Tools button to the menu
    menu.add(Account_Management); // Add the Account Management button to the menu
    menu.add(Switch_Account); // Add the Switch Account button to the menu
    // logo of NIBI (Negron-Incarte Banking Institution)
    image = new JLabel(new ImageIcon("LOGO6.png")); // Create a label for the NIBI logo
    // label for welcoming message
    label1 = new JButton("Welcome to the Negron-Inciarte Banking Institution"); // Create the welcome message label
    label1.setFont(new Font("Open Sans", Font.PLAIN, 40)); // Set the font for the welcome message
    label1.setHorizontalAlignment(SwingConstants.CENTER); // Center the text horizontally
    label1.setVerticalAlignment(SwingConstants.CENTER); // Center the text vertically
    label1.setBorderPainted(false); // Hide the border
    label1.setFocusPainted(false); // Hide the focus indicator
    // button to log in
    loginButton = new JButton("login"); // Create the login button
    loginButton.setActionCommand("loginButton"); // Set the action command
    loginButton.addActionListener(this); // Add an ActionListener
    loginButton.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font
    loginButton.setBorderPainted(false); // Hide the border
    loginButton.setFocusPainted(false); // Hide the focus indicator
    // button to create account
    createAcountButton = new JButton("Create Acount"); // Create the create account button
    createAcountButton.setActionCommand("createAcount"); // Set the action command
    createAcountButton.addActionListener(this); // Add an ActionListener
    createAcountButton.setFont(new Font("Open Sans", Font.PLAIN, 20)); // Set the font
    createAcountButton.setBorderPainted(false); // Hide the border
    createAcountButton.setFocusPainted(false); // Hide the focus indicator
    // adding objects to panel
    panel.add(image, BorderLayout.NORTH); // Add the logo to the panel
    panel.add(label1); // Add the welcome message to the panel
    panel.add(loginButton); // Add the login button to the panel
    panel.add(createAcountButton); // Add the create account button to the panel
    // making border and layout
    panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); // Add a border to the panel
    panel.setLayout(new FlowLayout(1, 100, 50)); // Set the layout for the panel
    frame.setContentPane(splitPane); // Set the split pane as the content pane of the frame
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame
    frame.setVisible(true); // Make the frame visible
    panel.setBackground(backGroundColor);// letterCouColor // Set the background color of the panel
    label1.setBackground(buttonColor);// letterCouColor // Set the background color of the welcome message
    label1.setForeground(letterCouColor);// buttonColor // Set the foreground color of the welcome message
    depositButton.setBackground(white); // Set the background color of the deposit/withdraw button
    Financial_Tools.setBackground(buttonColor); // Set the background color of the Financial Tools button
    Account_Management.setBackground(buttonColor); // Set the background color of the Account Management button
    Switch_Account.setBackground(buttonColor); // Set the background color of the Switch Account button
    loginButton.setBackground(buttonColor); // Set the background color of the login button
    createAcountButton.setBackground(buttonColor); // Set the background color of the create account button
    depositButton.setForeground(buttonColor); // Set the foreground color of the deposit/withdraw button
    Financial_Tools.setForeground(buttonColor); // Set the foreground color of the Financial Tools button
    Account_Management.setForeground(buttonColor); // Set the foreground color of the Account Management button
    Switch_Account.setForeground(buttonColor); // Set the foreground color of the Switch Account button
    loginButton.setForeground(letterCouColor); // Set the foreground color of the login button
    createAcountButton.setForeground(letterCouColor); // Set the foreground color of the create account button

  }

  /**
   * Method to handle button clicks.
   * 
   * The ActionEvent that triggered the method.
   * pre:None
   * post: Executes appropriate actions based on the button clicked.
   */
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == loginButton) {
      new login(); // Create a new login window
    }
    if ((e.getSource() == createAcountButton) && login == true) {
      new Create_Account(); // Create a new Create Account window
    }
    if ((e.getSource() == Switch_Account) && login == true) {
      new Switch_Account(); // Create a new Switch Account window
    }
    if ((e.getSource() == Account_Management) && login == true) {
      new Account_Management(); // Create a new Account Management window
    }
    if ((e.getSource() == depositButton) && login == true) {
      new Transactions_Log(); // Create a new Transactions Log window
    }
    if ((e.getSource() == Financial_Tools) && login == true) {
      new Financial_Tools(); // Create a new Financial Tools window
    }
    if (((e.getSource() == createAcountButton) || (e.getSource() == Switch_Account)
        || (e.getSource() == Account_Management) || (e.getSource() == depositButton)
        || (e.getSource() == Financial_Tools)) && login == false) {
      ImageIcon icon = new ImageIcon("LOGO8.png"); // Create an ImageIcon for the dialog box
      String[] respomses = { "Login", "Cancel" }; // Create an array of options for the dialog box
      int answer = JOptionPane.showOptionDialog(null, "<html>" +
          "You are currently trying to access a feature that requires login.<br>" +
          "Please login to continue <br>" +
          "</html>", "Log out",
          JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0); // Show the dialog box
      if (answer == 0) {
        new login(); // Create a new login window
      } else if (answer == 1) {
        JOptionPane.showMessageDialog(null, "We encourage you to log in to continue.",
            "User Not Logged In",
            JOptionPane.PLAIN_MESSAGE); // Show a message if the user cancels
      } else {
        JOptionPane.showMessageDialog(null, "Error. User Login Failed, please try again.",
            "User Not Logged In",
            JOptionPane.ERROR_MESSAGE); // Show an error message if the login fails
      }
    }
  }

  public static void main(String[] args) {
    new NIBIGUI(); // Create a new instance of the NIBIGUI class
  }
}
