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
    String meterType;
    int accountNumber;
    double outstandingBalance;
    
    public void Client() {
        firstName = "";
        lastName = "";
        address = "";
        phoneNumber = "";
        meterType = "";
        accountNumber = 0;
        outstandingBalance = 0.0;
    }
    
    public void enterInfo(String fName, String lName, String add, String phone, String meterT, int accNum, double outBal) {
        firstName = fName;
        lastName = lName;
        address = add;
        phoneNumber = phone;
        meterType = meterT;
        accountNumber = accNum;
        outstandingBalance = outBal;
    }
}
