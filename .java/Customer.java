/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservationsystem;

/**
 *
 * @author jleonn_
 */
public class Customer {
    
    public String customerID;
    public String customerName;
    public char customerGender;
    public String customerContact;
    
    public Customer(String customerID, String customerName, char customerGender, String customerContact){
        
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerContact = customerContact;
        
    }
    
    public String getCustomerID(){
        return customerID;
    }
    
    public String getCustomerName(){
        return customerName;
    }

    public char getCustomerGender(){
        return customerGender;
    }

    public String getCustomerContact(){
        return customerContact;
    }    
}
