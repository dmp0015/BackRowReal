/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backrow;

import java.util.ArrayList;

/**
 *
 * @author dmich
 */
public class Client {
    String firstName;
    String lastName;
    String address;
    String phoneNumber;
    Meter meter;
    int accountNumber;
    double outstandingBalance;
    Bill bill;
    int meterNumber;
    
    public void Client() {
        firstName = "";
        lastName = "";
        address = "";
        phoneNumber = "";
        meter = null;
        meterNumber = 0;
        accountNumber = 0;
        outstandingBalance = 0.0;
        bill = null;
    }
    
    public void enterInfo(String fName, String lName, String add, String phone, Meter meter, int accNum, double outBal) {
        firstName = fName;
        lastName = lName;
        address = add;
        phoneNumber = phone;
        this.meter = meter;
        accountNumber = accNum;
        outstandingBalance = outBal;
        bill = new Bill();
        meterNumber = 0;//set this when it comes time to display meter numbers.
        
    }
}
