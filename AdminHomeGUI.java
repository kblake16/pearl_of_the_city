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

public class AdminHomeGUI extends JFrame {
	
//Declaration of variables 
	private JPanel contentPane;
	private Login login;
	
	//Constructor 
	public AdminHomeGUI() {
		
		//Main panel created and properties set
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 732, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Page heading label is created and properties set
		//Added to main panel
		JLabel lblPearlOfThe = new JLabel("Pearl Of The City Beauty Store");
		lblPearlOfThe.setBounds(150, 11, 431, 66);
		lblPearlOfThe.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 34));
		contentPane.add(lblPearlOfThe);
		
		//Conduct Sales Button created and properties set
		//Added to main panel 
		//When clicked, sales page is displayed and current page disappears
		JButton btnSales = new JButton("Conduct Sales");
		btnSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalesGUI obj = new SalesGUI();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnSales.setBounds(73, 210, 165, 42);
		btnSales.setForeground(new Color(128, 128, 0));
		btnSales.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		contentPane.add(btnSales);
		
		//View Inventory button created and properties set
		//Added to main panel
		//When clicked, Inventory page is displayed and current page disappears
		JButton btnInventory = new JButton("View Inventory");
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryGUI obj = new InventoryGUI();
				obj.setVisible(true);
			}
		});
		btnInventory.setBounds(291, 210, 148, 42);
		btnInventory.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnInventory.setForeground(new Color(128, 128, 0));
		contentPane.add(btnInventory);
		
		//Creates label and sets its properties 
		JLabel lblSelectAction = new JLabel("What would you like to do today?");
		lblSelectAction.setBounds(73, 157, 236, 30);
		lblSelectAction.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblSelectAction.setBackground(new Color(154, 205, 50));
		contentPane.add(lblSelectAction);
		
		//Creates label and sets its properties 
		JLabel lblWelcome = new JLabel("Welcome!");
		lblWelcome.setBounds(334, 88, 98, 30);
		lblWelcome.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		contentPane.add(lblWelcome);
		
		//View supplier detail button created and properties set
		//Added to main panel
		//When clicked, Supplier Info page is displayed and current page disappears
		JButton btnViewSupplierDetails = new JButton("View Supplier Details");
		btnViewSupplierDetails.setForeground(new Color(128, 128, 0));
		btnViewSupplierDetails.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnViewSupplierDetails.setBounds(73, 276, 165, 42);
		contentPane.add(btnViewSupplierDetails);
		
		//View user Detail button created and properties set
		//Added to main panel
		//When clicked, User Detail page is displayed and current page disappears
		JButton btnViewUserDetails = new JButton("View User Details");
		btnViewUserDetails.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnViewUserDetails.setForeground(new Color(128, 128, 0));
		btnViewUserDetails.setBounds(291, 276, 148, 42);
		contentPane.add(btnViewUserDetails);
		
		//View Recent Activity button created and properties set
		//Added to main panel
		//When clicked, Recent Activity page is displayed and current page disappears
		JButton btnViewRecentActivity = new JButton("View Recent Activity");
		btnViewRecentActivity.setForeground(new Color(128, 128, 0));
		btnViewRecentActivity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnViewRecentActivity.setBounds(486, 210, 157, 42);
		contentPane.add(btnViewRecentActivity);
		
		//Logout button is created and properties set
		//added to main panel 
		//When clicked, User mode page is displayed and current page disappears
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
		btnLogout.setBounds(486, 276, 157, 42);
		contentPane.add(btnLogout);
	}
}
