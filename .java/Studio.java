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
public class Studio implements HotelRoom{
    
@Override
    public String roomType(){
        return "Studio";
    }
    
@Override
    public double roomPrice(){
        return 128.00;
    }
@Override
    public double calculateRoomRates(int days){
        return 128.00 * days;
    
}    
}
