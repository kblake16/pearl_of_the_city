package InventoryManager;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserHomeGUI extends JFrame {
	
	//Declaration of variables 
	private JPanel contentPane;
	private Login login;
	
	 //Constructor 
	public UserHomeGUI() {
		//Main panel is created and its properties set 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 732, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Main heading label created and its properties set  
		//Added to panel
		JLabel lblPearlOfThe = new JLabel("Pearl Of The City Beauty Store");
		lblPearlOfThe.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 34));
		lblPearlOfThe.setBounds(150, 11, 431, 66);
		contentPane.add(lblPearlOfThe);
		
		//Conduct sales button is created and its properties set 
		//Added to main panel
		//Sales page is displayed and current page disappears when button is clicked
		JButton btnSales = new JButton("Conduct Sales");
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalesGUI obj = new SalesGUI();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnSales.setForeground(new Color(128, 128, 0));
		btnSales.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnSales.setBounds(73, 222, 148, 42);
		contentPane.add(btnSales);
		
		
		//View Inventory button created and properties set 
		//added to main panel 
		//Inventory page is displayed and current page disappears when button is clicked 
		JButton btnInventory = new JButton("View Inventory");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryGUI obj = new InventoryGUI();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnInventory.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnInventory.setForeground(new Color(128, 128, 0));
		btnInventory.setBounds(292, 222, 148, 42);
		contentPane.add(btnInventory);
		
		//Label created and properties set
		//added to main panel 
		JLabel lblSelectAction = new JLabel("What would you like to do today?");
		lblSelectAction.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblSelectAction.setBackground(new Color(154, 205, 50));
		lblSelectAction.setBounds(73, 169, 236, 30);
		contentPane.add(lblSelectAction);
		
		
		//Heading Label created and properties set
		//added to main panel
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblWelcome.setBounds(334, 88, 98, 30);
		contentPane.add(lblWelcome);
		
		//Logout button created and properties set
		//Added to main panel
		//When clicked the user is redirected to the user mode page 
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserModeGUI obj = new UserModeGUI();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnLogout.setForeground(new Color(128, 128, 0));
		btnLogout.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnLogout.setBounds(506, 222, 114, 42);
		contentPane.add(btnLogout);
	}
}
