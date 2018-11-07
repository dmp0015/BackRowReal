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
public class MeterReading {
    String dateRead;
    double reading;
    double amountCharged;
    double balanceForward;
    double penaltyDisc;
    double totalBill;
    double amountCollected;
    String datePaid;
    double balanceDue;
    double credit;
    String remarks;
    String billingDate;
    //finish this when it comes time to display a bill
    
    public MeterReading() {
        
    }
    
    public MeterReading(String date, double reading) {
        dateRead = date;
        this.reading = reading;
    }
}
