import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Account_Management extends Multi_Purpose_Class implements ActionListener {

    // Declare UI components
    JFrame frame;
    // Array to store buttons (1-9)
    JButton[] buttonPanel = new JButton[9];
    // Label to display the type of account
    JLabel labelRedBox1;

    // Constructor for the Account_Management class
        Account_Management() {
            // Load logo image
            ImageIcon image = new ImageIcon("LOGO6.png");
    
            // Create and configure the "N I B I" label
            JLabel label = new JLabel("N I B I");
            label.setIcon(image);
            label.setVerticalAlignment(JLabel.TOP); // set text top, center, or bottom of image
            label.setHorizontalAlignment(JLabel.CENTER); // set text left, center, or right of image
            label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, or right of image
            label.setVerticalTextPosition(JLabel.BOTTOM); // set text top, center, or bottom of image
            label.setFont(new Font("Open Sans", Font.PLAIN, 20)); // set font of text
            label.setForeground(new Color(0xFFFFFF)); // set color of text
    
            // Create and configure the "Financial Calculator" button
        JButton financialCalculator = new JButton("Savings Account");
        financialCalculator.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        financialCalculator.setForeground(new Color(0xFFFFFF)); // set color of text
        financialCalculator.setBounds(10, 10, 100, 50);
        financialCalculator.setBorderPainted(false); // Hide the border
        financialCalculator.setFocusPainted(false); // Hide the text border
        financialCalculator.setContentAreaFilled(false);

        // Create and configure the "Budgeting Tool" button
        JButton budgetingTool = new JButton("Checking Account");
        budgetingTool.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        budgetingTool.setForeground(new Color(0xFFFFFF)); // set color of text
        budgetingTool.setBounds(10, 10, 100, 50);
        budgetingTool.setBorderPainted(false); // Hide the border
        budgetingTool.setFocusPainted(false); // Hide the text border
        budgetingTool.setContentAreaFilled(false);

        // Create and configure the "Loans" button
        JButton Transactions = new JButton("Money Market Account");
        Transactions.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        Transactions.setForeground(new Color(0xFFFFFF)); // set color of text
        Transactions.setBounds(10, 10, 100, 50);
        Transactions.setBorderPainted(false); // Hide the border
        Transactions.setFocusPainted(false); // Hide the text border
        Transactions.setContentAreaFilled(false);

        // Create and configure the "Withdrawals" button
        JButton withdrawals = new JButton("Certificate of Deposit");
        withdrawals.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        withdrawals.setForeground(new Color(0xFFFFFF)); // set color of text
        withdrawals.setBounds(10, 10, 100, 50);
        withdrawals.setBorderPainted(false); // Hide the border
        withdrawals.setFocusPainted(false); // Hide the text border
        withdrawals.setContentAreaFilled(false);
        // Create and configure the "Withdrawals" button
        JButton menuButton1 = new JButton("Individual Retirement Account");
        menuButton1.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        menuButton1.setForeground(new Color(0xFFFFFF)); // set color of text
        menuButton1.setBounds(10, 10, 100, 50);
        menuButton1.setBorderPainted(false); // Hide the border
        menuButton1.setFocusPainted(false); // Hide the text border
        menuButton1.setContentAreaFilled(false);
        // Create and configure the "Withdrawals" button
        JButton menuButton2 = new JButton("Business Account");
        menuButton2.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        menuButton2.setForeground(new Color(0xFFFFFF)); // set color of text
        menuButton2.setBounds(10, 10, 100, 50);
        menuButton2.setBorderPainted(false); // Hide the border
        menuButton2.setFocusPainted(false); // Hide the text border
        menuButton2.setContentAreaFilled(false);
        // Create and configure the "Withdrawals" button
        JButton menuButton3 = new JButton("Student Account");
        menuButton3.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        menuButton3.setForeground(new Color(0xFFFFFF)); // set color of text
        menuButton3.setBounds(10, 10, 100, 50);
        menuButton3.setBorderPainted(false); // Hide the border
        menuButton3.setFocusPainted(false); // Hide the text border
        menuButton3.setContentAreaFilled(false);
        // Create and configure the "Withdrawals" button
        JButton menuButton4 = new JButton("Health Savings Account");
        menuButton4.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        menuButton4.setForeground(new Color(0xFFFFFF)); // set color of text
        menuButton4.setBounds(10, 10, 100, 50);
        menuButton4.setBorderPainted(false); // Hide the border
        menuButton4.setFocusPainted(false); // Hide the text border
        menuButton4.setContentAreaFilled(false);
    
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
            LogOut.setActionCommand("terminate");
    
            // Create and configure the Menu Panel
            JPanel MenuPanel = new JPanel();
            MenuPanel.setBackground(new Color(0x010000));
            MenuPanel.setBounds(10, 10, 240, 630);
    
            // Create and configure the blue Panel
            JPanel bluePanel = new JPanel();
            bluePanel.setBackground(new Color(0xFFFFFF));
            bluePanel.setBounds(230, 10, 1040, 100);
    
            // Create and configure the background Panel
            JPanel backGround = new JPanel();
            backGround.setBackground(new Color(0xEFEFEF));
            backGround.setBounds(0, 0, 1300, 690);
            backGround.setLayout(new BorderLayout());
    
            // Create and configure the option Panel
            JPanel optionPanel = new JPanel();
            optionPanel.setBackground(new Color(0xEFEFEF));
            optionPanel.setBounds(260, 280, 1010, 360);
            optionPanel.setLayout(new GridLayout(3, 3, 10, 10));
    
            // Loop to create buttons in the array
            for (int i = 0; i < 9; i++) {
                // Create a new JButton
                buttonPanel[i] = new JButton(String.valueOf(i + 1));
                // Add ActionListener to the button
                buttonPanel[i].addActionListener(this);
                // Set the ActionCommand for the button
                buttonPanel[i].setActionCommand(String.valueOf(i + 1));
                // Enable the button
                buttonPanel[i].setEnabled(true);
                // Set button appearance
                buttonPanel[i].setBorderPainted(false); // Hide the border
                buttonPanel[i].setFocusPainted(false); // Hide the text border
                buttonPanel[i].setBackground(new Color(0xFFDE00));
                buttonPanel[i].setForeground(new Color(0xEFEFEF));
                buttonPanel[i].setFont(new Font("Open Sans", Font.PLAIN, 20));
                // Add the button to the optionPanel
                optionPanel.add(buttonPanel[i]); // array of buttons (1-16)
            }
    
            // Set text and appearance for each button
            buttonPanel[0].setText("Switch to Savings Account");
            buttonPanel[0].setBackground(new Color(0xFF1616));
            buttonPanel[0].setForeground(new Color(0xEFEFEF));
    
            buttonPanel[1].setText("Switch to Checking Account");
            buttonPanel[1].setBackground(new Color(0xFFDE00));
            buttonPanel[1].setForeground(new Color(0xEFEFEF));
    
            buttonPanel[2].setText("Switch to Money Market Account");
            buttonPanel[2].setBackground(new Color(0xFF1616));
            buttonPanel[2].setForeground(new Color(0xEFEFEF));
    
            buttonPanel[3].setText("<html>Switch to Certificate <br>of Deposit (CD)<html>");
            buttonPanel[3].setBackground(new Color(0xFFDE00));
            buttonPanel[3].setForeground(new Color(0xEFEFEF));
    
            buttonPanel[4].setText("<html>Switch to Individual <br>Retirement Account (IRA)<html>");
            buttonPanel[4].setBackground(new Color(0xFF1616));
            buttonPanel[4].setForeground(new Color(0xEFEFEF));
    
            buttonPanel[5].setText("Switch to Business Account");
            buttonPanel[5].setBackground(new Color(0xFFDE00));
            buttonPanel[5].setForeground(new Color(0xEFEFEF));
    
            buttonPanel[6].setText("Switch to Student Account");
            buttonPanel[6].setBackground(new Color(0xFF1616));
            buttonPanel[6].setForeground(new Color(0xEFEFEF));
    
            buttonPanel[7].setText("<html>Switch to Health <br>Savings Account (HSA)<html>");
            buttonPanel[7].setBackground(new Color(0xFFDE00));
            buttonPanel[7].setForeground(new Color(0xEFEFEF));
    
            buttonPanel[8].setText("Close account");
            buttonPanel[8].setBackground(Color.black);
            buttonPanel[8].setForeground(new Color(0xFF1616));
    
            // Create and configure the red box Panel
            JPanel redBox1 = new JPanel();
            redBox1.setBackground(new Color(0xFF1616));
            redBox1.setBounds(260, 120, 500, 150);
            redBox1.setLayout(new BorderLayout());
            redBox1.setVisible(true);
    
            // Create and configure the label for the red box Panel
            labelRedBox1 = new JLabel("Type of Account: " + accountType);
            labelRedBox1.setFont(new Font("Open Sans", Font.PLAIN, 30));
            labelRedBox1.setHorizontalAlignment(JLabel.CENTER);
            labelRedBox1.setVerticalAlignment(JLabel.CENTER);
            labelRedBox1.setForeground(new Color(0xEFEFEF));
    
            // Create and configure the yellow box Panel
            JPanel yellowBox1 = new JPanel();
            yellowBox1.setBackground(new Color(0xFFDE00));
            yellowBox1.setBounds(770, 120, 500, 150);
            yellowBox1.setLayout(new BorderLayout());
            yellowBox1.setVisible(true);
    
            // Create and configure the label for the yellow box Panel
            JLabel labelYellowBox1 = new JLabel("Balance in Account: " + String.valueOf(money.format(Balance)));
            labelYellowBox1.setFont(new Font("Open Sans", Font.PLAIN, 30));
            labelYellowBox1.setHorizontalAlignment(JLabel.CENTER);
            labelYellowBox1.setVerticalAlignment(JLabel.CENTER);
            labelYellowBox1.setForeground(new Color(0xEFEFEF));
    
            // Create and configure the main frame
            frame = new JFrame();
            ImageIcon image2 = new ImageIcon("LOGO8.png"); // creates a new ImageIcon
            frame.setIconImage(image2.getImage()); // sets the icon of the JFrame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);
            // *****************************************************************************************************/
            MenuPanel.add(label);
            MenuPanel.add(financialCalculator);
            MenuPanel.add(budgetingTool);
            MenuPanel.add(Transactions);
            MenuPanel.add(withdrawals);
            MenuPanel.add(menuButton1);
            MenuPanel.add(menuButton2);
            MenuPanel.add(menuButton3);
            MenuPanel.add(menuButton4);
            MenuPanel.add(BackToMenu);
            MenuPanel.add(LogOut);
            // *****************************************************************************************************/
            redBox1.add(labelRedBox1, BorderLayout.CENTER);
            yellowBox1.add(labelYellowBox1, BorderLayout.CENTER);
            // *****************************************************************************************************/
            frame.add(redBox1);
            frame.add(optionPanel);
            frame.add(yellowBox1);
            frame.add(MenuPanel);
            frame.add(bluePanel);
            frame.add(backGround);
        }
    
        // *****************************************************************************************************/
    public void actionPerformed(ActionEvent e) {
        // Handle "Back To Main Menu" button click
        if (e.getActionCommand().equals("BackToMenu")) {
            frame.dispose(); // Terminate the frame
        }
        // Handle "Log Out" button click
        if (e.getActionCommand().equals("terminate")) {
            frame.dispose(); // Terminate the frame
            login = false;
        }
        // Handle "Switch to Savings Account" button click
        if (e.getSource() == buttonPanel[0]) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Savings Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You wish to switch from " + accountType + " to Savings Account <br>" +
                    "- Purpose: To save money while earning interest.<br>" +
                    "- Features <br>" +
                    "  - Typically offers interest on the balance.<br>" +
                    "  - Limited number of transactions per month.<br>" +
                    "  - May have a minimum balance requirement.<br>" +
                    "</html>", "Savings Account",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
            // Handle the user's response to the dialog box
            if (answer == 0) {
                // Display a success message if the user confirms
                JOptionPane.showMessageDialog(null, "Your account has been created", "Account Created",
                        JOptionPane.PLAIN_MESSAGE);
                // Update the account type
                accountType = "Savings Account";
                // Update the label displaying the account type
                labelRedBox1.setText("Type of Account: " + accountType);
            } else if (answer == 1) {
                // Display a message if the user cancels
                JOptionPane.showMessageDialog(null, "Your account has not been created", "Account Not Created",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                // Display an error message if there's an issue
                JOptionPane.showMessageDialog(null, "Error. Account Not Created, please try again.",
                        "Account Not Created",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Handle "Switch to Checking Account" button click
        if (e.getSource() == buttonPanel[1]) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Checking Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You wish to switch from " + accountType + " to Checking Account <br>" +
                    "- Purpose For daily transactions and regular use.<br>" +
                    "- Features <br>" +
                    "  - Easy access to funds via checks, debit cards, and ATMs.<br>" +
                    "  - Unlimited transactions.<br>" +
                    "  - Usually, no or low interest.<br><br>" +
                    "</html>", "Checking Account",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
            // Handle the user's response to the dialog box
            if (answer == 0) {
                // Display a success message if the user confirms
                JOptionPane.showMessageDialog(null, "Your account has been created", "Account Created",
                        JOptionPane.PLAIN_MESSAGE);
                // Update the account type
                accountType = "Checking Account";
                // Update the label displaying the account type
                labelRedBox1.setText("Type of Account: " + accountType);
            } else if (answer == 1) {
                // Display a message if the user cancels
                JOptionPane.showMessageDialog(null, "Your account has not been created", "Account Not Created",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                // Display an error message if there's an issue
                JOptionPane.showMessageDialog(null, "Error. Account Not Created, please try again.",
                        "Account Not Created",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Handle "Switch to Money Market Account" button click
        if (e.getSource() == buttonPanel[2]) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Money Market Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You wish to switch from " + accountType + " to Money Market Account <br>" +
                    "- Purpose To save money with a higher interest rate than a regular savings account.<br>" +
                    "- Features <br>" +
                    "  - Higher interest rates.<br>" +
                    "  - Limited check-writing ability.<br>" +
                    "  - Higher minimum balance requirements.<br><br>" +
                    "</html>", "Money Market Account",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
            // Handle the user's response to the dialog box
            if (answer == 0) {
                // Display a success message if the user confirms
                JOptionPane.showMessageDialog(null, "Your account has been created", "Account Created",
                        JOptionPane.PLAIN_MESSAGE);
                // Update the account type
                accountType = "Money Market Account";
                // Update the label displaying the account type
                labelRedBox1.setText("<html>Type of Account: Money Market <br>Account<html>");
            } else if (answer == 1) {
                // Display a message if the user cancels
                JOptionPane.showMessageDialog(null, "Your account has not been created", "Account Not Created",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                // Display an error message if there's an issue
                JOptionPane.showMessageDialog(null, "Error. Account Not Created, please try again.",
                        "Account Not Created",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Handle "Switch to Certificate of Deposit (CD)" button click
        if (e.getSource() == buttonPanel[3]) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Certificate of Deposit (CD)
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You wish to switch from " + accountType + " to Certificate of Deposit (CD) <br>" +
                    "- Purpose To save money over a fixed term with a guaranteed interest rate.<br>" +
                    "- Features <br>" +
                    "  - Fixed interest rate.<br>" +
                    "  - Fixed term (e.g., 6 months, 1 year).<br>" +
                    "  - Penalty for early withdrawal.<br><br>" +
                    "</html>", "Certificate of Deposit (CD)",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
            // Handle the user's response to the dialog box
            if (answer == 0) {
                // Display a success message if the user confirms
                JOptionPane.showMessageDialog(null, "Your account has been created", "Account Created",
                        JOptionPane.PLAIN_MESSAGE);
                // Update the account type
                accountType = "Certificate of Deposit (CD)";
                // Update the label displaying the account type
                labelRedBox1.setText("<html>Type of Account: Certificate of<br>Deposit (CD)<html>");
            } else if (answer == 1) {
                // Display a message if the user cancels
                JOptionPane.showMessageDialog(null, "Your account has not been created", "Account Not Created",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                // Display an error message if there's an issue
                JOptionPane.showMessageDialog(null, "Error. Account Not Created, please try again.",
                        "Account Not Created",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Handle "Switch to Individual Retirement Account (IRA)" button click
        if (e.getSource() == buttonPanel[4]) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Individual Retirement Account (IRA)
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You wish to switch from " + accountType + " to Individual Retirement Account (IRA) <br>" +
                    "- Purpose To save for retirement with tax advantages.<br>" +
                    "- Features <br>" +
                    "  - Tax-deferred or tax-free growth.<br>" +
                    "  - Contribution limits.<br>" +
                    "  - Penalties for early withdrawal before retirement age.<br><br>" +
                    "</html>", "Individual Retirement Account (IRA)",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
            // Handle the user's response to the dialog box
            if (answer == 0) {
                // Display a success message if the user confirms
                JOptionPane.showMessageDialog(null, "Your account has been created", "Account Created",
                        JOptionPane.PLAIN_MESSAGE);
                // Update the account type
                accountType = "IRA";
                // Update the label displaying the account type
                labelRedBox1.setText("Type of Account: " + accountType);
            } else if (answer == 1) {
                // Display a message if the user cancels
                JOptionPane.showMessageDialog(null, "Your account has not been created", "Account Not Created",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                // Display an error message if there's an issue
                JOptionPane.showMessageDialog(null, "Error. Account Not Created, please try again.",
                        "Account Not Created",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Handle "Switch to Business Account" button click
        if (e.getSource() == buttonPanel[5]) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Business Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You wish to switch from " + accountType + " to Business Account <br>" +
                    "- Purpose For business transactions and management.<br>" +
                    "- Features <br>" +
                    "  - Can be a checking or savings account.<br>" +
                    "  - Tailored services for businesses, such as payroll and merchant services.<br><br>" +
                    "</html>", "Business Account",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
            // Handle the user's response to the dialog box
            if (answer == 0) {
                // Display a success message if the user confirms
                JOptionPane.showMessageDialog(null, "Your account has been created", "Account Created",
                        JOptionPane.PLAIN_MESSAGE);
                // Update the account type
                accountType = "Business Account";
                // Update the label displaying the account type
                labelRedBox1.setText("Type of Account: " + accountType);
            } else if (answer == 1) {
                // Display a message if the user cancels
                JOptionPane.showMessageDialog(null, "Your account has not been created", "Account Not Created",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                // Display an error message if there's an issue
                JOptionPane.showMessageDialog(null, "Error. Account Not Created, please try again.",
                        "Account Not Created",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Handle "Switch to Student Account" button click
        if (e.getSource() == buttonPanel[6]) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Student Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You wish to switch from " + accountType + " to Student Account <br>" +
                    "- Purpose For students with unique needs.<br>" +
                    "- Features <br>" +
                    "  - Lower fees.<br>" +
                    "  - No or low minimum balance requirements.<br>" +
                    "  - May offer additional perks like online banking tools.<br><br>" +
                    "</html>", "Student Account",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
            // Handle the user's response to the dialog box
            if (answer == 0) {
                // Display a success message if the user confirms
                JOptionPane.showMessageDialog(null, "Your account has been created", "Account Created",
                        JOptionPane.PLAIN_MESSAGE);
                // Update the account type
                accountType = "Student Account";
                // Update the label displaying the account type
                labelRedBox1.setText("Type of Account: " + accountType);
            } else if (answer == 1) {
                // Display a message if the user cancels
                JOptionPane.showMessageDialog(null, "Your account has not been created", "Account Not Created",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                // Display an error message if there's an issue
                JOptionPane.showMessageDialog(null, "Error. Account Not Created, please try again.",
                        "Account Not Created",
                        JOptionPane.ERROR_MESSAGE);
            } // 863 now 1269
        }
        // Handle "Switch to Health Savings Account (HSA)" button click
        if (e.getSource() == buttonPanel[7]) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Health Savings Account (HSA)
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You wish to switch from " + accountType + " to Health Savings Account (HSA) <br>" +
                    "- Purpose To save money specifically for qualified medical expenses.<br>" +
                    "- Features <br>" +
                    "  - Tax Benefits: Contributions are tax-deductible, and withdrawals for qualified medical expenses are tax-free.<br>"
                    +
                    "  - High-Deductible Health Plans (HDHPs): Only individuals enrolled in HDHPs are eligible to open an HSA.<br>"
                    +
                    "  - Contribution Limits: There are annual limits on contributions set by the IRS.<br>" +
                    "</html>", "Health Savings Account (HSA)",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
            // Handle the user's response to the dialog box
            if (answer == 0) {
                // Display a success message if the user confirms
                JOptionPane.showMessageDialog(null, "Your account has been created", "Account Created",
                        JOptionPane.PLAIN_MESSAGE);
                // Update the account type
                accountType = "HSA";
                // Update the label displaying the account type
                labelRedBox1.setText("Type of Account: " + accountType);
            } else if (answer == 1) {
                // Display a message if the user cancels
                JOptionPane.showMessageDialog(null, "Your account has not been created", "Account Not Created",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                // Display an error message if there's an issue
                JOptionPane.showMessageDialog(null, "Error. Account Not Created, please try again.",
                        "Account Not Created",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        // Handle "Close account" button click
        if (e.getSource() == buttonPanel[8]) {
           // Create an ImageIcon for the dialog box
           ImageIcon icon = new ImageIcon("LOGO8.png");
           // Define the response options for the dialog box
           String[] respomses = { "Confirm", "Cancel" };
           // Show a dialog box with information about the Health Savings Account (HSA)
           int answer = JOptionPane.showOptionDialog(null, "<html>" +"Are you sure you want to close your " + accountType + " account?"+ 
                "<br>Confirm Account Closure"+  
                   "</html>", "Close Account",
                   JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, respomses, 0);
           // Handle the user's response to the dialog box
           if (answer == 0) {
               // Display a success message if the user confirms
               JOptionPane.showMessageDialog(null, "Your account has been closed successfully.", "Account Closed",
                       JOptionPane.PLAIN_MESSAGE);
               // Update the account type
               accountType = "Account Closed";
               // Update the label displaying the account type
               labelRedBox1.setText("Type of Account: " + accountType);
           } else if (answer == 1) {
               // Display a message if the user cancels
               JOptionPane.showMessageDialog(null, "Your account has not been Closed", "Account Not Closed",
                       JOptionPane.PLAIN_MESSAGE);
           } else {
               // Display an error message if there's an issue
               JOptionPane.showMessageDialog(null, "Error. Account Not Closed, please try again.",
                       "Account Not Closed",
                       JOptionPane.ERROR_MESSAGE);
           }
    }
}
}
            