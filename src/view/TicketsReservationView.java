package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


import javax.swing.ImageIcon;

public class TicketsReservationView extends JFrame{
	
//declarative zone
	  private final JLabel ticketsLabel = new JLabel("Choose the number of tickets: ");
	  private final JTextField ticketsField = new JTextField("");
	  private final JLabel classLabel = new JLabel("Choose the desired class: ");
	  private final JRadioButton businessClass = new JRadioButton("business");
	  private final JRadioButton economicClass = new JRadioButton("economic");
	  private final ButtonGroup group = new ButtonGroup();
	  private final JButton backBtn = new JButton("back");
	  private final JButton nextBtn = new JButton("next");
	  
	  private final ImageIcon image1= new ImageIcon("bg2.jpg");
	  private final JLabel img= new JLabel(image1);
	  private final JPanel panel= new JPanel();
		 
	  private int bSeats=10; //business seats available
	  private int eSeats=0;  //economic seats available
	  private int requestedTickets;
	  private int bOk=0;
	  private int eOk=0;
		 

	 
	  public TicketsReservationView() {
		  
	//set window format		  
		  setSize(600, 500);
		  setLayout(null);
		  setTitle("Tickets Reservation");
		  setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		  setLocationRelativeTo(null); 
		  setResizable(true);
		  ImageIcon icon1 = new ImageIcon("planeI.png");
		  setIconImage(icon1.getImage());
		 
	//add components		  
		 addTicketsLabel();
		 addTicketsField();
		 addClassLabel(); 
		 addGroup();
		 addBusiness();
		 addEconomic();
		 addBackBtn();
		 addNextBtn();
		 addImage();
      }
	  
    //functions
	  public void addImage() {
		  img.setIcon(image1);
		  panel.add(img);
		  panel.setBounds(0,150,580,330);
		  add(panel);
		  validate();
	  }
	  public void addTicketsLabel() {
		  ticketsLabel.setBounds(20, 30, 300, 30);
		  ticketsLabel.setVisible(true);
		  ticketsLabel.setForeground(Color.blue);
		  ticketsLabel.setFont(new Font("Serif", Font.BOLD, 15));
		  add(ticketsLabel);
	  }
	  
	  public void addTicketsField() {
		  ticketsField.setBounds(50, 80, 60, 30);
		  ticketsField.setVisible(true);
		  ticketsField.setForeground(Color.blue);
		  ticketsField.setFont(new Font("Serif", Font.BOLD, 15));
		  add(ticketsField);
	  }
	  
	  public void addClassLabel() {
		  classLabel.setBounds(330, 30, 300, 30);
		  classLabel.setVisible(true);
		  classLabel.setForeground(Color.blue);
		  classLabel.setFont(new Font("Serif", Font.BOLD, 15));
		  add(classLabel);
	  }  
	  
	  private void addGroup() {
		  group.add(businessClass);
		  group.add(economicClass);
	  }
	  private void addBusiness() {	  
		  businessClass.setBounds(330,80,100,30);
		  businessClass.setVisible(true);
		  businessClass.setForeground(Color.blue);
		  businessClass.setFont(new Font("Serif", Font.PLAIN, 15));
		  businessClass.addActionListener( (e)-> bOk = 1 );	  
		  add(businessClass);
	  }
	  
	  private void addEconomic() {
		  economicClass.setBounds(450,80,100,30);
		  economicClass.setVisible(true);
		  economicClass.setForeground(Color.blue);
		  economicClass.setFont(new Font("Serif", Font.PLAIN, 15));
		  economicClass.addActionListener( (e)-> eOk = 1);
	      add(economicClass);
	  }
		 
	  
	  private void addBackBtn() {
		  backBtn.setBounds(50, 410, 120, 40);
		  backBtn.setVisible(true);
		  backBtn.setForeground(Color.blue);
		  backBtn.setFont(new Font("Serif", Font.PLAIN, 20));
		  backBtn.setFocusable(false);
		  
		  backBtn.addActionListener( (e)->{
			  ChooseFlightView FlightView = new ChooseFlightView();
			  FlightView.setVisible(true);
			  TicketsReservationView.this.dispose();
		  		} );
		  add(backBtn);
	  }
	  
	  private void addNextBtn() {
		  nextBtn.setBounds(400, 410, 120, 40);
	      nextBtn.setFont(new Font("Serif", Font.PLAIN, 20));
	      nextBtn.setForeground(Color.blue);
	      nextBtn.setFocusable(false);
	      
	      nextBtn.addActionListener(new ConfirmButton());
	  
	      add(nextBtn);
	  }
	  
	//function to get the integer out of the given value  
	  public int getTickets() {
	        return Integer.valueOf(ticketsField.getText());
	    }
	 
	  
	  private class ConfirmButton implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				requestedTickets = getTickets();
				
				if(bOk==1 && e.getSource()==nextBtn ) {	  
				  if(bSeats - requestedTickets >= 0) {						
						bSeats= bSeats- requestedTickets;
						MessageView Msg= new MessageView();
						Msg.setVisible(true);
						TicketsReservationView.this.dispose();
					}
				  else {
						JOptionPane.showMessageDialog(null, "We are sorry, there are not enough seats available","Business class" , JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(eOk==1 && e.getSource()==nextBtn) {
					if(eSeats - requestedTickets >= 0) {			
						eSeats= eSeats - requestedTickets;
						MessageView Msg= new MessageView();
						Msg.setVisible(true);
						TicketsReservationView.this.dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "We are sorry, there are not enough seats available","Economic class" , JOptionPane.ERROR_MESSAGE);
					}  
				}
			}
	  }
	
}
