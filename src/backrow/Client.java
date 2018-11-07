/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backrow;

/**
 *
 * @author dmich
 */
public class Client {
    String firstName;
    String lastName;
    String address;
    String phoneNumber;
    Meter meterType;
    int accountNumber;
    double outstandingBalance;
    Bill bill;
    int meterNumber;
    
    public void Client() {
        firstName = "";
        lastName = "";
        address = "";
        phoneNumber = "";
        meterType = null;
        meterNumber = 0;
        accountNumber = 0;
        outstandingBalance = 0.0;
        bill = null;
    }
    
    public void enterInfo(String fName, String lName, String add, String phone, Meter meterT, int accNum, double outBal) {
        firstName = fName;
        lastName = lName;
        address = add;
        phoneNumber = phone;
        meterType = meterT;
        accountNumber = accNum;
        outstandingBalance = outBal;
        bill = new Bill();
        meterNumber = 0;//set this when it comes time to display meter numbers.
        
    }
}
