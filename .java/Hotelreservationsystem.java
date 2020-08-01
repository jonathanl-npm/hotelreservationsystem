package hotelreservationsystem;

import java.util.Scanner;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Hotelreservationsystem {

    public static void main(String[] args) {
        
        //variables
        
        int a;
        String roomTypeTemp;
        double roomPriceTemp;
        int def = 0;
        int m, p;
        
        
        
        //instances
        LocalDateTime obj = LocalDateTime.now();
        Scanner inputAdmin = new Scanner(System.in);
        Scanner inputReservation = new Scanner(System.in);
        Scanner inputRoomType = new Scanner(System.in);
        Scanner inputDays = new Scanner(System.in);
        Scanner inputID = new Scanner(System.in);
        Scanner inputPayment = new Scanner(System.in);
        Scanner inputMethod = new Scanner(System.in);
        
        Single singleroom = new Single();
        Double doubleroom = new Double();
        Suite suiteroom = new Suite();
        Studio studioroom = new Studio();
        
        PaymentByCard debit = new DebitCard();
        PaymentByCard credit = new CreditCard();
                
        //Date
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String datetime = obj.format(format);
        
        //Array for Summary of Reservations
        
        String[] customerID = new String[10];
        String[] hotelroominfo = new String[10];
        int[] staydurationdays = new int[10];
        double[] hotelroompayment = new double[10];
        
        //Customer Information (Array of Object)
        
        Customer[] hotelcustomer = new Customer[10];
        
        hotelcustomer[0] = new Customer("NE001", "Jonathan Lau",'M', "012-5118233");
        hotelcustomer[1] = new Customer("NE002", "Zarif Zumaidi", 'M', "019-8876532");
        hotelcustomer[2] = new Customer("NE003", "Nur Afiffah Izzati", 'F', "013-2827009");
        hotelcustomer[3] = new Customer("NE004", "Nur Shakinah", 'F', "012-2820999");
        hotelcustomer[4] = new Customer("NE005", "Yasmeen", 'F', "012-0008809");
        hotelcustomer[5] = new Customer("NE006", "Camillia", 'F', "018-1199875");
        hotelcustomer[6] = new Customer("NE007", "Syed Wali", 'M', "014-9990411");
        hotelcustomer[7] = new Customer("NE008", "Andrew Tan", 'M', "012-2333921");
        hotelcustomer[8] = new Customer("NE009", "Derek Leong", 'M', "012-5564111");
        hotelcustomer[9] = new Customer("NE0010", "Divashini", 'F', "012-8872101");
        
        //Primitive Array
        String[] customName = new String[]{"NE001", "NE002", "NE003", "NE004", "NE005", "NE006", "NE007", "NE008"
        , "NE009", "NE010"};
        
        //Administrator Input
        for(;true;){
        System.out.println("");
        System.out.println("NEXUS Hotel Reservation System              "  + datetime);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("1. Reservation");
        System.out.println("2. Customer Database");
        System.out.println("3. Check-out");
        System.out.println("4. Check Hotel Room Rates");        
        System.out.println("");
        
        System.out.println("Choice >> ");
        int inputadmin = inputAdmin.nextInt();
 
            //Choice 1 (Control Statement)
            switch (inputadmin) {
                case 1:
                    System.out.println("        Reservation          ");
                    System.out.println("-----------------------------");
                    System.out.println("1. Add Reservation");
                    System.out.println("2. Summary of Reservations");
                    System.out.println("");
                    System.out.println("Choice >> ");
                    int inputreservation = inputReservation.nextInt();
                    if(inputreservation == 1){
                        
                        System.out.println("Enter your Customer ID >> ");
                        String customerIndex = inputID.nextLine();
                        customerID[def] = customerIndex;
                        System.out.println("Which room do you prefer?(Single, Double, Suite or Studio)");
                        String inputroomtype = inputRoomType.nextLine();
                     
                        System.out.println("How long will your stay be? (days)");
                        int stayTime = inputDays.nextInt();
                        
                        //Types of Hotel Room (Interface)
                        switch (inputroomtype) {
                            case "single":
                                roomTypeTemp = singleroom.roomType();
                                roomPriceTemp = singleroom.calculateRoomRates(stayTime);
                                break;
                            case "double":
                                roomTypeTemp = doubleroom.roomType();
                                roomPriceTemp = doubleroom.calculateRoomRates(stayTime);
                                break;
                            case "suite":
                                roomTypeTemp = suiteroom.roomType();
                                roomPriceTemp = suiteroom.calculateRoomRates(stayTime);
                                break;
                            default:
                                roomTypeTemp = studioroom.roomType();
                                roomPriceTemp = studioroom.calculateRoomRates(stayTime);
                                break;
                        }
                        
                        hotelroominfo[def] = roomTypeTemp;
                        hotelroompayment[def] = roomPriceTemp;
                        staydurationdays[def] = stayTime;
                        System.out.println("");
                        System.out.println("Your " + roomTypeTemp + " has been reserved!");
                        System.out.println("Enjoy your stay Sir/Madam!");
                        System.out.println("");
                        def = def + 1;
                    }
                    
                    else{
                        
                        System.out.println("");
                        System.out.println("<<      Summary of Reservations     >>");
                        System.out.println("--------------------------------------");
                        for (int i = 0 ; i < def ; i++){
                            System.out.println("Customer ID     : " + customerID[i]);
                            System.out.println("Hotel Room      : " + hotelroominfo[i]);
                            System.out.println("Stay Duration   : " + staydurationdays[i] + " day(s)");
                            System.out.println("");
            }

                        
                        
                        
                    }       break;
                case 2:
                    System.out.println("        Customer Database       ");
                    System.out.println("--------------------------------");
                    System.out.println("1. Search for a Customer ");
                    System.out.println("2. Complete Database");
                    System.out.println("");
                    System.out.println("Choice  >>");
                    int databaseInput = inputAdmin.nextInt();
                    if(databaseInput == 1){
                        
                        System.out.println("Enter Customer ID   >>");
                        String customerData = inputID.next();
                        List<String> list = Arrays.asList(customName);
                        
                        if(list.contains(customerData)){
                        m = Arrays.asList(customName).indexOf(customerData);
                        System.out.println("");
                        System.out.println("<<   Customer Details   >>");
                        System.out.println("--------------------------");
                        System.out.println("");
                        //getCustomer..()(Encapsulation) 
                        System.out.println("Customer ID     : " + hotelcustomer[m].getCustomerID());
                        System.out.println("Name            : " + hotelcustomer[m].getCustomerName());
                        System.out.println("Gender          : " + hotelcustomer[m].getCustomerGender());
                        System.out.println("Contact Number  : " + hotelcustomer[m].getCustomerContact());
                        System.out.println("");
                        }
                        else{
                            System.out.println("CUSTOMER NOT FOUND!");
                        }
                    }
                    else {
                    for(a=0; a < hotelcustomer.length ; a++){
                        
                        System.out.println("Customer ID     : " + hotelcustomer[a].getCustomerID());
                        System.out.println("Name            : " + hotelcustomer[a].getCustomerName());
                        System.out.println("Gender          : " + hotelcustomer[a].getCustomerGender());
                        System.out.println("Contact Number  : " + hotelcustomer[a].getCustomerContact());
                        System.out.println("");
                    }
                    }           break;
                case 3:
                        System.out.println("Enter Customer ID   >>");
                        String customerData = inputID.next();
                        
                        p = Arrays.asList(customerID).indexOf(customerData);
                        
                        System.out.println("<<      Payment Information     >>");
                        System.out.println("");
                        Payment payment = new Payment(hotelroompayment[p]);
               
                        System.out.println("The total payment for your stay is RM " + 
                        (payment.chargingFee.accomodationTax(hotelroompayment[p]) + hotelroompayment[p])+
                        " including 5% accommodation tax at RM " + (payment.chargingFee.accomodationTax(hotelroompayment[p])));
                        System.out.println("");
                        System.out.println("Due to COVID-19, cashless transaction is preferred. "+
                                "Credit Card or Debit Card?");
                        String inputCard = inputPayment.next();
                        if(inputCard.toLowerCase().equals("debit")){
                            System.out.println("");
                                debit.transaction();
                        }
                        else{
                                credit.transaction();
                        }
                        
                    break;
                default:
                    System.out.println("");
                    System.out.println("Enter Preferred Hotel Room >>");
                    String preferredRoom = inputRoomType.next();
                    System.out.println("Enter Stay Duration (days) >>");
                    int stayDuration = inputDays.nextInt();
                    
                    //Factory Method
                    HotelRoomRates hotelRoomRate = new HotelRoomRates();
                    HotelRoom room = hotelRoomRate.getRates(preferredRoom);
                    if(room!= null){
                        System.out.println("");
                        System.out.println("Your stay here for " + stayDuration + " days will be RM " + room.calculateRoomRates(stayDuration) + "(excluding accommodation tax)");
                    }       break;
            }
        
        
        
    }
    }
}
    

