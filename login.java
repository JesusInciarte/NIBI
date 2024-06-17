import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class login extends Multi_Purpose_Class implements ActionListener {

    // Declare UI components
    JFrame frame;
    JButton LogInButton, createAccountButton;
    JTextField userLogIn, passwordLogIn, userCreateAccount, passwordCreate;

    // Constructor for the login class
    login() {

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
        JButton financialCalculator = new JButton("     Log In      ");
        financialCalculator.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        financialCalculator.setForeground(new Color(0xFFFFFF)); // set color of text
        financialCalculator.setBounds(10, 10, 100, 50);
        financialCalculator.setBorderPainted(false); // Hide the border
        financialCalculator.setFocusPainted(false); // Hide the text border
        financialCalculator.setContentAreaFilled(false);

        // Create and configure the "Budgeting Tool" button
        JButton budgetingTool = new JButton("     Sing In     ");
        budgetingTool.setFont(new Font("Open Sans", Font.PLAIN, 15)); // set font of text
        budgetingTool.setForeground(new Color(0xFFFFFF)); // set color of text
        budgetingTool.setBounds(10, 10, 100, 50);
        budgetingTool.setBorderPainted(false); // Hide the border
        budgetingTool.setFocusPainted(false); // Hide the text border
        budgetingTool.setContentAreaFilled(false);

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

        // Create and configure the red box Panel
        JPanel redBox1 = new JPanel();
        redBox1.setBackground(new Color(0xFF1616));
        redBox1.setBounds(260, 120, 500, 520);
        redBox1.setLayout(new BorderLayout());
        redBox1.setVisible(true);

        // Create and configure the red title Panel
        JPanel redTittle = new JPanel();
        redTittle.setBackground(new Color(0xFF1616));
        redTittle.setBounds(270, 130, 480, 100);
        redTittle.setVisible(true);

        // Create and configure the red title label
        JLabel redTittleLabel = new JLabel("Log In");
        redTittleLabel.setFont(new Font("Open Sans", Font.PLAIN, 70));
        redTittleLabel.setForeground(new Color(0xFFFFFF));

        // Create and configure the user login text field
        userLogIn = new JTextField();
        userLogIn.setBounds(270, 240, 480, 100);
        userLogIn.setFont(new Font("Open Sans", Font.PLAIN, 70));
        userLogIn.setForeground(new Color(0x010000));

        // Create and configure the password login text field
        passwordLogIn = new JTextField();
        passwordLogIn.setBounds(270, 350, 480, 100);
        passwordLogIn.setFont(new Font("Open Sans", Font.PLAIN, 70));
        passwordLogIn.setForeground(new Color(0x010000));

        // Create and configure the "Log In" button
        LogInButton = new JButton("Log In");
        LogInButton.setFont(new Font("Open Sans", Font.PLAIN, 40));
        LogInButton.setForeground(new Color(0x010000));
        LogInButton.setBackground(new Color(0xFFFFFF));// 0xFFFFFF
        LogInButton.setBounds(390, 460, 240, 50);
        LogInButton.setBorderPainted(false); // Hide the border
        LogInButton.setFocusPainted(false); // Hide the text border
        LogInButton.addActionListener(this);
        LogInButton.setActionCommand("LogIn");

        // Create and configure the yellow box Panel
        JPanel yellowBox1 = new JPanel();
        yellowBox1.setBackground(new Color(0xFFDE00));
        yellowBox1.setBounds(770, 120, 500, 520);
        yellowBox1.setLayout(new BorderLayout());
        yellowBox1.setVisible(true);

        // Create and configure the yellow title Panel
        JPanel yellowTittle = new JPanel();
        yellowTittle.setBackground(new Color(0xFFDE00));
        yellowTittle.setBounds(780, 130, 480, 100);
        yellowTittle.setVisible(true);

        // Create and configure the yellow title label
        JLabel yellowTittleLabel = new JLabel("Sing In");
        yellowTittleLabel.setFont(new Font("Open Sans", Font.PLAIN, 70));
        yellowTittleLabel.setForeground(new Color(0xFFFFFF));

        // Create and configure the user create account text field
        userCreateAccount = new JTextField();
        userCreateAccount.setBounds(780, 240, 480, 100);
        userCreateAccount.setFont(new Font("Open Sans", Font.PLAIN, 70));
        userCreateAccount.setForeground(new Color(0x010000));

        // Create and configure the password create account text field
        passwordCreate = new JTextField();
        passwordCreate.setBounds(780, 350, 480, 100);
        passwordCreate.setFont(new Font("Open Sans", Font.PLAIN, 70));
        passwordCreate.setForeground(new Color(0x010000));

        // Create and configure the "Sing In" button
        createAccountButton = new JButton("Sing In");
        createAccountButton.setFont(new Font("Open Sans", Font.PLAIN, 40));
        createAccountButton.setForeground(new Color(0x010000));
        createAccountButton.setBackground(new Color(0xFFFFFF));// 0xFFFFFF
        createAccountButton.setBounds(870, 460, 300, 50);
        createAccountButton.setBorderPainted(false); // Hide the border
        createAccountButton.setFocusPainted(false); // Hide the text border
        createAccountButton.addActionListener(this);
        createAccountButton.setActionCommand("LogIn");

        // Create and configure the main frame
        frame = new JFrame();
        ImageIcon image2 = new ImageIcon("LOGO8.png"); // creates a new ImageIcon
        frame.setIconImage(image2.getImage()); // sets the icon of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        // Add UI components to the frame
        frame.add(userLogIn);
        frame.add(passwordLogIn);
        frame.add(LogInButton);
        frame.add(userCreateAccount);
        frame.add(passwordCreate);
        frame.add(createAccountButton);

        // Add UI components to the Menu Panel
        MenuPanel.add(label);
        MenuPanel.add(financialCalculator);
        MenuPanel.add(budgetingTool);
        MenuPanel.add(BackToMenu);
        MenuPanel.add(LogOut);

        // Add the red title label to the red title Panel
        redTittle.add(redTittleLabel, BorderLayout.CENTER);

        // Add UI components to the frame
        frame.add(redTittle);
        frame.add(redBox1);

        // Add the yellow title label to the yellow title Panel
        yellowTittle.add(yellowTittleLabel, BorderLayout.CENTER);

        // Add UI components to the frame
        frame.add(yellowTittle);
        frame.add(yellowBox1);
        frame.add(MenuPanel);
        frame.add(bluePanel);
        frame.add(backGround);
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
        // Handle "Log In" button click
        if (e.getSource() == LogInButton) {
            // Get user and password from text fields
            user = userLogIn.getText();
            password = passwordLogIn.getText();

            // Read userAccount and passwordAccount from the file
            try (BufferedReader reader = new BufferedReader(new FileReader("credentials.txt"))) {
                userAccount = reader.readLine();
                passwordAccount = reader.readLine();
            } catch (IOException ex) {
                System.out.println("Error reading from file: " + ex.getMessage());
            }
            // Check if user and password match
            if (userAccount.equals(user) && passwordAccount.equals(password)) {
                // Display success message and terminate the frame
                JOptionPane.showMessageDialog(null, "You have successfully logged in", "logged in",
                        JOptionPane.PLAIN_MESSAGE);
                frame.dispose(); // Terminate the frame
                login = true;
            } else {
                // Display error message
                JOptionPane.showMessageDialog(null, "Incorrect username or password", "error",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
        // Handle "Sing In" button click
        if (e.getSource() == createAccountButton) {
            // Get user and password from text fields
            userAccount = userCreateAccount.getText();
            passwordAccount = passwordCreate.getText();
            // Store userAccount and passwordAccount in a text file
            try (PrintWriter writer = new PrintWriter(new FileWriter("credentials.txt"))) {
                writer.println(userAccount);
                writer.println(passwordAccount);
            } catch (IOException ex) {
                System.out.println("Error writing to file: " + ex.getMessage());
            }
            // Display success message and terminate the frame
            JOptionPane.showMessageDialog(null, "You have successfully signed in", "signed in",
                    JOptionPane.PLAIN_MESSAGE);
                    login = true;
            frame.dispose(); // Terminate the frame
        }
    }
}
