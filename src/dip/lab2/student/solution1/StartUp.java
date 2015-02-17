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
public class StartUp {

    public static void main(String[] args) {
        TipCalculatorStrategy tip1 = new RestaurantTipCalculator(50);
        TipCalculatorStrategy tip2 = new FoodDeliveryTipCalculator(29, 45);
        TipCalculatorStrategy tip3 = new RestaurantTipCalculator(100 , .20);
        
        TipManager tipManager1 = new TipManager(tip1);
        TipManager tipManager2 = new TipManager();
        TipManager tipManager3 = new TipManager(tip3);
        tipManager2.setTipStrategy(tip2);
        
        
        tipManager1.calculateTip();
        tipManager2.calculateTip();
        tipManager3.calculateTip();
        
        
        
        
    }

}
