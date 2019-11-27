
import java.util.*;
import java.io.*;




public class Inventory  {

    private ArrayList<Item> InventoryList =new ArrayList<Item>();
    private Item item;
    Map<String, String> Changes = new HashMap<String, String>();

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
                   * *@param  code , item's unique identifying number 
				 */
public void addItem ( Item item) {
    String item1 = "";
   item = item;
   
    if (! InventoryList.contains(item)) {
        InventoryList.add(item);
        item1 = item.getName();
        
    }   
    Changes.put(" Item  was added to Inventory: " , item1 )   ;
}

public ArrayList<String[]> getItems()
{
	ArrayList<String[]> items = new ArrayList<String[]>();
	String[] product  = new String[7];
	for (Item i: InventoryList)
	{
		product[0] = i.getCode();
		product[1] = i.getCategory();
		product[2] = i.getName();
		product[3] = String.valueOf(i.getPrice());
		product[4] = String.valueOf(i.getSellPrice());
		product[5] = String.valueOf(i.getQuantity());
		product[6] = i.getDescription();
		items.add(product);
	}
	return items;
}

public Item getItem(String code)
{
	 Item item = new Item();
	for (Item i: InventoryList)
	{
		if (code.equals(i.getCode()))
		{
			item = i;
		}
	}
		
	
	return item;
}


/**
    * Checks if the quantity of any item in the store is below 5
        * @return Notification with what products stock level are low 
                */

public String stockLevel(){
    int notify = 5;
for (Item item1: InventoryList){
    if (item1.getQuantity() <= notify){
        item = item1;
        String name = item.getName();
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

public String  codeSearch(String entryNO) {
    String  item3 =  "";
    for (Item item1: InventoryList){
        if (item1.getCode().equals(entryNO)){
            item3 = item1.getName();
            item = item1;
        }
    }
    Changes.put("Code Search", item3);
    return item.appDisplay();
}
/**
    * Displays information for a specific item by entering it's entry no.
     * @param name, item's name
        * @return Notification with information on the specific item 
                */
public String itemNameSearch(String name) {
    for (Item item: InventoryList){
        if (item.getName().equals(name)){
            item = item;
        }
    }
   
           return item.appDisplay();
}
/**
    * Displays cost price for a specific item by entering it's entry no.
     * @param ent, item's  entry number
        * @return Cost Price for  specific item 
                */
public double getPrice(String ent){
    double pp = 0;
    for (Item item : InventoryList){
        if (item.getCode().equals(ent)){
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
        if (item.getCode().equals(ent)){
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
        if (item.getCode().equals(ent)){
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
        if (item.getCode().equals(ent)){
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
    String name1 = "";
     for (Item item : InventoryList){
        if (item.getCode().equals(ent)){
            name1 = item.getName();
            item.editName(name);
         }
     }
     Changes.put("Name Changed: ", name1);
}
/**
    * Updates the cost price for a specific item by entering it's entry no.
     * @param ent  @param  price  item's  entry number and new price
                */
public void changePrice(String ent ,double price){
    String price1 = "";
    for (Item item : InventoryList){
        if (item.getCode().equals(ent)){
            price1 = String.valueOf(item.getPrice());
           item.changePrice(price);
        }
    } 
    Changes.put("Price Changed from : ", price1);
 }
/**
    * Updates the selling price for a specific item by entering it's entry no.
     * @param ent  @param  price  item's  entry number and new price
                */
public void changeSellPrice(String ent ,double price){
    String price2 = "";
    for (Item item : InventoryList){
        if (item.getCode().equals(ent)){
            price2 = String.valueOf(item.getSellPrice());
            item.changeSellPrice(price);
        }
    }
    Changes.put(" Sell Price Changed from : ", price2);
}
/**
    * Updates the quantity  for a specific item by entering it's entry no.
     * @param ent  @param  num  item's  entry number and quantity to remove
                */
public void removeQuantity(String ent, int num){
    String quan1 = "";
    for (Item item : InventoryList){
        if (item.getCode().equals(ent)) {
             quan1 =  String.valueOf(num);
            item.removeQuantity(num);
        }
    }
    Changes.put(" Quantity has been modified by:", quan1);
}
/**
    * Updates the description for a specific item by entering it's entry no.
     * @param ent  @param  name  item's  entry number and new description
                */
public void editDescription(String ent, String name){
    
    for (Item item : InventoryList){
        if (item.getCode().equals(ent)){
            
         item.editDescription(name);
        }
    }
    Changes.put("Description has been updated to:", name);
}
/**
    * Updates the quantity  for a specific item by entering it's entry no.
     * @param ent  @param  num  item's  entry number and quantity to add
                */
public void addQuantity(String ent,int num){
    String num3 = "";
    for (Item item : InventoryList){
        if (item.getCode().equals(ent)){
            num3 = String.valueOf(num);
            item.addQuantity(num);
        }
    }
    Changes.put("Quantity has been modified by :", num3);
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
    String lfc = ""; 
    ArrayList<Item> outThere = new ArrayList<Item>();
    for (Item item1: InventoryList){
        if (item1.getCode().equals(entryNo)){
            lfc = item1.getName();
            outThere.add(item1);
        }

    }
    InventoryList.removeAll(outThere);
    Changes.put("This item has been deleted :", lfc);
}

/**
    * Displays all changes that have been made to item's within the Inventory
     * @return  An ArrayList with all changes that have been made to the Invetory. 
                */
public ArrayList recentChanges(){
   
    ArrayList <String> recentActivity = new ArrayList<String>();
    String test1 = "";
    

        for (String key : Changes.keySet()){
            test1 = key + Changes.get(key);
             recentActivity.add(test1);
    }
    return recentActivity;

}



}
