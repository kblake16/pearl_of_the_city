
import java.util.*;

public class Item implements Comparable <Item> {
    private String itemName;
    private String category;
    private String description;
    private double sellingPrice;
    private double costPrice;
    private int quantity;
    private String code;
    Map<String, String> Categories = new HashMap<String, String>();
    private static int cos = 1;
    private static int frg = 1;
    private static int skc = 1;
    private static int btp = 1;
    private static int het = 1;
    private static int eyw = 1;
    private static int hrp = 1;
    private static int hac = 1;


    /**
			 * Creates the item object
				 * @param name, item name
                  * @param type, type of item
                   * @param  quantity, item quantity
                   * @param  price , cost price of item
                   * *@param  sellPrice , selling price
                   * *@param  des , description
				 */
    public Item ( String type, String name, double cp,  double sp , int quan,  String des){
        Categories.put("Cosmetics", "COS");
        Categories.put("Fragrance", "FRG");
        Categories.put("Skin Care", "SKC");
        Categories.put("Bath Products", "BTP");
        Categories.put("Hair Extensions", "HET");
        Categories.put("Eyewear", "EYW");
        Categories.put("Hair Products", "HRP");
        Categories.put("Hair Accessories", "HAC");
        setCode(type);
        itemName = name ;
        category = type;
        description = des;
        sellingPrice = sp;
        costPrice = cp;
        quantity = quan;
        
        
    }

    public Item (){

    }
    /**
    * Displays name for a specific item 
        * @return name of  specific item 
                */
    public String getName (){
        
        String itemName = this.itemName;
        return ( itemName);
    }
   /**
    * Displays cost for a specific item 
        * @return price of  specific item 
    */
    public double getPrice (){
        double cp = this.costPrice;

        return ( cp );
    }

 /**
    * Displays selling price for a specific item 
        * @return selling price  of  specific item 
                */
    public double getSellPrice (){
        double sp = this.sellingPrice;
       

        return ( sp );
    }
/**
    * Displays quantity for a specific item 
        * @return quantity  of  specific item 
                */
    public int getQuantity(){
        int quan = this.quantity;
        
        return ( quan );

    }

   /**
    * Displays description for a specific item 
        * @return description  of  specific item 
                */
    public String getDescription(){
        String des = this.description;

        return  (  des );
    }
/**
    * Updates the  name for a specific item 
        * @param newName name   of  specific item 
                */
    public String editName ( String newName){
        if (newName .equals(this.itemName)){
            return " Item name cannot be the same ";
        }else{
            this.itemName =  newName;
            return " Item name changed succesfully";
        }
             }
/**
    * Updates the  cost price  for a specific item 
        * @param newCP price  of  specific item 
                */
    public void changePrice(double newCP){
        if (this.costPrice == newCP){

        }else{
            this.costPrice =  newCP;
    
        }
    }
/**
    * Updates the  selling  price  for a specific item 
        * @param newSP price  of  specific item 
                */
    public String changeSellPrice(double newSP){
        if (this.sellingPrice == newSP){
            return " Item's price cannot be the same ";

        }else{
            this.sellingPrice =  newSP;
            return " Item's price has been update succesfully ";
        }
    }

 /**
    * Displays the category for a specific item 
        * @return category  of  specific item 
                */
   
    public String getCategory(){
        String tip = this.category;
        return  ( tip);

    }
 /**
    * Manipulates quantity for a specific item 
        * @param newQuan   quantity to be added to the  specific item 
                */
    public void addQuantity(int newQuan){
        if (newQuan   > 0) {
            this.quantity =  newQuan + this.quantity;
            //return "The item's quantity has been updated ";
        } else {
           // return "Please  enter a value greater than 0 ";
        }
    }
/**
    * Manipulates quantity for a specific item 
        * @param newQuan   quantity to be removed from the specific item 
                */
    public String removeQuantity(int decQuan){
        if (decQuan   > 0) {
            this.quantity -=  decQuan;
            return "The item's quantity has been updated ";
        } else {
            return "Please  enter a value greater than 0 ";
        }
    }
/**
    * Updates the  description  for a specific item 
        * @param newDescription description of  specific item 
                */
    public String editDescription (String newDescription){
        if(newDescription.equals(this.description)){
            return "Item description has to be different.";
        }else{
            this.description = newDescription;
            return "Item's description has been succesfully changed.";
        }
        }
    /**  This function generates the Product Code for an item
	 * @return  displays the Product Code to the screen 
    */
    
    
    public void setCode(String word)
    {
    	for (Map.Entry<String, String> entry: Categories.entrySet())
    	{
    		String k = entry.getKey();
    		String val = entry.getValue();
    		
    		if ( k.equals(word))
    		{
    			if(val.equals("COS")) {
    				code = "COS" + String.valueOf(cos);
    				cos ++;
    			}
    			else if(val.equals("FRG")) {
    				code = "FRG" + String.valueOf(frg);
    				frg ++;
    			}
    			else if(val.equals("SKC")) {
    				code = "SKC" + String.valueOf(skc);
    				skc ++;
    			}
    			else if(val.equals("BTP")) {
    				code = "BTP" + String.valueOf(btp);
    				btp ++;
    			}
    			else if(val.equals("HET")) {
    				code = "HET" + String.valueOf(het);
    				het ++;
    			}
    			else if(val.equals("EYW")) {
    				code = "EYW" + String.valueOf(eyw);
    				eyw ++;
    			}
    			else if(val.equals("HRP")) {
    				code = "HRP" + String.valueOf(hrp);
    				hrp ++;
    			}
    			else if(val.equals("HAC")) {
    				code = "HAC" + String.valueOf(hac);
    				hac ++;
    			}
    		}
    	}
    }

    public String appDisplay(){
        
        
       return "Entry No:" + getCode() +  "\n" + " Item Name : "  + getName() + "\n" + "Type: " + getCategory() +  "\n" + "Description: " + getDescription() + "\n" + " Cost Price : $" + (int) getPrice() + ".00" + "\n" + " Selling Price :$ " + (int) getSellPrice() + ".00" +  "\n" + "Quantity :" + (int) getQuantity();
    }

    public String getCode(){
        return this.code;
    }

  public int compareTo (Item other){
      String  myentryno = this.getCode();
       String otherentryno = other.getCode();
              return ( myentryno.compareTo(otherentryno));

}
}
