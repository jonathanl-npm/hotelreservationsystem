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
public class Payment {
    
    Charges chargingFee; //Aggregration
     
    public Payment(double rprice){
        
        this.chargingFee = new Charges(rprice);
        
    }
}

