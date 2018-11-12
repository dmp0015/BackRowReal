/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backrow;
import java.util.Date;

/**
 *
 * @author dmich
 */
public class Tariff {
    double hardIntegerValue;
    Date beginTime;
    Date endTime;
    
    public Tariff() {
        
    }
    
    public Tariff(int bYear, int bMonth, int bDay, int eYear, int eMonth, int eDay, double value) {
        hardIntegerValue = value;
        beginTime = new Date(bYear, bMonth, bDay);
        endTime = new Date(eYear, eMonth, eDay);
    }
}
