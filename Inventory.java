package pearl_of_the_city;
import java.util.*;
import java.io.*;

//private File  test = new File ("inventory.bin");

public class Inventory  {

    private ArrayList<Item> InventoryList =new ArrayList<Item>();
    private Item newObject;

    public Inventory( ) {
    //Item newObject = (name, brand, price, type,quantity,description  sellPrice ,  , );
	
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
    * delete a contact from Inventory List
        * @param entryNO, entry no  that the user wants to deleted
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



public String entryNoSearch(String entryNO) {
    for (Item item1: InventoryList){
        if (item1.getEntryNo().equals(entryNO)){
            newObject = item1;
        }
    }
    return newObject.toString();
}

public String itemNameSearch(String name) {
    for (Item item: InventoryList){
        if (item.getName() == name){
            newObject = item;
        }
    }
           return newObject.appDisplay();
}

public double getPrice(String ent ){
    double pp = 0;
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
            pp =item.getPrice();
          
        } 
    }
    return pp;
    
}

public double getSellPrice(String ent ){
    double sp = 0;
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
            sp = item.getSellPrice();
           
        }
    }
    return sp;   
}

public double getQuantity(String ent){
    double quan = 0;
    for (Item item: InventoryList){
        if (item.getEntryNo() == ent){
            quan = item. getQuantity();
        }
    }
    return quan;
}

public String  getDescription(String ent){
    String des ="";
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
    des = item.getDescription();
}
}
    return des;
}


public void editName (String ent ,String name){
     for (Item item : InventoryList){
         if (item.getEntryNo() == ent){
            item.editName(name);
         }
     }
}

public void changePrice(String ent ,double price){
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
           item.changePrice(price);
        }
    }   
 }

public void changeSellPrice(String ent ,double price){
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
        item.changeSellPrice(price);
        }
    }
    
}

public void removeQuantity(String ent, int num){
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
     item.removeQuantity(num);
        }
    }
   
}

public void editDescriptioString(String ent, String name){
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
    item.editDescription(name);
        }
    }
}

public void addQuantity(int num){
     newObject.addQuantity(num);
}

 /**
    * Returns  contact information sorted in order of entry number
        * @return string with item info
        
        public String itemByEntry() {
            Collections.sort(InventoryList);
            String show = "";
            for (Item item: InventoryList) {
                show += item.appDisplay()+"\n";
            }
            return show;
            }
*/
            /**
    * Returns  item information sorted in order of name
        * @return string with item info
        */
/**
 public String itemByName() {
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
*/
public void deleteItem(String entryNo) {
    
    for (Item item1: InventoryList){
        if (item1.getEntryNo() == entryNo){
            InventoryList.remove(item1);
        }

    }
    
}




}
