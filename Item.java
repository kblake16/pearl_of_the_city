package test;
import java.util.*;

public class Item {
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
        
        return  this.itemName;
    }

    

    public String getBrand (){
        return  this.brand;
    }

    public double getPrice (){
        return  this.costPrice;
    }


    public double getSellPrice (){
        return  this.sellingPrice;
    }

    public int getQuantity(){
        return this.quantity;
    }
    public String getDescription(){
        return this.description;
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
        return  this.typeOfProduct;

    }

    public double getCostPrice (){
        return  this.costPrice;
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
    
    public int getEntryNo (){
			entryNo = Item.counter;
	        return entryNo;
	    }

    public String toString(){
       return  " Item Name : "  + getName() + "\n" +  "Brand:" + getBrand() + "\n" + "Description:" + getDescription() + "\n" + " Cost Price : $ " + getCostPrice() + "\n" + " Selling Price : $ " + getSellPrice() + "Quantity :" + getQuantity();
    }



}