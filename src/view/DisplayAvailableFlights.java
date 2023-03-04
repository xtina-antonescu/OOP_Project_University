package view;

import javax.swing.*;
import java.awt.*;

public class DisplayAvailableFlights extends JFrame{

    private final JLabel title = new JLabel("These are the available flights on your desired date:");
    private final JButton reserve = new JButton("Make a reservation");
    private JTable tableFlights = new JTable();

    public DisplayAvailableFlights(){
        setTitle("Display Available Flights");
        setSize(500, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(new Color(75,0,130));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon1 = new ImageIcon("planeI.png");
        setIconImage(icon1.getImage());
        addComponents();
    }

    private void addComponents(){
        addTitle();
        addButton();
    }

    private void addTitle(){
        title.setBounds(50,30,400,30);
        title.setVisible(true);
        title.setFont(new Font("Roboto", Font.BOLD, 15));
        add(title);
    }

    private void addButton(){
        reserve.setBounds(60,300,400,30);
        reserve.setVisible(true);
        reserve.setFont(new Font("Roboto", Font.BOLD, 15));
        reserve.setBackground(new Color(147,112,219));
        add(reserve);
    }
}
