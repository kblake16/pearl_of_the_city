package newGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newGUI frame = new newGUI();
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
	public newGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 142, 35));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHome = new JLabel("System Information");
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHome.setBounds(122, 11, 193, 22);
		contentPane.add(lblHome);
		
		JLabel lblSek = new JLabel("Select Applicable ");
		lblSek.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSek.setBounds(158, 66, 110, 22);
		contentPane.add(lblSek);
		
		JButton btnAdministrator = new JButton("Administrator");
		btnAdministrator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdministrator.setBounds(158, 119, 103, 22);
		contentPane.add(btnAdministrator);
		
		JButton btnUser = new JButton("User");
		btnUser.setBounds(158, 172, 103, 22);
		contentPane.add(btnUser);
	}
}
