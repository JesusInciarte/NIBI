import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Switch_Account extends Multi_Purpose_Class implements ActionListener {
    JFrame frame;
    JButton financialCalculator, budgetingTool, Transactions, withdrawals, BackToMenu, LogOut;

    Switch_Account() {

        ImageIcon image = new ImageIcon("LOGO6.png");

        JLabel label = new JLabel("N I B I");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.TOP); // set text top, center, or bottom of image
        label.setHorizontalAlignment(JLabel.CENTER); // set text left, center, or right of image
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, or right of image
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text top, center, or bottom of image
        label.setFont(new Font("Open Sans", Font.PLAIN, 20)); // set font of text
        label.setForeground(new Color(0xFFFFFF)); // set color of text
        // label.setBounds(500,50000,100,100);

        JButton financialCalculator = new JButton("Financial Calculator");
        financialCalculator.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        financialCalculator.setForeground(new Color(0xFFFFFF)); // set color of text
        financialCalculator.setBounds(10, 10, 100, 50);
        financialCalculator.setBorderPainted(false); // Hide the border
        financialCalculator.setFocusPainted(false); // Hide the text border
        financialCalculator.setContentAreaFilled(false);

        JButton budgetingTool = new JButton("Budgeting Tool");
        budgetingTool.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        budgetingTool.setForeground(new Color(0xFFFFFF)); // set color of text
        budgetingTool.setBounds(10, 10, 100, 50);
        budgetingTool.setBorderPainted(false); // Hide the border
        budgetingTool.setFocusPainted(false); // Hide the text border
        budgetingTool.setContentAreaFilled(false);

        JButton Transactions = new JButton("        Loans       ");
        Transactions.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        Transactions.setForeground(new Color(0xFFFFFF)); // set color of text
        Transactions.setBounds(10, 10, 100, 50);
        Transactions.setBorderPainted(false); // Hide the border
        Transactions.setFocusPainted(false); // Hide the text border
        Transactions.setContentAreaFilled(false);

        JButton withdrawals = new JButton("withdrawals");
        withdrawals.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        withdrawals.setForeground(new Color(0xFFFFFF)); // set color of text
        withdrawals.setBounds(10, 10, 100, 50);
        withdrawals.setBorderPainted(false); // Hide the border
        withdrawals.setFocusPainted(false); // Hide the text border
        withdrawals.setContentAreaFilled(false);

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

        JPanel MenuPanel = new JPanel();
        MenuPanel.setBackground(new Color(0x010000));
        MenuPanel.setBounds(10, 10, 240, 630);
        // redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(0xFF1616)); // red
        // bluePanel.setBackground(new Color(0xFFDE00)); // yellow
        bluePanel.setBounds(230, 10, 1040, 100);

        JPanel accountDisplay = new JPanel();
        accountDisplay.setBackground(new Color(0xEFEFEF));
        accountDisplay.setBounds(260, 120, 1010, 520);
        // accountDisplay.setLayout(new BorderLayout());
        accountDisplay.setVisible(true);
        accountDisplay.setLayout(new GridLayout(5, 5, 10, 10)); // # rows, # columns

        JPanel[] panel = new JPanel[20];

        // for loop for array of buttons
        for (int i = 0; i < 20; i++) {
            panel[i] = new JPanel(); // Create a new JPanel instance
            panel[i].setBackground(new Color(0xFFDE00)); // Set a background color

            // Create a button and add it to the panel
            JButton button = new JButton("Button " + (i + 1));
            button.setFont(new Font("Open Sans", Font.PLAIN, 20));
            button.setBackground(new Color(0xFFDE00));
            button.setForeground(new Color(0xEFEFEF));
            button.setBorderPainted(false); // Hide the border
            button.setFocusPainted(false); // Hide the text border
            button.setHorizontalTextPosition(JButton.CENTER);
            button.setVerticalTextPosition(JButton.CENTER);
            button.addActionListener(this);
            button.setActionCommand("button" + (i + 1));
            panel[i].add(button);

            accountDisplay.add(panel[i]); // Add the panel to accountDisplay
        }

        JPanel backGround = new JPanel();
        backGround.setBackground(new Color(0xEFEFEF));
        backGround.setBounds(0, 0, 1300, 690);
        backGround.setLayout(new BorderLayout());

        frame = new JFrame();
        ImageIcon image2 = new ImageIcon("LOGO8.png"); // creates a new ImageIcon
        frame.setIconImage(image2.getImage()); // sets the icon of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // frame.setSize(1300, 690);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        // *****************************************************************************************************/
        MenuPanel.add(label);
        MenuPanel.add(financialCalculator);
        MenuPanel.add(budgetingTool);
        MenuPanel.add(Transactions);
        MenuPanel.add(withdrawals);
        MenuPanel.add(BackToMenu);
        MenuPanel.add(LogOut);
        // *****************************************************************************************************/
        frame.add(accountDisplay);
        frame.add(MenuPanel);
        frame.add(bluePanel);
        frame.add(backGround);
        // *****************************************************************************************************/

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("BackToMenu")) {
            frame.dispose(); // Terminate the frame
        }
        if (e.getActionCommand().equals("terminate")) {
            frame.dispose(); // Terminate the frame
            login = false;
        }
    }
}