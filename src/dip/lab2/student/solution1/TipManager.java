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
public class TipManager {
    TipCalculatorStrategy tipStrategy;

    public TipManager(TipCalculatorStrategy tip) {
        this.tipStrategy = tip;
    }

    public TipManager() {
    }

   

    public TipCalculatorStrategy getTipStrategy() {
        return tipStrategy;
    }

    public void setTipStrategy(TipCalculatorStrategy tip) {
        this.tipStrategy = tip;
    }
    
    
    
    public void calculateTip(){
        System.out.println("The Tip is $" + tipStrategy.calculateTip());
    }
}
