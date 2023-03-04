package view;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageView extends JFrame {

    private final JLabel thankYouMsg = new JLabel("Thank you for making this reservation!");
    private final JLabel thankYouMsg2 = new JLabel ( "Have a nice flight!");
    private final JButton exitBtn = new JButton("exit");
    private final JButton backBtn = new JButton("back");
    private final JLabel plane = new JLabel();
    private final JPanel panel = new JPanel();


    public MessageView() {
        setTitle("Thank You");
        setSize(700, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon1 = new ImageIcon("planeI.png");
        setIconImage(icon1.getImage());

        addMessage();
        addBackBtn();
        addExitBtn();
        addPlaneImage();
    }
    

	  public void addPlaneImage() {
		  plane.setIcon(new ImageIcon("cute_plane.png"));
		  panel.add(plane);
		  panel.setBounds(230,120, 200,118);
		  add(panel);
		  validate();
	  }

    private void addMessage() {
    	thankYouMsg.setBounds(100, 40, 600, 40);
    	thankYouMsg.setForeground(Color.blue);
    	thankYouMsg.setFont(new Font("Serif", Font.PLAIN, 28));
    	
    	thankYouMsg2.setBounds(200, 350, 600, 40);
    	thankYouMsg2.setForeground(Color.blue);
    	thankYouMsg2.setFont(new Font("Serif", Font.PLAIN, 28));
    	
        add(thankYouMsg);
        add(thankYouMsg2);
        }
    
    private void addBackBtn() {
		  backBtn.setBounds(80, 200, 100, 30);
		  backBtn.setVisible(true);
		  backBtn.setForeground(Color.blue);
		  backBtn.addActionListener(new ButtonListener());
		  backBtn.setFocusable(false);
		  add(backBtn);
	  }
    
    private void addExitBtn() {
		  exitBtn.setBounds(450, 200, 100, 30);
		  exitBtn.setVisible(true);
		  exitBtn.setForeground(Color.blue);
		  exitBtn.addActionListener(new ButtonListener());
		  exitBtn.setFocusable(false);
		  add(exitBtn);
	  }
	  
    private class ButtonListener implements ActionListener{
///will go back to the sign in window
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==backBtn) {
				ChooseFlightView FlightView = new ChooseFlightView();
				FlightView.setVisible(true);
				MessageView.this.dispose();
			}
			else {
				if(e.getSource()== exitBtn) {
					MessageView.this.dispose();
				}
			}
			
		}
    	
    }
}
