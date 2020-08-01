package hotelreservationsystem;

/**
 *
 * @author jleonn_
 */

//Factory Method (Design Pattern)
public class HotelRoomRates {
    
    public HotelRoom getRates(String hotelRoomType){
        
        HotelRoom room = null;
        
        if(hotelRoomType.toLowerCase().equals("single")){
            room = new Single();
        }
        else if(hotelRoomType.toLowerCase().equals("double")){
            room = new Double();
        }        
        else if(hotelRoomType.toLowerCase().equals("suite")){
            room = new Suite();
        }
        else if(hotelRoomType.toLowerCase().equals("studio")){
            room = new Studio();
        }
        else {
            System.out.println("Invalid Input!");
        } 
        return room;
    }
}
