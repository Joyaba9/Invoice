/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.invoice;

import java.util.logging.Logger;

/**
 *
 * @author EL GUARDIAN
 */
public class Invoicetest{
    
    
    public static void main(String[] args){
        
      Invoice invoice1 = new Invoice("T1234", "Screwdriver", 3, 5.75);
        Invoice invoice2 = new Invoice("T5678", "Hammer", 2, 10.0);
        Invoice invoice3 = new Invoice("T9012", "Nails", 6, -12.5);
        
       System.out.println("Invoice 1");
        System.out.println("Part Number: " + invoice1.getPartNum());
        System.out.println("Part Description: " + invoice1.getPartDesc());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per item: " + invoice1.getItemPrice());
        System.out.println("Invoice Amount: " + invoice1.getInvoiceAmount());
        System.out.println();

        System.out.println("Invoice 2");
        System.out.println("Part Number: " + invoice2.getPartNum());
        System.out.println("Part Description: " + invoice2.getPartDesc());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per item: " + invoice2.getItemPrice());
        System.out.println("Invoice Amount: " + invoice2.getInvoiceAmount());
        System.out.println();

        System.out.println("Invoice 3");
        System.out.println("Part Number: " + invoice3.getPartNum());
        System.out.println("Part Description: " + invoice3.getPartDesc());
        System.out.println("Quantity: " + invoice3.getQuantity());
        System.out.println("Price per item: " + invoice3.getItemPrice());
        System.out.println("Invoice Amount: " + invoice3.getInvoiceAmount());
        System.out.println();
  
}
}