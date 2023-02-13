/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bryan.invoice;

/**
 *
 * @author EL GUARDIAN
 */
public class Invoice {

    private String partNum;
    private String partDesc;
    private int quantity;
    private double itemPrice;
    
     
        public Invoice(String partNum, String partDesc, int quantity, double itemPrice) {
        this.partNum = partNum;
        this.partDesc = partDesc;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        }

     public void setPartNum(String partNum) {
        this.partNum = partNum;
    }    
        
    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }
    
        public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
         
        public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
        
        

        
        
    public String getPartNum() {
        return partNum;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }


        
         public double getInvoiceAmount() {
        int effectiveQuantity = (quantity > 0) ? quantity : 0;
        double effectivePricePerItem = (itemPrice > 0.0) ? itemPrice : 0.0;
        return effectiveQuantity * effectivePricePerItem;
    }
        
        
    
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
