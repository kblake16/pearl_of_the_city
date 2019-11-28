package InventoryManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
//import java.awt.Rectangle;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.JTableHeader;
//import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
//import javax.swing.table.TableRowSorter;
//import javax.swing.RowFilter;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class SupplierInfoGUI extends JFrame {

	//Declaration of Variables
	private String category;
	private Item item;
	private Inventory inventory;
	private static final long serialVersionUID = 1L;
	//private JTableHeader header;
	private JPanel contentPane;
	private JTextField searchField;
	private JButton addBtn;
	private JTable table;
	private JButton refreshBtn;
	JLabel inventoryLabel = new JLabel("Supplier Information");
	JScrollPane scrollPane = new JScrollPane();
	JButton searchBtn = new JButton("SEARCH");
	JButton btnDelete = new JButton("DELETE");
	private JTextField name;
	private JTextField email;
	private JTextField address;
	private JTextField telno;
	JPanel panel = new JPanel();
	
	private SupplierDataManager supplier = new SupplierDataManager();
	private SupplierInfo sup;
	private final JButton menubtn = new JButton("MAIN MENU");
	
	//Main function that runs the program
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupplierInfoGUI frame = new SupplierInfoGUI();
					frame.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	//Method to filter data in table
	//Method to make table header editable 
	
	
	//Creates the frame and sets the properties
	@SuppressWarnings("serial")
	public SupplierInfoGUI() {
		
		sup = supplier.readFromFile();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1650, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Creates a scroll pane and sets the properties
		scrollPane.setBounds(487, 136, 798, 556);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		
		//Creates a table and sets the properties
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Add an action for when the table items are clicked
				int x = table.getSelectedRow();
				TableModel model = table.getModel();
				//Gets data in the table and sets it to the corresponding text field or radio button
				name.setText(model.getValueAt(x, 1).toString());
				email.setText(model.getValueAt(x, 4).toString());
				address.setText(model.getValueAt(x, 3).toString());
				telno.setText(model.getValueAt(x, 2).toString());
								
			}
		});
			
		table.setBorder(new LineBorder(new Color(255, 255, 255)));
		table.setBackground(new Color(240, 255, 240));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "EMAIL", "ADDRESS", "TELEPHONE NUMBER"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(98);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(162);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(119);
		scrollPane.setViewportView(table);
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		for (Item i: inventory.getItems())
		{
			model.addRow(new Object[] {i.getCategory(), i.getName(),String.valueOf(i.getPrice()), String.valueOf(i.getSellPrice()),String.valueOf(i.getQuantity()), i.getDescription()});
		}
		
		
		//Creates the "ADD" button and sets its properties
		addBtn = new JButton("ADD ");
		addBtn.setBounds(73, 561, 97, 38);
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Assigns an action to the button when clicked; items are added to table
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {category,name.getText(), email.getText(), address.getText(),telno.getText()});
				
				//item = new Item(category, name.getText(), Double.parseDouble(email.getText()) , Double.parseDouble(address.getText()), Integer.parseInt(telno.getText()));
				
				inventory.addItem(item.getCode(), item.getCategory(), item.getName(), item.getPrice(), item.getSellPrice(), item.getQuantity(), item.getDescription());
			}
		});
		addBtn.setForeground(new Color(128, 128, 0));
		addBtn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		
		
		//Creates the "SEARCH" button and sets its properties
		searchBtn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		searchBtn.setBounds(1053, 87, 111, 39);
		searchBtn.setForeground(new Color(128, 128, 0));
		
		//Creates the "RESET" button and sets its properties
		refreshBtn = new JButton("RESET");
		refreshBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				email.setText("");
				address.setText("");
				telno.setText("");
				
			}
		});
		refreshBtn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		refreshBtn.setBounds(207, 561, 100, 38);
		refreshBtn.setForeground(new Color(128, 128, 0));
		contentPane.setLayout(null);
		
		//Creates the label Inventory, that is used as the heading of page
		//Sets label properties
		inventoryLabel.setBounds(10, 11, 467, 87);
		inventoryLabel.setForeground(new Color(0, 0, 0));
		inventoryLabel.setBackground(new Color(255, 255, 255));
		inventoryLabel.setLabelFor(this);
		inventoryLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 56));
		contentPane.add(inventoryLabel);
		
		//Creates search field and sets its properties
		searchField = new JTextField();
		searchField.setBounds(487, 87, 556, 38);
		searchField.setBackground(new Color(240, 255, 240));
		searchField.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		searchField.setColumns(10);
		
		//Adds buttons, search field and scroll pane to the main panel
		contentPane.add(searchField);
		contentPane.add(addBtn);
		
		//Creates delete button and sets its properties
		//Assigns an action to the button when clicked
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.removeRow( row );
				name.setText("");
				email.setText("");
				address.setText("");
				telno.setText("");
				
			}
		});
		
		btnDelete.setForeground(new Color(128, 128, 0));
		btnDelete.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		btnDelete.setBounds(347, 561, 89, 38);
		contentPane.add(btnDelete);
		contentPane.add(searchBtn);
		contentPane.add(refreshBtn);
		contentPane.add(scrollPane);
		
		//Creates a second panel which contains text fields, labels and radio buttons for data to be inputed 
		//Sets its properties
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(94, 136, 338, 384);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Creates individual labels, "Name, Cost Price, Selling Price, Quantity, Description and Category" to second panel
		//Sets properties
		JLabel namelb = new JLabel("Name:");
		namelb.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		namelb.setBounds(10, 21, 48, 14);
		panel.add(namelb);
		
		JLabel emaillb = new JLabel("Email:");
		emaillb.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		emaillb.setBounds(10, 83, 70, 14);
		panel.add(emaillb);
		
		JLabel addresslb = new JLabel("Address:");
		addresslb.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		addresslb.setBounds(10, 167, 85, 14);
		panel.add(addresslb);
		
		JLabel phonelb = new JLabel("Telephone Number:");
		phonelb.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		phonelb.setBounds(10, 275, 128, 14);
		panel.add(phonelb);
		
		//Creates individual text fields, "name, cost price, selling price, quantity and description" to second panel
		//Sets properties
		name = new JTextField();
		name.setBounds(10, 36, 264, 27);
		panel.add(name);
		name.setColumns(10);
		
		email = new JTextField();
		email.setBounds(10, 108, 264, 27);
		panel.add(email);
		email.setColumns(10);
		
		address = new JTextField();
		address.setBounds(10, 192, 264, 38);
		panel.add(address);
		address.setColumns(10);
		
		telno = new JTextField();
		telno.setBounds(10, 300, 264, 27);
		panel.add(telno);
		telno.setColumns(10);
		menubtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomeGUI obj = new UserHomeGUI();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		menubtn.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		menubtn.setForeground(new Color(128, 128, 0));
		menubtn.setBounds(1174, 87, 111, 38);
		
		contentPane.add(menubtn);
		
	}
}
