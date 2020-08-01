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
public class Suite implements HotelRoom{
    
@Override
    public String roomType(){
        return "Suite";
    }
    
@Override
    public double roomPrice(){
        return 108.00;
    }

@Override
    public double calculateRoomRates(int days){
        return 108.00 * days;
    
}
}
