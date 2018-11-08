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
public class MeterReading extends Bill {
    String dateRead;
    double reading;
    double galUsed = calcGalUsed();
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
    boolean secDepBool;
    double securityDep;
    double newTapFee;
    int perRate = 1000;
    //finish this when it comes time to display a bill
    
    public MeterReading() {
        
    }
    
    public MeterReading(String date, double reading, boolean nTap, boolean sec, String notes) {
        dateRead = date;
        this.reading = reading;
        newTap = nTap;
        secDepBool = sec;
        remarks = notes;
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
            amountCharged = (galUsed) * 10.90;
        } else if (galUsed > 5000 && galUsed <= 10000) {
            amountCharged = (5000) * 10.90 + (galUsed - 5000) * 10.55;
        } else if (galUsed > 10000 && galUsed <= 20000) {
            amountCharged = (5000) * 10.90 + (10000) * 10.55 + (galUsed - 10000) * 10.00;
        } else if (galUsed > 20000 && galUsed <= 30000) {
            amountCharged = (5000) * 10.90 + (10000) * 10.55 + (20000) * 10.00 + (galUsed - 20000) * 9.45;
        } else {
            amountCharged = (5000) * 10.90 + (10000) * 10.55 + (20000) * 10.00 + (30000) * 9.45 + (galUsed - 30000) * 8.60;
        }
        if (newTap) {
            amountCharged += newTapFee;
        }
        if (secDepBool) {
            amountCharged += securityDep;
        }
    }
    
    public double calcGalUsed() {
        double result;
        if (this.readings.isEmpty()) {
            result = reading;
        } else {
            result = this.reading - readings.get(readings.indexOf(this) - 1).reading;
        }
        return result;
    }
}
