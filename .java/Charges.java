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
public class Charges {

    double roomPrice;
    
    public Charges(double roomPrice){
       this.roomPrice = roomPrice;
    }
    
    public double accomodationTax(double roomPrice){
        return roomPrice*0.05;
    }
}
