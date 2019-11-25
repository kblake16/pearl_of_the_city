package pearl_of_the_city;
import java.util.*;
import java.io.*;

//private File  test = new File ("inventory.bin");

public class Inventory{

    private ArrayList<InventoryItem> InventoryList =new ArrayList<InventoryItem>();
    private InventoryItem newObject;

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
   InventoryItem newObject = new  InventoryItem(name , brand, type,   quantity,   description , price,  sellPrice);
   
    if (! InventoryList.contains(newObject)) {
        InventoryList.add(newObject);
    } 
       
}


/**
    * delete a contact from Inventory List
        * @param entryNO, entry no  that the user wants to deleted
                */






public String entryNoSearch(int entryNO) {
    for (InventoryItem item1: InventoryList){
        if (item1.getEntryNo1() == entryNO){
            newObject = item1;
        }
    }
    return newObject.toString();
}

public String itemNameSearch(String name) {
    for (InventoryItem item: InventoryList){
        if (item.getName1() == name){
            newObject = item;
        }
    }
           return newObject.toString();
}

public double  getPrice (int ent){
    double pp = 0;
    for (InventoryItem item : InventoryList){
        if (item.getEntryNo1() == ent){
            pp =item.getPrice1();
          
        } 
    }
    return pp;
    
}

public double getSellPrice (int ent){
    double sp = 0;
    for (InventoryItem item : InventoryList){
        if (item.getEntryNo1() == ent){
            sp = item.getSellPrice1();
           
        }
    }
    return sp;   
}

public int getQuantity(int ent){
    int quan = 0;
    for (InventoryItem item : InventoryList){
        if (item.getEntryNo1() == ent){
      quan = item.getQuantity1();
        }
    }
    return quan;
}

public String  getDescription(int ent){
    String des ="";
    for (InventoryItem item : InventoryList){
        if (item.getEntryNo1() == ent){
    des = item.getDescription1();
}
}
    return des;
}


public void editName ( int ent, String name){
     for (InventoryItem item : InventoryList){
         if (item.getEntryNo1() == ent){
            item.editName1(name);
         }
     }
}

public void changePrice (int ent,double price){
    for (InventoryItem item : InventoryList){
        if (item.getEntryNo1() == ent){
           item.changePrice1(price);
        }
    }   
 }

public void changeSellPrice(int ent,double price){
    for (InventoryItem item : InventoryList){
        if (item.getEntryNo1() == ent){
        item.changeSellPrice1(price);
        }
    }
    
}

public void removeQuantity (int ent,int num){
    for (InventoryItem item : InventoryList){
        if (item.getEntryNo1() == ent){
     item.removeQuantity1(num);
        }
    }
   
}

public void editDescription(int ent,String name){
    for (InventoryItem item : InventoryList){
        if (item.getEntryNo1() == ent){
    item.editDescription1(name);
        }
    }
}

public void addQuantity(int ent ,int num){
     newObject.addQuantity1(num);
}

 /**
    * Returns  contact information sorted in order of entry number
        * @return string with item info
        */
        public String itemByEntry() {
            Collections.sort(InventoryList);
            String show = "";
            for (InventoryItem item: InventoryList) {
                show += item.appDisplay()+"\n";
            }
            return show;
            }

            /**
    * Returns  item information sorted in order of name
        * @return string with item info
        */
public String itemByName() {
    Comparator<InventoryItem> concom = new Comparator<InventoryItem>() {
        public int compare(InventoryItem i1, InventoryItem i2) {
            return i1.getName().compareTo(i2.getName());
        }
    };
    
    Collections.sort(InventoryList, concom);
    
    String show = "";
    for (InventoryItem item: InventoryList) {
        show += item.appDisplay()+"\n";
    }
    return show;
}

public void deleteItem (String name) {
    ArrayList<InventoryItem> removal = new ArrayList<InventoryItem>();
    for (InventoryItem item: InventoryList){
        if (item.getName() == name){
            removal.add(item);
        }

    }
    InventoryList.removeAll(removal);
}


}
