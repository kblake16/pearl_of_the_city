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
public void addItem (String name , String brand, String type,  int quantity,  String description , double price,  double sellPrice) {
   Item newObject = new  Item(name , brand, type,   quantity,   description , price,  sellPrice);
   
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
    if (item1.getQuantity1() <= notify){
        newObject = item1;
        String name = newObject.getName();
        return ( name + " Quantity is curently low and should be restocked as soon as possible");
    }
    
}
return (" No notifications at this time");
}



public String entryNoSearch(int entryNO) {
    for (Item item1: InventoryList){
        if (item1.getEntryNo() == entryNO){
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
           return newObject.toString();
}

public double getPrice (int ent){
    double pp = 0;
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
            pp =item.getPrice();
          
        } 
    }
    return pp;
    
}

public double getSellPrice (int ent){
    double sp = 0;
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
            sp = item.getSellPrice();
           
        }
    }
    return sp;   
}

public int getQuantity(int ent){
    int quan = 0;
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
      quan = item.getQuantity();
        }
    }
    return quan;
}

public String  getDescription(int ent){
    String des ="";
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
    des = item.getDescription();
}
}
    return des;
}


public void editName ( int ent, String name){
     for (Item item : InventoryList){
         if (item.getEntryNo() == ent){
            item.editName(name);
         }
     }
}

public void changePrice (int ent,double price){
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
           item.changePrice(price);
        }
    }   
 }

public void changeSellPrice(int ent,double price){
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
        item.changeSellPrice(price);
        }
    }
    
}

public void removeQuantity (int ent,int num){
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
     item.removeQuantity(num);
        }
    }
   
}

public void editDescription(int ent,String name){
    for (Item item : InventoryList){
        if (item.getEntryNo() == ent){
    item.editDescription(name);
        }
    }
}

public void addQuantity(int ent ,int num){
     newObject.addQuantity(num);
}

 /**
    * Returns  contact information sorted in order of entry number
        * @return string with item info
        */
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

public void deleteItem (String name) {
    ArrayList<Item> removal = new ArrayList<Item>();
    for (Item item: InventoryList){
        if (item.getName() == name){
            removal.add(item);
        }

    }
    InventoryList.removeAll(removal);
}




}
