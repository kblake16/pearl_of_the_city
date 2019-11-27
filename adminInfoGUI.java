package adminInfoGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class adminInfoGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminInfoGUI window = new adminInfoGUI();
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
	public adminInfoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(107, 142, 35));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPearlOfThe = new JLabel("Pearl Of The City Beauty Store");
		lblPearlOfThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPearlOfThe.setBounds(74, 23, 285, 39);
		panel.add(lblPearlOfThe);
		
		JLabel lblSelectAction = new JLabel("SELECT ACTION");
		lblSelectAction.setBounds(175, 73, 116, 29);
		panel.add(lblSelectAction);
		
		JButton btnSales = new JButton("SALES");
		btnSales.setBounds(55, 120, 89, 23);
		panel.add(btnSales);
		
		JButton btnInventory = new JButton("INVENTORY");
		btnInventory.setBounds(55, 165, 89, 23);
		panel.add(btnInventory);
		
		JButton btnReport = new JButton("REPORT");
		btnReport.setBounds(55, 215, 89, 23);
		panel.add(btnReport);
		
		JButton btnSupplierDetails = new JButton ("SUPPLIER DETAILS");
		btnSupplierDetails.setBounds(252, 120, 140, 40);
		panel.add(btnSupplierDetails);
		
		JButton btnRecentActivity = new JButton ("Recent Activity");
		btnRecentActivity.setBounds(252, 198, 140, 35);
		panel.add(btnRecentActivity);
	}
}
