package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ChooseFlightView extends JFrame{

	private final JLabel instructions =  new JLabel("Introduce ID of the desired flight");
	private final JTextField idField = new JTextField("");
	private final JButton nextBtn = new JButton("NEXT");
	
	public ChooseFlightView() {
		setSize(500, 300);
        setLayout(null);
        setTitle("Flights");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        ImageIcon icon1 = new ImageIcon("planeI.png");
        setIconImage(icon1.getImage());
        
        addButton();
        addInstructions();
        addIdField();
	}
	
	  private void addButton() {
	        nextBtn.setBounds(170, 165, 120, 40);
	        nextBtn.setFont(new Font("Serif", Font.BOLD, 20));
	        nextBtn.setForeground(Color.blue);
	        nextBtn.addActionListener(new ConfirmButtonListener());
	        nextBtn.setFocusable(false);
	        add(nextBtn);
	    }
	  
	  private void addInstructions() {
		  	instructions.setBounds(100, 50, 300, 40);
		  	instructions.setVisible(true);
		 	instructions.setForeground(Color.blue);
		 	instructions.setFont(new Font("Serif", Font.BOLD, 18));
		 	add(instructions);
	  }
	  
	  private void addIdField() {
		  	idField.setBounds(200, 100, 60, 40);
		  	idField.setHorizontalAlignment(JTextField.CENTER);
		  	idField.setFont(new Font("Serif", Font.BOLD, 15));
	        add(idField);
	    }
	  
	  private class ConfirmButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			 String introducedId= idField.getText();
			  
			  if("3".equals(introducedId)) {
				  TicketsReservationView TicketsView = new TicketsReservationView();
	                TicketsView.setVisible(true);
	                ChooseFlightView.this.dispose();
			  }
			  else {
				  JOptionPane.showMessageDialog(null, "Sorry, there is no flight with the give ID! \r\n "
				  		+ "Plese enter another one.","Incorrect Flight" , JOptionPane.ERROR_MESSAGE);
			  }
		}
		 
	  }
}
