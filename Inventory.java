package pearl_of_the_city;
import java.util.*;
import java.io.*;



public class Inventory  {

    private ArrayList<Item> InventoryList =new ArrayList<Item>();
    private Item newObject;

    public Inventory() {
   
	
    }
/**
			 * Creates the item object
				 * @param name, item name
                 *   @param brand,  brand of item
                  * @param type, type of item
                   * @param  quantity, item quantity
                   * @param  price , cost price of item
                   * *@param  sellPrice , selling price
				 */
public void addItem (String type, String name, double cp,  double sp , int quan,  String des) {
   Item newObject = new  Item( type, name,  cp,  sp , quan,   des);
   
    if (! InventoryList.contains(newObject)) {
        InventoryList.add(newObject);
    }      
}


/**
    * Checks if the quantity of any item in the store is below 5
        * @return Notification with what products stock level are low 
                */

public String stockLevel(){
    int notify = 5;
for (Item item1: InventoryList){
    if (item1.getQuantity() <= notify){
        newObject = item1;
        String name = newObject.getName();
        return ( name + " Quantity is curently low and should be restocked as soon as possible");
    }
    
}
return (" No notifications at this time");
}

/**
    * Displays information for a specific item by entering it's entry no.
     * @param entryNO, item's entry no
        * @return Notification with information on the specific item 
                */

public String entryNoSearch(String entryNO) {
    for (Item item1: InventoryList){
        if (item1.displayProductCode().equals(entryNO)){
            newObject = item1;
        }
    }
    return newObject.appDisplay();
}
/**
    * Displays information for a specific item by entering it's entry no.
     * @param name, item's name
        * @return Notification with information on the specific item 
                */
public String itemNameSearch(String name) {
    for (Item item: InventoryList){
        if (item.getName().equals(name)){
            newObject = item;
        }
    }
           return newObject.appDisplay();
}
/**
    * Displays cost price for a specific item by entering it's entry no.
     * @param ent, item's  entry number
        * @return Cost Price for  specific item 
                */
public double getPrice(String ent ){
    double pp = 0;
    for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)){
            pp =item.getPrice();
          
        } 
    }
    return pp;
    
}
/**
    * Displays selling price for a specific item by entering it's entry no.
     * @param ent, item's  entry number
        * @return Selling Price for  specific item 
                */
public double getSellPrice(String ent ){
    double sp = 0;
    for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)){
            sp = item.getSellPrice();
           
        }
    }
    return sp;   
}
/**
    * Displays quantity for a specific item by entering it's entry no.
     * @param ent, item's  entry number
        * @return Quantity  for  specific item 
                */
public double getQuantity(String ent){
    double quan = 0;
    for (Item item: InventoryList){
        if (item.displayProductCode().equals(ent)){
            quan = item. getQuantity();
        }
    }
    return quan;
}
/**
    * Displays description for a specific item by entering it's entry no.
     * @param ent, item's  entry number
        * @return Description  for  specific item 
                */
public String  getDescription(String ent){
    String des ="";
    for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)){
    des = item.getDescription();
}
}
    return des;
}

/**
    * Updates the name for a specific item by entering it's entry no.
     * @param ent  @param  name  item's  entry number and new name
                */
public void editName (String ent ,String name){
     for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)){
            item.editName(name);
         }
     }
}
/**
    * Updates the cost price for a specific item by entering it's entry no.
     * @param ent  @param  price  item's  entry number and new price
                */
public void changePrice(String ent ,double price){
    for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)){
           item.changePrice(price);
        }
    }   
 }
/**
    * Updates the selling price for a specific item by entering it's entry no.
     * @param ent  @param  price  item's  entry number and new price
                */
public void changeSellPrice(String ent ,double price){
    for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)){
            item.changeSellPrice(price);
        }
    }
    
}
/**
    * Updates the quantity  for a specific item by entering it's entry no.
     * @param ent  @param  num  item's  entry number and quantity to remove
                */
public void removeQuantity(String ent, int num){
    for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)) {
            item.removeQuantity(num);
        }
    }
   
}
/**
    * Updates the description for a specific item by entering it's entry no.
     * @param ent  @param  name  item's  entry number and new description
                */
public void editDescription(String ent, String name){
    for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)){
         item.editDescription(name);
        }
    }
}
/**
    * Updates the quantity  for a specific item by entering it's entry no.
     * @param ent  @param  num  item's  entry number and quantity to add
                */
public void addQuantity(String ent,int num){
    for (Item item : InventoryList){
        if (item.displayProductCode().equals(ent)){
            item.addQuantity(num);
        }
    }
    
}

 
   // * Returns  contact information sorted in order of entry number
     //   * @return string with item info
        
        public String itemByEntry() {

            Collections.sort(InventoryList);
            String show = "";
            for (Item item: InventoryList) {
                show += item.appDisplay()+"\n";
            }
            return show;
            }
         /**
    * Returns  item information sorted in order of name
        * @return string with item info
        */

 public String itemByName(){
    Comparator<Item> concom = new Comparator<Item>() {
        public int compare(Item i1, Item i2) {
            return i1.getName().compareTo(i2.getName());
        }
    };
    Collections.sort(InventoryList, concom);
    
    String show = "";
    for (Item item: InventoryList) {
        show += item.appDisplay()+"\n";
    }
    return show;
}
/**
    * Deletes a specific item by entering it's entry no.
     * @param entryNo item's  entry number 
                */
public void deleteItem(String entryNo) {
    ArrayList<Item> outThere = new ArrayList<Item>();
    for (Item item1: InventoryList){
        if (item1.displayProductCode().equals(entryNo)){
            outThere.add(item1);
        }

    }
    InventoryList.removeAll(outThere);
}




}
