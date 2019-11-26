
import java.util.*;

public class Item  implements Comparable <Item>{
    private String itemName;
    private String brand ;
    private String typeOfProduct;
    private String description;
    private double sellingPrice;
    private double costPrice;
    private int quantity;
    private static int counter = 0;
    private int entryNo;

    public Item ( String name, String bd, String type, int quan,  String des,double cp,  double sp){
        itemName = name ;
        brand = bd ;
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

    public int getQuantity(){
        int  quan = this.quantity;
        
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

    public String changePrice(double newCP){
        if (this.costPrice == newCP){
            return " Item's price cannot be the same ";

        }else{
            this.costPrice =  newCP;
            return " Item's price has been update succesfully ";
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

    public void removeQuantity(int decQuan){
        if (decQuan   > 0) {
            this.quantity -=  decQuan;
            
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
    
    public int getEntryNo (){
			entryNo = Item.counter;
	        return entryNo;
        }
        
    // public String appDisplay(){
         //   return " Entry No: "  + getEntryNo() + "\n" +  "Name :" + getName() + "\n" +  "Brand: " + getBrand() + "\n" + "Description: " + getDescription() + "\n" + "Cost Price :" + getPrice() +  "\n" + "Selling Price :" + getSellPrice();
       // }

    public String appDisplay(){
       return  " Item Name : "  + getName() + "\n" +  "Brand:" + getBrand() + "\n" + "Type: " + getProductType() +  "\n" + "Description:" + getDescription() + "\n" + " Cost Price : $ " + getPrice() + ".00" + "\n" + " Selling Price :$ " + getSellPrice() + ".00" +  "\n" + "Quantity :" + getQuantity();
    }

    public int compareTo (Item other){
        Integer  myentryno = this.getEntryNo();
         Integer otherentryno = other.getEntryNo();
                return ( myentryno.compareTo(otherentryno));
        }



}
