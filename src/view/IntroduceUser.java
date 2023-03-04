package view;

import javax.swing.*;
import java.awt.*;

public class IntroduceUser extends JFrame{

    private final JLabel title = new JLabel("Introduce Username and Password:");
    private final JLabel introduceU = new JLabel("Username:");
    private final JLabel introduceP = new JLabel("Password");
    private final JTextField username = new JTextField("");
    private final JPasswordField password = new JPasswordField("");
    private static final JLabel image = new JLabel();
    private static final ImageIcon imageIcon = new ImageIcon("ICON.png");
    private static final JButton logIn = new JButton("Log-in");

    public IntroduceUser(){
        setTitle("Introduce Username and Password");
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(new Color(255,255,255));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon1 = new ImageIcon("planeI.png");
        setIconImage(icon1.getImage());
        addComponents();
    }

    private void addComponents(){
        addTitle();
        addImage();
        addUsernameText();
        addUsername();
        addPasswordText();
        addPassword();
        addButton();
    }

    private void addTitle(){
        title.setBounds(120,20,440,30);
        title.setVisible(true);
        title.setFont(new Font("Roboto", Font.BOLD, 15));
        add(title);
    }

    private void addImage(){
        image.setBounds(130, 60, 440, 220);
        image.setVisible(true);
        image.setText("");
        image.setIcon(imageIcon);
        add(image);
    }
    private void addUsernameText(){
        introduceU.setBounds(150, 280, 100, 30);
        introduceU.setVisible(true);
        introduceU.setFont(new Font("Roboto", Font.BOLD, 15));
        add(introduceU);
    }

    private void addUsername(){
        username.setBounds(150,320, 200, 30);
        username.setHorizontalAlignment(JTextField.CENTER);
        username.setFont(new Font("Roboto", Font.BOLD, 15));
        add(username);
    }

    private void addPasswordText(){
        introduceP.setBounds(150, 350, 100, 30);
        introduceP.setVisible(true);
        introduceP.setFont(new Font("Roboto", Font.BOLD, 15));
        add(introduceP);
    }

    private void addPassword(){
        password.setBounds(150,390, 200, 30);
        password.setHorizontalAlignment(JTextField.CENTER);
        password.setFont(new Font("Roboto", Font.BOLD, 15));
        add(password);
    }

    private void addButton(){
        logIn.setBounds(150,430, 200, 20);
        logIn.setFont(new Font("Roboto", Font.BOLD, 12));
        logIn.setVisible(true);
        add(logIn);

    }

    public String getUsername() {

        return username.getText();
    }

    public String getPassword() {

        return new String(password.getPassword());
    }
}
