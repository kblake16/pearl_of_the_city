package InventoryManager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class LoginGUI extends JFrame implements ActionListener {
		
	//Declaration of variables
	   private JPanel panel;
	   private JLabel user_label, password_label;
	   private JPasswordField password_text;
	   private JButton loginBtn;
	   private JTextField usernameField;
	   private JPanel panel_1;
	   private JPanel panel_2;
	   private JLabel lblNewLabel;
	   private JLabel lblNewLabel_1;
	   private JButton forgetBtn;
	   private JButton returnBtn = new JButton("RETURN");
	   private static Login login;

	   //Constructor
	   LoginGUI(Login login) {
		   
		   this.login = login;
		  
		   //Creates main panel and sets its properties
		  panel = new JPanel();
	      panel.setBackground(new Color(154, 205, 50));
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setBounds(400, 100, 550, 400);
	      getContentPane().add(panel, BorderLayout.CENTER);
	      panel.setLayout(null);
	      
        //Creates main heading labeland sets its properties
	      //added to main panel
	      lblNewLabel = new JLabel("Pearl of the City");
	      lblNewLabel.setBounds(134, 11, 315, 50);
	      lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 46));
	      panel.add(lblNewLabel);
	      
	      //Creates Login label and sets its properties
	      //Added to main panel
	      lblNewLabel_1 = new JLabel("Login");
	      lblNewLabel_1.setBounds(254, 60, 58, 31);
	      lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
	      panel.add(lblNewLabel_1);
	      
	      ////Created a a panel to add dimension to label
	      //panel is added to main panel
	      panel_1 = new JPanel();
	      panel_1.setBounds(80, 131, 121, 40);
	      panel_1.setBackground(new Color(128, 128, 0));
	      panel_1.setForeground(new Color(128, 128, 0));
	      panel_1.setBorder(new LineBorder(new Color(128, 128, 0), 3));
	      panel.add(panel_1);
	      
	      // Creates user name Label and sets its properties
	      //Label is added to panel
	      user_label = new JLabel();
	      user_label.setBackground(new Color(128, 128, 0));
	      user_label.setForeground(Color.WHITE);
	      user_label.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
	      user_label.setText("User Name :");
	      panel_1.add(user_label);
	      
	      //Creates a second panel to add dimension to label
	      //Panel is added to main panel
  	      panel_2 = new JPanel();
  	      panel_2.setBounds(80, 182, 121, 42);
  	      panel_2.setBackground(new Color(128, 128, 0));
  	      panel_2.setForeground(new Color(128, 128, 0));
  	      panel.add(panel_2);
  	      
  	      //Creates Password Label and sets its properties
  	      //label is added to main panel
  	      password_label = new JLabel();
  	      password_label.setForeground(Color.WHITE);
  	      password_label.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
  	      password_label.setText("Password :");
  	      panel_2.add(password_label);
	      
	      //Creates password field and sets its properties
  	      //field is added to main panel
	      password_text = new JPasswordField();
	      password_text.setBounds(222, 182, 215, 42);
	      panel.add(password_text);
	      
	      //Creates the User name text field and sets its properties 
	      //field is added to panel
	      usernameField = new JTextField();
	      usernameField.setBounds(222, 131, 215, 40);
	      panel.add(usernameField);
	      
	      //Creates Login button and sets its properties
	      //button is addded to panel
	      loginBtn = new JButton("LOGIN");
	      loginBtn.setBounds(164, 281, 84, 47);
	      loginBtn.setForeground(new Color(128, 128, 0));
	      loginBtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
	      loginBtn.addActionListener(new ActionListener() {
	    	  //Action is performed when login button is clicked 
	    	  public void actionPerformed(ActionEvent e) 
	  				{
	    		  //local variables 
					String username = usernameField.getText();
					char[] password = password_text.getPassword();
					boolean correct = login.isCorrect(username, password);
					//checks information inputed in field to see if the user is the administrator
					if(username.contentEquals("admin"))
					{
						//if true the administrator home page is displayed 
						if(correct == true) {
							AdminHomeGUI object = new AdminHomeGUI();
							object.setVisible(true);
							setVisible(false);
						}
						//if false an error message is shown and the text fields are cleared 
						else {
							String msg = ("Invalid username or password");
							JOptionPane.showMessageDialog(new JFrame(), msg, "WARNING", JOptionPane.ERROR_MESSAGE);
							
							usernameField.setText("");
							password_text.setText("");
						}
					}
					//checks information inputed in field to see if the user is an employee
					else if(username.contentEquals("user"))
					{
						//if true the user home page is displayed 
						if(correct == true) {
							UserHomeGUI object = new UserHomeGUI();
							object.setVisible(true);
							setVisible(false);
						}
						//if false an error message is shown and the text fields are cleared 
						else {
							String msg = ("Invalid username or password");
							JOptionPane.showMessageDialog(new JFrame(), msg, "WARNING", JOptionPane.ERROR_MESSAGE);
							
							usernameField.setText("");
							password_text.setText("");
						}
					} 
	  			}
					
			});
	      
	      panel.add(loginBtn);
	      
	      //Creates Forget Password button and sets its properties 
	      //button added to panel
	      forgetBtn = new JButton("Forget Password?");
	      forgetBtn.addActionListener(new ActionListener() {
	    	  //When button is clicked a pop up is displayed to change password
	      	public void actionPerformed(ActionEvent e) {
	      		ForgetPassGUI obj = new ForgetPassGUI();
	      		obj.setVisible(true);
	      	}
	      });
  	      forgetBtn.setBounds(262, 235, 151, 23);
  	      forgetBtn.setBackground(new Color(154, 205, 50));
  	      forgetBtn.setForeground(new Color(0, 0, 255));
  	      panel.add(forgetBtn);
	      
	     //Creates Return Button and sets its properties
  	      //Added to main panel
	      returnBtn.addActionListener(new ActionListener() {
	    	  //When button is clicked and an action is performed
	      	public void actionPerformed(ActionEvent e) {
	      		//UserGUI page is displayed and this page (LoginGUI) disappears
	      		UserModeGUI user = new UserModeGUI();
	      		user.setVisible(true);
	      		setVisible(false);
	      	}
	      });
	      returnBtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
	      returnBtn.setForeground(new Color(128, 128, 0));
	      returnBtn.setBounds(265, 281, 89, 47);
	      panel.add(returnBtn);
  	      
  	     
	     
	   }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String username = usernameField.getText();
		char[] password = password_text.getPassword();
		boolean correct = login.isCorrect(username, password);
		if(correct == true)
		{
			UserHomeGUI object = new UserHomeGUI();
			object.setVisible(true);
			setVisible(false);
		}else {
			String msg = ("Invalid username or password");
			JOptionPane.showMessageDialog(new JFrame(), msg, "WARNING", JOptionPane.ERROR_MESSAGE);
			
			usernameField.setText("");
			password_text.setText("");
		}
		
	}
}
