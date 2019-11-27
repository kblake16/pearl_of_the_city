package InventoryManager;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.UIManager;


public class SalesGUI extends JFrame {
//Declaration of variables 
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel display;
	private JTextArea displayArea;
	private Transaction transaction;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesGUI window = new SalesGUI();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Constructor cretaes the window containing JFrame elements
	public SalesGUI() {
		//An instance of the Transaction class is created 
		transaction = new Transaction();
		
		//Creates Main Panel and its properties set
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1269, 634);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Sales heading label is creates and its properties set
		JLabel lblSales = new JLabel("Sales");
		lblSales.setBounds(531, 11, 306, 76);
		lblSales.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 50));
		contentPane.add(lblSales);
		
		
		//Display panel is created to display receipt as text
		display = new JPanel();
		display.setBounds(98, 132, 425, 452);
		contentPane.add(display);
		
		JTextArea displayArea = new JTextArea(transaction.toString() );
		display.add(displayArea);
		displayArea.setEditable(false);
		display.setBackground(UIManager.getColor("Button.highlight"));
		
		//Item Label is created and its properties set
		JLabel lblItem = new JLabel("Item:");
		lblItem.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 26));
		lblItem.setBounds(696, 151, 69, 30);
		contentPane.add(lblItem);
		
		//Item text field created and its properties set 
		textField = new JTextField();
		textField.setBounds(854, 151, 332, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Quantity label created and its properties set
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 26));
		lblQuantity.setBounds(696, 300, 111, 30);
		contentPane.add(lblQuantity);
		
		//Quantity text field created and its properties set
		textField_1 = new JTextField();
		textField_1.setBounds(854, 305, 96, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		//Add button created and its properties set
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			//When button is clicked, an action is performed 
			public void actionPerformed(ActionEvent e) {
				
				transaction.addItem(textField.getText(), Integer.parseInt(textField_1.getText()));
				displayArea.setText(transaction.toString());
			}
		});
		btnAdd.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnAdd.setForeground(new Color(128, 128, 0));
		btnAdd.setBounds(854, 422, 96, 40);
		contentPane.add(btnAdd);
		
		//Print button created and its properties set
		//When clicked button performs an action
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnPrint.setForeground(new Color(128, 128, 0));
		btnPrint.setBounds(1040, 422, 89, 40);
		contentPane.add(btnPrint);
		
		//Main Menu button created and its properties set 
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			//action performed when clicked. Home page is displayed and current page disappears 
			public void actionPerformed(ActionEvent e) {
				UserHomeGUI obj = new UserHomeGUI();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnMainMenu.setForeground(new Color(128, 128, 0));
		btnMainMenu.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnMainMenu.setBounds(939, 491, 118, 40);
		contentPane.add(btnMainMenu);
		
		
	}
}
