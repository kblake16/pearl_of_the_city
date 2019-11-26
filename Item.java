package pearl_of_the_city;
import java.util.*;

public class Item  {
    private String itemName;
    private String brand ;
    private String typeOfProduct;
    private String description;
    private double sellingPrice;
    private double costPrice;
    private int quantity;
    private static int counter = 0;
    private String entryNo;
    Map<String, String> Categories = new HashMap<String, String>();

    public Item ( String type, String name, double cp,  double sp , int quan,  String des){
        Categories.put("Cosmetics", "COS");
        Categories.put("Fragrance", "FRG");
        Categories.put("Skin Care", "SKC");
        Categories.put("Bath Products", "BTP");
        Categories.put("Hair Extensions", "HET");
        Categories.put("Eyewear", "EYW");
        Categories.put("Hair Products", "HRP");
        Categories.put("Hair Accessories", "HAC");
        itemName = name ;
        typeOfProduct = type;
        description = des;
        sellingPrice = sp;
        costPrice = cp;
        quantity = quan;
    }
    public String getName (){
        
        String itemName = this.itemName;
        return ( itemName);
    }

    

    public String getBrand (){
        String brandName = this.brand;
           return (  brandName);
    }

    public double getPrice (){
        double cp = this.costPrice;

        return ( cp );
    }


    public double getSellPrice (){
        double sp = this.sellingPrice;
       

        return ( sp );
    }

    public double getQuantity(){
        double quan = this.quantity;
        
        return ( quan );

    }

   
    public String getDescription(){
        String des = this.description;

        return  (  des );
    }

    public String editName ( String newName){
        if (newName .equals(this.itemName)){
            return " Item name cannot be the same ";
        }else{
            this.itemName =  newName;
            return " Item name changed succesfully";
        }
             }

    public void changePrice(double newCP){
        if (this.costPrice == newCP){

        }else{
            this.costPrice =  newCP;
    
        }
    }

    public String changeSellPrice(double newCP){
        if (this.costPrice == newCP){
            return " Item's price cannot be the same ";

        }else{
            this.costPrice =  newCP;
            return " Item's price has been update succesfully ";
        }
    }


    public String updateBrand (String newBrand ){
        if (newBrand.equals(this.brand)){
            return " Item's brand cannot be the same ";
        }else{
            this.brand = newBrand;
            return " Item brand changed succesfully ";
        }
       
    }
    public String getProductType(){
        String tip = this.typeOfProduct;
        return  ( tip);

    }

    public String addQuantity(int newQuan){
        if (newQuan   > 0) {
            this.quantity +=  newQuan;
            return "The item's quantity has been updated ";
        } else {
            return "Please  enter a value greater than 0 ";
        }
    }

    public String removeQuantity(int decQuan){
        if (decQuan   > 0) {
            this.quantity -=  decQuan;
            return "The item's quantity has been updated ";
        } else {
            return "Please  enter a value greater than 0 ";
        }
    }

    public String editDescription (String newDescription){
        if(newDescription.equals(this.description)){
            return "Item description has to be different.";
        }else{
            this.description = newDescription;
            return "Item's description has been succesfully changed.";
        }
        }
    /**  This function uses the counter stated as static
	 * @return  displays the Entry Number to the screen 
    */
    
    public String getEntryNo (){
        for (String key : Categories.keySet()) {
            if ( key == getProductType()) {
                entryNo = Categories.get(key) + Item.counter + 1;
            }
        }

			
	        return this.entryNo;
        }
        
    // public String appDisplay(){
         //   return " Entry No: "  + getEntryNo() + "\n" +  "Name :" + getName() + "\n" +  "Brand: " + getBrand() + "\n" + "Description: " + getDescription() + "\n" + "Cost Price :" + getPrice() +  "\n" + "Selling Price :" + getSellPrice();
       // }

    public String appDisplay(){
        
        
       return "Entry No:" + getEntryNo() +  "\n" + " Item Name : "  + getName() + "\n" + "Type: " + getProductType() +  "\n" + "Description: " + getDescription() + "\n" + " Cost Price : $" + (int) getPrice() + ".00" + "\n" + " Selling Price :$ " + (int) getSellPrice() + ".00" +  "\n" + "Quantity :" + (int) getQuantity();
    }

//  public int compareTo (Item other){
  //     Integer  myentryno = this.getEntryNo();
   //     Integer otherentryno = other.getEntryNo();
          //     return ( myentryno.compareTo(otherentryno));
 // }



}
