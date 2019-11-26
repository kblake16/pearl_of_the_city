package userInfoGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class userInfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userInfo window = new userInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public userInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(107, 142, 35));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPearlOfThe = new JLabel("Pearl Of The City Beauty Store");
		lblPearlOfThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPearlOfThe.setBounds(78, 27, 281, 42);
		frame.getContentPane().add(lblPearlOfThe);
		
		JButton btnSales = new JButton("SALES");
		btnSales.setBounds(78, 140, 98, 23);
		frame.getContentPane().add(btnSales);
		
		JButton btnInventory = new JButton("INVENTORY");
		btnInventory.setBounds(270, 140, 89, 23);
		frame.getContentPane().add(btnInventory);
		
		JLabel lblSelectAction = new JLabel("SELECT ACTION");
		lblSelectAction.setBounds(181, 97, 89, 14);
		frame.getContentPane().add(lblSelectAction);
	}
}
