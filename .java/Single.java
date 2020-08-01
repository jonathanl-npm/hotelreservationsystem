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
public class Single implements HotelRoom {
   
@Override
    public String roomType(){
        return "Single Room";
    }
    
@Override
    public double roomPrice(){
        return 88.00;
    }
@Override
    public double calculateRoomRates(int days){
        return 88.00 * days;
    
}    
}
