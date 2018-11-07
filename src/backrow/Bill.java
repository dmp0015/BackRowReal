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
public class Bill {
    ArrayList<MeterReading> readings;
    double yearlyGal;
    double yearlyCharge;
    double yearlyBF;
    double yearlyPD;
    double yearlyTotal;
    double yearlyCollected;
    double avgYearGal;
    double avgYearCharge;
    double avgYearBF;
    double avgYearPD;
    double avgYearTotal;
    double avgYearCollected;
    
    public void addReading(MeterReading reading) {
        readings.add(reading);
    }
    
    public void print() {
        //Create a printable image of the bill (i.e. jpeg, png, etc.) then display the printable bill and give them the option to edit or print bill.
        
    }
    
    public double getPrevReading() {
        double prevRead;
        int lastIndex = readings.size() - 1;
        if (readings.isEmpty()) {
            prevRead = 0.0;
        } else {
            prevRead = readings.get(lastIndex - 1).reading;
        }
        return prevRead;
    }
}
