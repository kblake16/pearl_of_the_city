package InventoryManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class UserInfoGUI extends JFrame {
//Declaration of variables
	private JPanel contentPane;
	private UserDataManager userFile = new UserDataManager();
	private UserInfo user;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInfoGUI frame = new UserInfoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserInfoGUI() {
		
		user = userFile.readFromFile();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 507, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMyInformation = new JLabel("User Information");
		lblMyInformation.setBounds(95, 34, 349, 77);
		lblMyInformation.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 44));
		contentPane.add(lblMyInformation);
		
		JLabel lblUserName = new JLabel("User name:");
		lblUserName.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblUserName.setBounds(95, 143, 110, 31);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblPassword.setBounds(95, 195, 110, 23);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblEmail.setBounds(95, 253, 110, 23);
		contentPane.add(lblEmail);
		
		JLabel lblTelephoneNumber = new JLabel("Telephone Number:");
		lblTelephoneNumber.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		lblTelephoneNumber.setBounds(96, 309, 127, 23);
		contentPane.add(lblTelephoneNumber);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(233, 142, 184, 31);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(233, 194, 184, 31);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(233, 252, 184, 31);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(233, 308, 184, 24);
		contentPane.add(textArea_3);
	}
}
