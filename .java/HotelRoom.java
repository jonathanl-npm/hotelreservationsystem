package hotelreservationsystem;

/**
 *
 * @author jleonn_
 */
public interface HotelRoom {
    
    public String roomType();
    public double roomPrice();
    public double calculateRoomRates(int days);
    
}
