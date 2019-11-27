package InventoryManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserModeGUI extends JFrame {
	
	//Declaration of variables
	private JPanel contentPane;
	private static Login login;
	
	/**
	 * Main Method to launch the application.
	 * Method creates an instance of the class and sets visibility to true
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserModeGUI frame = new UserModeGUI();
					frame.setVisible(true);
					login = new Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the frame.
	 */
	public UserModeGUI() {
		//Creates the main panel of the frame and sets its properties
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creates the main heading label and sets its properties
		JLabel lblHome = new JLabel("System Login");
		lblHome.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 46));
		lblHome.setBounds(155, 31, 230, 68);
		contentPane.add(lblHome);
		
		/**Creates an administrator button and sets its properties
		   When button is clicked, it reads from the database that holds the user names and passwords for administrators
		   The Login page then pops up and this page(UserModeGUI) disappears
		**/
		JButton adminBtn = new JButton("Administrator");
		adminBtn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		adminBtn.setForeground(new Color(128, 128, 0));
		adminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.loginAdmin();
				LoginGUI obj = new LoginGUI(login);
				setVisible(false);
				obj.setVisible(true);
			}
		});
		adminBtn.setBounds(95, 171, 146, 52);
		contentPane.add(adminBtn);
		
		/**Creates a User button and sets its properties
		   When button is clicked, it reads from the database that holds the user names and passwords for users 
		   The Login page then pops up and this page(UserModeGUI) disappears
		**/
		JButton userBtn = new JButton("User");
		userBtn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		userBtn.setForeground(new Color(128, 128, 0));
		userBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.loginUser();
				LoginGUI obj = new LoginGUI(login);
				setVisible(false);
				obj.setVisible(true);
			}
		});
		userBtn.setBounds(276, 171, 146, 52);
		contentPane.add(userBtn);
		
		JLabel lblChooseAUser = new JLabel("Choose a user mode");
		lblChooseAUser.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblChooseAUser.setBounds(193, 134, 166, 14);
		contentPane.add(lblChooseAUser);
	}
}
