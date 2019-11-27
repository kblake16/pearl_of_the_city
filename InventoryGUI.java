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

public class InventoryGUI extends JFrame {

	//Declaration of Variables
	private ButtonGroup group;
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
	JLabel inventoryLabel = new JLabel("Inventory ");
	JScrollPane scrollPane = new JScrollPane();
	JButton searchBtn = new JButton("SEARCH");
	JButton btnDelete = new JButton("DELETE");
	private JTextField name;
	private JTextField costP;
	private JTextField sellingP;
	private JTextField desc;
	private JTextField quantity;
	JPanel panel = new JPanel();
	JRadioButton cosmetics = new JRadioButton("Cosmetics",true);
	JRadioButton fragrance = new JRadioButton("Fragrance",false);
	JRadioButton skincare = new JRadioButton("Skin Care",false);
	JRadioButton bath = new JRadioButton("Soap/Bath Products",false);
	JRadioButton extension = new JRadioButton("Hair Extension",false);
	JRadioButton eye = new JRadioButton("Eyecare/ Eyewear",false);
	JRadioButton products = new JRadioButton("Hair Products",false);
	JRadioButton accessories = new JRadioButton("Hair Accessories",false);
	
	private InventoryDataManager inventoryFile = new InventoryDataManager();
	private final JButton btnLogout = new JButton("Logout");
	
	//Main function that runs the program
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryGUI frame = new InventoryGUI();
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
	public InventoryGUI() {
		
		inventory = inventoryFile.readFromFile();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1650, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Creates a scroll pane ans sets the properties
		scrollPane.setBounds(487, 136, 627, 556);
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
				costP.setText(model.getValueAt(x, 2).toString());
				sellingP.setText(model.getValueAt(x, 3).toString());
				quantity.setText(model.getValueAt(x, 4).toString());
				desc.setText(model.getValueAt(x, 5).toString());
				String type = model.getValueAt(x, 0).toString();
								
				if(type.equals("Cosmetics")){
					cosmetics.setSelected(true);
				}
				if(type.equals("Fragrance")){
					fragrance.setSelected(true);
				}
				if(type.equals("Eye Care/ Eye Wear")){
					eye.setSelected(true);
					}
				if(type.equals("Skin Care")){
					skincare.setSelected(true);
					}
				if(type.equals("Hair Accessories")){
					accessories.setSelected(true);
					}
				if(type.equals("Hair Extension")){
					extension.setSelected(true);
					}
				if(type.equals("Hair Products")){
					products.setSelected(true);
				}
				else{
					bath.setSelected(true);
				}
			}
		});
		group = new ButtonGroup();
	 	group = new ButtonGroup();
		group.add(cosmetics);
		group.add(fragrance);
		group.add(skincare);
		group.add(eye);
		group.add(bath);
		group.add(extension);
		group.add(accessories);
		group.add(products);
			
		table.setBorder(new LineBorder(new Color(255, 255, 255)));
		table.setBackground(new Color(240, 255, 240));
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CODE", "NAME", "COST PRICE", "SELLING PRICE", "QUANTITY", "DESCRIPTION"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(98);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(117);
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
				model.addRow(new Object[] {category,name.getText(), costP.getText(), sellingP.getText(),quantity.getText(), desc.getText()});
				
				item = new Item(category, name.getText(), Double.parseDouble(costP.getText()) , Double.parseDouble(sellingP.getText()), Integer.parseInt(quantity.getText()), desc.getText());
				
				inventory.addItem(item.getCode(), item.getCategory(), item.getName(), item.getPrice(), item.getSellPrice(), item.getQuantity(), item.getDescription());
			}
		});
		addBtn.setForeground(new Color(128, 128, 0));
		addBtn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		
		
		//Creates the "SEARCH" button and sets its properties
		searchBtn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		searchBtn.setBounds(1124, 87, 97, 39);
		searchBtn.setForeground(new Color(128, 128, 0));
		
		//Creates the "RESET" button and sets its properties
		refreshBtn = new JButton("RESET");
		refreshBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				costP.setText("");
				sellingP.setText("");
				quantity.setText("");
				desc.setText("");
				cosmetics.setSelected(false);
				fragrance.setSelected(false);
				eye.setSelected(false);
				skincare.setSelected(false);
				extension.setSelected(false);
				products.setSelected(false);
				bath.setSelected(false);
				accessories.setSelected(false);
			}
		});
		refreshBtn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		refreshBtn.setBounds(207, 561, 100, 38);
		refreshBtn.setForeground(new Color(128, 128, 0));
		contentPane.setLayout(null);
		
		//Creates delete button and sets its properties
		//Assigns an action to the button when clicked
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.removeRow( row );
				name.setText("");
				costP.setText("");
				sellingP.setText("");
				quantity.setText("");
				desc.setText("");
				cosmetics.setSelected(false);
				fragrance.setSelected(false);
				eye.setSelected(false);
				skincare.setSelected(false);
				extension.setSelected(false);
				products.setSelected(false);
				bath.setSelected(false);
				accessories.setSelected(false);
			}
		});
		
		btnDelete.setForeground(new Color(128, 128, 0));
		btnDelete.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 18));
		btnDelete.setBounds(347, 561, 89, 38);
		contentPane.add(btnDelete);
		
		//Creates the label Inventory, that is used as the heading of page
		//Sets label properties
		inventoryLabel.setBounds(94, 11, 289, 87);
		inventoryLabel.setForeground(new Color(0, 0, 0));
		inventoryLabel.setBackground(new Color(255, 255, 255));
		inventoryLabel.setLabelFor(this);
		inventoryLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 56));
		contentPane.add(inventoryLabel);
		
		//Creates search field and sets its properties
		searchField = new JTextField();
		searchField.setBounds(487, 87, 627, 38);
		searchField.setBackground(new Color(240, 255, 240));
		searchField.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		searchField.setColumns(10);
		
		//Adds buttons, search field and scroll pane to the main panel
		contentPane.add(searchField);
		contentPane.add(addBtn);
		contentPane.add(searchBtn);
		contentPane.add(refreshBtn);
		contentPane.add(scrollPane);
		
		//Creates a second panel which contains text fields, labels and radio buttons for data to be inputed 
		//Sets its properties
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(27, 136, 434, 384);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Creates individual labels, "Name, Cost Price, Selling Price, Quantity, Description and Category" to second panel
		//Sets properties
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 21, 48, 14);
		panel.add(lblName);
		
		JLabel lblCostPrice = new JLabel("Cost Price:");
		lblCostPrice.setBounds(10, 67, 70, 14);
		panel.add(lblCostPrice);
		
		JLabel lblSellingPrice = new JLabel("Selling Price:");
		lblSellingPrice.setBounds(10, 117, 85, 14);
		panel.add(lblSellingPrice);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(234, 21, 85, 14);
		panel.add(lblQuantity);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(234, 67, 96, 14);
		panel.add(lblDescription);
		
		JLabel lblDescription_1 = new JLabel("Category:");
		lblDescription_1.setBounds(10, 185, 70, 14);
		panel.add(lblDescription_1);
		
		//Creates individual text fields, "name, cost price, selling price, quantity and description" to second panel
		//Sets properties
		name = new JTextField();
		name.setBounds(10, 36, 146, 20);
		panel.add(name);
		name.setColumns(10);
		
		costP = new JTextField();
		costP.setBounds(10, 86, 146, 20);
		panel.add(costP);
		costP.setColumns(10);
		
		sellingP = new JTextField();
		sellingP.setBounds(10, 136, 146, 20);
		panel.add(sellingP);
		sellingP.setColumns(10);
		
		desc = new JTextField();
		desc.setBounds(234, 92, 159, 64);
		panel.add(desc);
		desc.setColumns(10);
		
		quantity = new JTextField();
		quantity.setBounds(234, 36, 96, 20);
		panel.add(quantity);
		quantity.setColumns(10);
		
		
		//Creates individual radio buttons, "cosmetics, fragrance, eyecare/eyewear, 
		//skin care, hair accessories, hair extension, hair products, soap/bath products" to second panel
		//Sets properties
		//Assigns an action to the button when clicked
		cosmetics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				category = "Cosmetics";
				
			}
		});
		fragrance.setBackground(new Color(245, 255, 250));
		cosmetics.setBounds(10, 206, 109, 20);
		panel.add(cosmetics);
		cosmetics.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				category = "Fragrance";
				
			}
		});
		fragrance.setBackground(new Color(245, 255, 250));
		fragrance.setBounds(154, 205, 109, 23);
		panel.add(fragrance);
		
		skincare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				category = "Skin Care";
				
			}
		});
		skincare.setBackground(new Color(245, 255, 250));
		skincare.setBounds(10, 251, 109, 23);
		panel.add(skincare);
		
		bath.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				category = "Soap/Bath Products";
				
			}
		});
		bath.setBackground(new Color(245, 255, 250));
		bath.setBounds(10, 342, 128, 23);
		panel.add(bath);
		
		extension.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				category = "Hair Extension";
				
			}
		});
		extension.setBackground(new Color(245, 255, 250));
		extension.setBounds(154, 300, 109, 23);
		panel.add(extension);
		
		eye.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				category = "Eyecare/Eyewear";
				
			}
		});
		eye.setBackground(new Color(245, 255, 250));
		eye.setBounds(10, 300, 121, 23);
		panel.add(eye);
		
		products.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				category = "Hair Product";
				
			}
		});
		products.setBackground(new Color(245, 255, 250));
		products.setBounds(154, 342, 109, 23);
		panel.add(products);
		
		accessories.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				category = "Accessories";
				
			}
		});
		accessories.setBackground(new Color(245, 255, 250));
		accessories.setBounds(154, 251, 109, 23);
		panel.add(accessories);
		
		JTextPane stockLevel = new JTextPane();
		stockLevel.setEnabled(false);
		stockLevel.setBounds(1124, 137, 236, 555);
		contentPane.add(stockLevel);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserHomeGUI obj = new UserHomeGUI();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnLogout.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		btnLogout.setForeground(new Color(128, 128, 0));
		btnLogout.setBounds(1254, 87, 106, 38);
		
		contentPane.add(btnLogout);
		
	}
}
