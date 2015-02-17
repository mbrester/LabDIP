/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author mbrester1
 */
public class RestaurantTipCalculator implements TipCalculatorStrategy {
    private double tipPercent = .15;
    private double billAmount;
/**
 * This is a constructor that one would use if they want to use the default 
 * percent for tips.
 * @param billAmount this would be the total for the bill.
 */
    public RestaurantTipCalculator(double billAmount) {
        setBillAmount(billAmount);
    }
/**
 * this is a constructor that one would use if they wish to change the tip 
 * percent.
 * 
 * @param billAmount this would be the total for the bill.
 * @param tipPercent this would be the desired tip percent.
 */
    public RestaurantTipCalculator(double billAmount, double tipPercent) {
        setBillAmount(billAmount);
        setTipPercent(tipPercent);
    }
    
    
    
    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        if(tipPercent < 0 || tipPercent > 1){
            throw new IllegalArgumentException("Tip percent must be between 0 and 1");
        }
        this.tipPercent = tipPercent;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        if(billAmount < 0){
            throw new IllegalArgumentException("Bill amount must be greater than 0");
        }
        this.billAmount = billAmount;
    }
    
    @Override
    public double calculateTip(){
        return billAmount * tipPercent;
    }
}
