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
public class MeterF extends Meter {
    String size;
    double minPrice;
    String type;

    public MeterF() {
        this.type = "A";
        this.minPrice = 10.00;
        this.size = "1/2 inch";
    }
}
