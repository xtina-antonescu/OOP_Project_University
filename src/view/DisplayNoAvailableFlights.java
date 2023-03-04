package view;

import javax.swing.*;
import java.awt.*;

public class DisplayNoAvailableFlights extends JFrame{

    private final JLabel text = new JLabel("There are no flights available on your desired date!");
    private final JButton select = new JButton("Select another flight");

    public DisplayNoAvailableFlights(){
        setTitle("Display No Available Flights");
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(new Color(72,209,204));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon1 = new ImageIcon("planeI.png");
        setIconImage(icon1.getImage());
        addComponents();
    }

    private void addComponents(){
        addMessage();
        addButton();
    }

    private void addMessage(){
        text.setBounds(60,100,400,30);
        text.setVisible(true);
        text.setFont(new Font("Roboto", Font.BOLD, 15));
        add(text);
    }

    private void addButton(){
        select.setBounds(150,240,200,30);
        select.setVisible(true);
        select.setFont(new Font("Roboto", Font.BOLD, 15));
        select.setBackground(new Color(72,209,204));
        add(select);
    }
}
