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
    double galUsed;
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
    boolean newTap;
    double securityDep;
    double newTapFee;
    //finish this when it comes time to display a bill
    
    public MeterReading() {
        
    }
    
    public MeterReading(String date, double reading, boolean nTap) {
        dateRead = date;
        this.reading = reading;
        newTap = nTap;
    }
    
    public void setSecurityDep(double secDep) {
        securityDep = secDep;
    }
    
    public void setBillingDate(String bDate) {
        billingDate = bDate;
    }
    
    public void setNewTapFee(double fee) {
        newTapFee = fee;
    }
    
    public void addRemarks(String remark) {
        remarks = remark;
    }
    
    public void calcAmountCharged() {
        if (galUsed <= 5000) {
            //amountCharged = roundToLowestThousand(reading - prevReading) * 10.90;
        } else if (galUsed > 5000 && galUsed <= 10000) {
            //amountCharged = roundToLowestThousand(reading - prevReading) * 10.55;
        } else if (galUsed > 10000 && galUsed <= 20000) {
            //amountCharged = roundToLowestThousand(reading - prevReading) * 10.00;
        } else if (galUsed > 20000 && galUsed <= 30000) {
            //amountCharged = roundToLowestThousand(reading - prevReading) * 9.45;
        } else {
            //amountCharged = roundToLowestThousand(reading - prevReading) * 8.60;
        }
        if (newTap) {
            amountCharged += newTapFee;
        }
    }
}
