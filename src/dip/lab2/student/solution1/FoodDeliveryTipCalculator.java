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
public class FoodDeliveryTipCalculator implements TipCalculatorStrategy {

    private double tipIfNotOnTime = 5.0;
    private double tipIfOnTime = 10.0;
    private double expectedTimeToGetFood = 30;
    private double timeToGetFood;
/**
 * This is a constructor that one would use if they wish to use the default 
 * expected time.
 * @param timeToGetFood this is the time it took to get the food.
 */
    public FoodDeliveryTipCalculator(double timeToGetFood) {
        setTimeToGetFood(timeToGetFood);
    }
/**
 * This is a constructor that one would use if the expected time to get the food.
 * would be different than the default.
 * @param timeToGetFood this is the time it took to get the food.
 * @param expectedTimeToGetFood this is the time that is expected to get the food.
 */
    public FoodDeliveryTipCalculator(double timeToGetFood, double expectedTimeToGetFood) {
        setTimeToGetFood(timeToGetFood);
        setExpectedTimeToGetFood(expectedTimeToGetFood);
        
    }

    public double getTimeToGetFood() {
        return timeToGetFood;
    }

    public void setTimeToGetFood(double timeToGetFood) {
        if (timeToGetFood <= 0) {
            throw new IllegalArgumentException("Time to get food must be greater than 0.");
        }
        this.timeToGetFood = timeToGetFood;
    }

    public double getTipIfNotOnTime() {
        return tipIfNotOnTime;
    }

    public void setTipIfNotOnTime(double tipIfNotOnTime) {
        if (tipIfNotOnTime < 0 || tipIfNotOnTime > tipIfOnTime) {
            throw new IllegalArgumentException("Tip if not on time must be atleast 0, and less than tip if on time.");
        }
        this.tipIfNotOnTime = tipIfNotOnTime;
    }

    public double getTipIfOnTime() {

        return tipIfOnTime;
    }

    public void setTipIfOnTime(double tipIfOnTime) {
        if (tipIfOnTime < tipIfNotOnTime) {
            throw new IllegalArgumentException("Tip must be less than tip if not on time. ");
        }
        this.tipIfOnTime = tipIfOnTime;
    }

    public double getExpectedTimeToGetFood() {
        return expectedTimeToGetFood;
    }

    public void setExpectedTimeToGetFood(double expectedTime) {
        if (expectedTime < 0) {
            throw new IllegalArgumentException("Expected time must be greater than 0");
        }
        this.expectedTimeToGetFood = expectedTime;
    }

    @Override
    public double calculateTip() {
        if (timeToGetFood < expectedTimeToGetFood) {
            return tipIfOnTime;
        } else {
           
            return tipIfNotOnTime;
        }
    }

}
