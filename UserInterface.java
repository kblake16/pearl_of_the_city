package test;
import java.util.*;
import java.io.*;
public class UserInterface {
    
    //private static FileManagment files = new  FileManagment();
    private static Inventory managementSystem = new Inventory();
    protected boolean valid = false;
    int userOption ;

   /**
    *start of program with password verification
                    */
    public  void  begin (){
        while (!valid){
        Scanner obj1 = new Scanner (System.in);
        System.out.println("Pearl of the City Inventory ");
        menu();
    }
}
/**
    *main menu for user to choose options of what to do while in inventory system
                    */
    public  void menu (){
        Scanner obj1 = new Scanner (System.in);
            
        while (userOption != 12) {
            System.out.println("Please choose a number from the menu below ");
            System.out.println("1 - Create new item");
            System.out.println("2 - Search for item by entry # ");
            System.out.println("3 - Search for item by name ");
            System.out.println("4-  Modify item's name");
            System.out.println("5 - Modify item's cost price ");
            System.out.println("6 - Modify item's sell price");
            System.out.println("7 - Modify item's description");
            System.out.println("8 - Modify Quantity");
            System.out.println("9 - Display Items by name ");
            System.out.println("10 - Display Items by entry no");
            System.out.println("11- Exit");

            
                userOption = obj1.nextInt();
                switch (userOption){
                    case 1:
                        addItem();
                        break;
                    case 2:
                        entryNoSearch();
                        break;
                    case 3:
                        itemNameSearch();
                        break;
                    case 4:
                        updateName();
                        break;
                    case 6:
                        updateCostPrice();
                        break;
                    case 5:
                        updateSellPrice();
                        break;
                    case 7 :
                        updateQuantity();
                        break;
                    case 8 :
                        editDescription();
                        break;
                    case 9 :
                        nameDisplay();
                        break;
                    case 10:
                        entryDisplay();
                        break;
                    case 11:
                        deletebyName();
                        break;
                    case 12:
                        exit();
                        break;
                    
            
        }
                
            }
            //obj1.close();
        }
    /**
    *Add's a new item to the address managementSystem
                    */

        public static void addItem(){
            Scanner obj2 = new Scanner(System.in);
            System.out.println (" Enter item's name: ");
                     String iname = obj2.nextLine();
                    System.out.println (" Enter item's  brand : ");
                     String bname = obj2.nextLine();
                    System.out.println (" Enter type of item : ");
                    String typ = obj2.nextLine();
                    System.out.println (" Enter Quantity: ");
                     int quan = obj2.nextInt();
                     System.out.println (" Enter Description: ");
                     String deci = obj2.nextLine();
                    System.out.println (" Enter cost price: ");
                     int cp = obj2.nextInt();
                    System.out.println (" Enter sell price ");
                    int sp = obj2.nextInt();
                     managementSystem.addItem(iname, bname, typ, quan, deci, cp,sp);
            }
/**
    *search for an item by entry no and display info
                    */
            public static void  entryNoSearch(){
                Scanner obj2= new Scanner(System.in);
                System.out.println (" Enter entry number: ");
                int eum = obj2.nextInt();
                System.out.println(managementSystem.entryNoSearch(eum));
               
            }
/**
    *search for a item by name and display info
                    */
            public static void itemNameSearch(){
                Scanner obj2= new Scanner(System.in);
                System.out.println (" Enter name ");
                String is = obj2.nextLine();
                System.out.println(managementSystem.itemNameSearch(is));
               
                
            }
            /**
    * Update an item's name
                    */
            public static void updateName(){
                Scanner obj2= new Scanner(System.in);
                System.out.println (" Please item's entry number ");
                int ent = obj2.nextInt();
                obj2.nextLine();
                System.out.println (" Enter new item name ");
                String ln= obj2.nextLine();
                managementSystem.editName(ent, ln);
                //obj2.close();
            }
            
    // Updates    items price   

            public static void updateCostPrice(){
                Scanner obj2= new Scanner(System.in);
                System.out.println (" Please enter your entry number ");
                int ent = obj2.nextInt();
                obj2.nextLine();
                System.out.println (" Enter new cost price of item");
                int cpp = obj2.nextInt();
                managementSystem.changePrice(ent,cpp);
                //obj2.close();
            }
  /**
    * updates item's price 
                    */
            public static void updateSellPrice(){
                Scanner obj2= new Scanner(System.in);
                System.out.println (" Please enter item's entry number ");
                int ent = obj2.nextInt();
                obj2.nextLine();
                System.out.println (" Enter new  selling price of item ");
                int sp= obj2.nextInt();
                managementSystem.changeSellPrice(ent,sp);
                //obj2.close();
            }
             /**
    * Update item's quantity
                    */
            public static void updateQuantity(){
                Scanner obj2= new Scanner(System.in);
                Scanner obj3 = new Scanner (System.in);
                System.out.println (" Please enter your entry number ");
                int ent = obj2.nextInt();
                obj2.nextLine();
                System.out.println (" Enter the  amount you want to modify the inventory by :");
                int opt1 = obj3.nextInt();
                System.out.println (" Would you like to add to  or remove from the current quantity?");
                String opt = obj2.nextLine();
                if (opt.contains("add")){
                    managementSystem.addQuantity(ent,opt1);
                }
                if (opt.contains("remove")){
                    managementSystem.removeQuantity(ent,opt1);

                }
                
                //obj2.close();
            }
             /**
    * edit item's description profile
                    */
            public static void editDescription(){
                Scanner obj2= new Scanner(System.in);
                System.out.println (" Please enter your entry number ");
                int ent = obj2.nextInt();
                obj2.nextLine();
                System.out.println (" Enter  new item description:  ");
                String des= obj2.nextLine();
                managementSystem.editDescription(ent,des);
                //obj2.close();
            }
            
  /**
    * delete item by name
                    */
            public static void deletebyName(){
                Scanner obj2= new Scanner(System.in);
                System.out.println (" Please enter the name of the item you would like to delete ");
                String unwantedEntry = obj2.nextLine();
                managementSystem.deleteItem(unwantedEntry);
                //obj2.close();
            }
  /**
    * dispaly item by  name
                    */
            public static void nameDisplay(){
                System.out.println(managementSystem.itemByName());
            }
     /**
    * dispaly item by  entry no
                    */
            public static void entryDisplay (){
                System.out.println(managementSystem.itemByEntry());

            }
        /**          
    * gives the user the option of whether they want to save the info or not
                */
            public static void exit(){
                Scanner obj2 = new Scanner (System.in);
                System.out.print(" Are you finished using the system");
                System.out.print(" Please enter (Y) for yes OR  (N) for no");
                 String choice = obj2.nextLine();
                if (choice.equals("Y")) {
                   
                   System.exit(0);
    
                 
               
                }
                    
            }
            public static void main (String args[]){
                UserInterface textUi = new UserInterface();
                textUi.begin();
            }
        } 