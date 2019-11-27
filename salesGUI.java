package pearl_of_the_city;
 import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
    import java.text.DecimalFormat;

        public class salesGUI extends JFrame{
            //create the objects
            JLabel name;
            JLabel price;
            JLabel quantity;
            JLabel sale;
            JTextField itemPrice;
            JTextField itemq;
            JTextField salePrice;
            JButton total;
            JButton calculate;
            JButton clear;

            public salesGUI() {
                //set object variables
                super(" Sales ");  //set window bar title
                setSize(300, 300);  //set window size
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //set window              close
                GridLayout grid = new GridLayout(7, 2);
                setLayout(grid);
                
                name = new JLabel("Item Name");	
                itemName = new JTextField(10);

		Invetory itemName= new Inventory();
		JComboBox itemName = new JComboBox(InvetoryList);
		itemName.addActionListener(this);

                price = new JLabel("Original Price");
                itemPrice = new JTextField(10);
                quantity = new JLabel("Quantity");
                itemq = new JTextField(10);
                sale = new JLabel("Sale Price");
                salePrice = new JTextField(10);
                salePrice.setEditable(false);
                calculate = new JButton("Calculate");
                clear = new JButton("Clear");
             
                add(name);
                add(itemName);
                add(price);
                add(itemPrice);
                add(quantity);
                add(itemq);
                add(sale);
                add(salePrice);
                add(calculate);
                add(clear);    

             

                calculate.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

			     Inventory input = new Inventory();
			     Item quantity = new Item();

			     input = itemPrice.getPrice();
                 quantity= itemq.getQuantity();
			     salePrice= quantity * input;
                    
                    }
                });
                        

                //add event listener to reset fields
                clear.addActionListener (new ActionListener() {
                    public void actionPerformed(ActionEvent event) {  //JButton event if clicked
                     
                        
                        itemName.setText(null);  //Item Name will be empty and can be reset
                        itemPrice.setText(null);  //Item Price will be empty and can be reset
                        itemq.setText(null); // Item quantity will be empty and can be reset
                        salePrice.setText(null);  //Item SalePrice will be empty and can be reset
                    }
                });

                setVisible(true);
            }  //end public sales

            public static void main(String[] args) {
                new salesGUI();

            }  //end public static void

          }  //end public class sales
