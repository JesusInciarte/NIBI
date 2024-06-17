import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Create_Account extends Multi_Purpose_Class implements ActionListener {
    JFrame frame;
    JButton redBox1Label, redBox2Label, redBox3Label, redBox4Label;
    JButton yellowBox1Label, yellowBox2Label, yellowBox3Label, yellowBox4Label;

    // Constructor for the Create_Account class
    Create_Account() {

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
        // label.setBounds(500,50000,100,100);

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
        // redPanel.setLayout(new BorderLayout());

        // Create and configure the blue Panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(0xFFFFFF));
        bluePanel.setBounds(230, 10, 1040, 100);

        // Create and configure the background Panel
        JPanel backGround = new JPanel();
        backGround.setBackground(new Color(0xEFEFEF));
        backGround.setBounds(0, 0, 1300, 690);
        backGround.setLayout(new BorderLayout());

        // ---------- UP ----------//

        // Create and configure the red box Panel for Savings Account
        JPanel redBox1 = new JPanel();
        redBox1.setBackground(new Color(0xFF1616));
        redBox1.setBounds(260, 120, 240, 150);
        redBox1.setLayout(new BorderLayout());
        redBox1.setVisible(true);
        // !!!!!!!!!! 1
        redBox1Label = new JButton("1. Savings Account");
        redBox1Label.setFont(new Font("Open Sans", Font.PLAIN, 20));
        redBox1Label.setForeground(new Color(0xFFFFFF));
        redBox1Label.setBackground(new Color(0xFF1616));
        redBox1Label.setBorderPainted(false); // Hide the border
        redBox1Label.setFocusPainted(false); // Hide the text border
        redBox1Label.addActionListener(this);
        redBox1.add(redBox1Label, BorderLayout.CENTER);

        // Create and configure the yellow box Panel for Checking Account
        JPanel yellowBox1 = new JPanel();
        yellowBox1.setBackground(new Color(0xFFDE00));
        yellowBox1.setBounds(510, 120, 240, 150);
        yellowBox1.setLayout(new BorderLayout());
        yellowBox1.setVisible(true);
        // ^^^^^^^^^^ 1
        yellowBox1Label = new JButton("2. Checking Account");
        yellowBox1Label.setFont(new Font("Open Sans", Font.PLAIN, 20));
        yellowBox1Label.setForeground(new Color(0xFFFFFF)); // text
        yellowBox1Label.setBackground(new Color(0xFFDE00)); // background
        yellowBox1Label.setBorderPainted(false); // Hide the border
        yellowBox1Label.setFocusPainted(false); // Hide the text border
        yellowBox1Label.addActionListener(this);
        yellowBox1.add(yellowBox1Label, BorderLayout.CENTER);

        // Create and configure the red box Panel for Money Market Account
        JPanel redBox2 = new JPanel();
        redBox2.setBackground(new Color(0xFF1616));
        redBox2.setBounds(760, 120, 240, 150);
        redBox2.setLayout(new BorderLayout());
        redBox2.setVisible(true);
        // !!!!!!!!!! 2
        redBox2Label = new JButton("<html>3. Money Market <br>Account<html>");
        redBox2Label.setFont(new Font("Open Sans", Font.PLAIN, 20));
        redBox2Label.setForeground(new Color(0xFFFFFF));
        redBox2Label.setBackground(new Color(0xFF1616));
        redBox2Label.setBorderPainted(false); // Hide the border
        redBox2Label.setFocusPainted(false); // Hide the text border
        redBox2Label.addActionListener(this);
        redBox2.add(redBox2Label, BorderLayout.CENTER);

        // Create and configure the yellow box Panel for Certificate of Deposit (CD)
        JPanel yellowBox2 = new JPanel();
        yellowBox2.setBackground(new Color(0xFFDE00));
        yellowBox2.setBounds(1010, 120, 240, 150);
        yellowBox2.setLayout(new BorderLayout());
        yellowBox2.setVisible(true);
        // ^^^^^^^^^^ 2
        yellowBox2Label = new JButton("<html>4. Certificate of <br>Deposit (CD)<html>");
        yellowBox2Label.setFont(new Font("Open Sans", Font.PLAIN, 20));
        yellowBox2Label.setForeground(new Color(0xFFFFFF)); // text
        yellowBox2Label.setBackground(new Color(0xFFDE00)); // background
        yellowBox2Label.setBorderPainted(false); // Hide the border
        yellowBox2Label.setFocusPainted(false); // Hide the text border
        yellowBox2Label.addActionListener(this);
        yellowBox2.add(yellowBox2Label, BorderLayout.CENTER);

        // ---------- down ----------//

        // Create and configure the yellow box Panel for Individual Retirement Account (IRA)
        JPanel yellowBox3 = new JPanel();
        yellowBox3.setBackground(new Color(0xFFDE00));
        yellowBox3.setBounds(260, 280, 240, 150);
        yellowBox3.setLayout(new BorderLayout());
        yellowBox3.setVisible(true);
        // ^^^^^^^^^^ 3
        yellowBox3Label = new JButton("<html>5. Individual Retirement <br> Account (IRA)<html>");
        yellowBox3Label.setFont(new Font("Open Sans", Font.PLAIN, 20));
        yellowBox3Label.setForeground(new Color(0xFFFFFF)); // text
        yellowBox3Label.setBackground(new Color(0xFFDE00)); // background
        yellowBox3Label.setBorderPainted(false); // Hide the border
        yellowBox3Label.setFocusPainted(false); // Hide the text border
        yellowBox3Label.addActionListener(this);
        yellowBox3.add(yellowBox3Label, BorderLayout.CENTER);

        // Create and configure the red box Panel for Business Account
        JPanel redBox3 = new JPanel();
        redBox3.setBackground(new Color(0xFF1616));
        redBox3.setBounds(510, 280, 240, 150);
        redBox3.setLayout(new BorderLayout());
        redBox3.setVisible(true);
        // !!!!!!!!!! 3
        redBox3Label = new JButton("6. Business Account");
        redBox3Label.setFont(new Font("Open Sans", Font.PLAIN, 20));
        redBox3Label.setForeground(new Color(0xFFFFFF));
        redBox3Label.setBackground(new Color(0xFF1616));
        redBox3Label.setBorderPainted(false); // Hide the border
        redBox3Label.setFocusPainted(false); // Hide the text border
        redBox3Label.addActionListener(this);
        redBox3.add(redBox3Label, BorderLayout.CENTER);

        // Create and configure the yellow box Panel for Student Account
        JPanel yellowBox4 = new JPanel();
        yellowBox4.setBackground(new Color(0xFFDE00));
        yellowBox4.setBounds(760, 280, 240, 150);
        yellowBox4.setLayout(new BorderLayout());
        yellowBox4.setVisible(true);
        // ^^^^^^^^^^ 4
        yellowBox4Label = new JButton("7. Student Account");
        yellowBox4Label.setFont(new Font("Open Sans", Font.PLAIN, 20));
        yellowBox4Label.setForeground(new Color(0xFFFFFF)); // text
        yellowBox4Label.setBackground(new Color(0xFFDE00)); // background
        yellowBox4Label.setBorderPainted(false); // Hide the border
        yellowBox4Label.setFocusPainted(false); // Hide the text border
        yellowBox4Label.addActionListener(this);
        yellowBox4.add(yellowBox4Label, BorderLayout.CENTER);

        // Create and configure the red box Panel for Health Savings Account (HSA)
        JPanel redBox4 = new JPanel();
        redBox4.setBackground(new Color(0xFF1616));
        redBox4.setBounds(1010, 280, 240, 150);
        redBox4.setLayout(new BorderLayout());
        redBox4.setVisible(true);
        // !!!!!!!!!! 4
        redBox4Label = new JButton("<html>8. Health Savings<br>Account (HSA)<html>");
        redBox4Label.setFont(new Font("Open Sans", Font.PLAIN, 20));
        redBox4Label.setForeground(new Color(0xFFFFFF));
        redBox4Label.setBackground(new Color(0xFF1616));
        redBox4Label.setBorderPainted(false); // Hide the border
        redBox4Label.setFocusPainted(false); // Hide the text border
        redBox4Label.addActionListener(this);
        redBox4.add(redBox4Label, BorderLayout.CENTER);

        // ---------- Done ----------//

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
        frame.add(redBox1);
        frame.add(redBox2);
        frame.add(yellowBox1);
        frame.add(yellowBox2);
        // *****************************************************************************************************/
        frame.add(redBox3);
        frame.add(redBox4);
        frame.add(yellowBox3);
        frame.add(yellowBox4);
        frame.add(MenuPanel);
        frame.add(bluePanel);
        frame.add(backGround);
        // *****************************************************************************************************/
    }

    // Method to handle button clicks

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
        // Handle "Savings Account" button click
        if (e.getSource() == redBox1Label) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Savings Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You have selected Savings Account <br>" +
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
                // Set the account type to "Savings Account"
                accountType = "Savings Account";
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
        // Handle "Money Market Account" button click
        if (e.getSource() == redBox2Label) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Money Market Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You have selected Money Market Account <br>" +
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
                // Set the account type to "Money Market Account"
                accountType = "Money Market Account";
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
        // Handle "Business Account" button click
        if (e.getSource() == redBox3Label) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Business Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You have selected Business Account <br>" +
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
                // Set the account type to "Business Account"
                accountType = "Business Account";
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
        // Handle "Health Savings Account (HSA)" button click
        if (e.getSource() == redBox4Label) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Health Savings Account (HSA)
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You have selected Health Savings Account (HSA) <br>" +
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
                // Set the account type to "HSA"
                accountType = "HSA";
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
        // Handle "Checking Account" button click
        if (e.getSource() == yellowBox1Label) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Checking Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You have selected Checking Account <br>" +
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
                // Set the account type to "Checking Account"
                accountType = "Checking Account";
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
        // Handle "Certificate of Deposit (CD)" button click
        if (e.getSource() == yellowBox2Label) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Certificate of Deposit (CD)
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You have selected Certificate of Deposit (CD) <br>" +
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
                // Set the account type to "Certificate of Deposit (CD)"
                accountType = "Certificate of Deposit (CD)";
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
        // Handle "Individual Retirement Account (IRA)" button click
        if (e.getSource() == yellowBox3Label) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Individual Retirement Account (IRA)
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You have selected Individual Retirement Account (IRA) <br>" +
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
                // Set the account type to "IRA"
                accountType = "IRA";
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
        // Handle "Student Account" button click
        if (e.getSource() == yellowBox4Label) {
            // Create an ImageIcon for the dialog box
            ImageIcon icon = new ImageIcon("LOGO8.png");
            // Define the response options for the dialog box
            String[] respomses = { "Confirm", "Cancel" };
            // Show a dialog box with information about the Student Account
            int answer = JOptionPane.showOptionDialog(null, "<html>" +
                    "You have selected Student Account <br>" +
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
                // Set the account type to "Student Account"
                accountType = "Student Account";
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
        }    // 1269 now 1786
    }       // 1786 now 2370
    
}
