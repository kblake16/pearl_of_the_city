package InventoryManager;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgetPassGUI extends JFrame {
//Declaration of variables 
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField username;

	//constructor
	public ForgetPassGUI() {
		//Creates main panel, sets properties
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 309, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Creates label, sets properties
		JLabel lblEnterPasswordAgain = new JLabel("Confirm Password:");
		lblEnterPasswordAgain.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblEnterPasswordAgain.setBounds(57, 259, 159, 31);
		
		//Creates sumit button, sets properties
		//Adds data inputed into its respective file
		JButton submitBtn = new JButton("SUBMIT");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//checks if user name is in admin file
				//checks if passwords are equal
				//if they are equal, it adds user name and password to file
			}
		});
		submitBtn.setBounds(91, 358, 90, 45);
		submitBtn.setForeground(new Color(128, 128, 0));
		submitBtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		contentPane.setLayout(null);
		
		//Creates Label, sets properties
		//Added to main panel
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		lblChangePassword.setBounds(46, 11, 193, 45);
		contentPane.add(lblChangePassword);
		
		//Creates label, sets properties
		//added to main panel
		JLabel lblEnterUsername = new JLabel("Enter Username:");
		lblEnterUsername.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblEnterUsername.setBounds(57, 83, 137, 24);
		contentPane.add(lblEnterUsername);
		
		//creates label, sets properties
		//added to main panel
		JLabel lblEnterNewPassword = new JLabel("Enter New Password:");
		lblEnterNewPassword.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblEnterNewPassword.setBounds(57, 161, 159, 31);
		contentPane.add(lblEnterNewPassword);
		contentPane.add(lblEnterPasswordAgain);
		contentPane.add(submitBtn);
		
		//creates user name text field, sets properties
		//added to main panel
		username = new JTextField();
		username.setBackground(new Color(245, 255, 250));
		username.setBounds(57, 108, 182, 31);
		contentPane.add(username);
		username.setColumns(10);
		
		//creates password field, sets properties
		//added to main panel
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(245, 255, 250));
		passwordField.setBounds(57, 288, 182, 35);
		contentPane.add(passwordField);
		
		//creates password field, sets properties
		//added to main panel
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(245, 255, 250));
		passwordField_1.setBounds(57, 193, 182, 35);
		contentPane.add(passwordField_1);
	}
}
