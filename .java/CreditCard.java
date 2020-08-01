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
public class CreditCard extends PaymentByCard {
    
@Override //Overload
    public void transaction(){
        System.out.println("Your transaction is SUCCESSFUL! You got 5% cashback!");
    }
}
