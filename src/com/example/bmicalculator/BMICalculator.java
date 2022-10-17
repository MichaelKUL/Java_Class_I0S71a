package com.example.bmicalculator;

//define class BMICalculator
public class BMICalculator {

    //declare variables
    double weight, height, bmi;

    //method BMICalculator
    public BMICalculator(double w, double h){
        weight = w;
        height = h;
    }

    //method calculate
    public double calculate() {
        return weight / (height * height);
    }

    //method getBMI
    public double getBMI(){
        return bmi;
    }

    //default invoked method main
    public static void main(String[] args) {
        BMICalculator calculator = new BMICalculator(60, 2);
        calculator.bmi = calculator.calculate();

        System.out.println("Your BMI is " + calculator.getBMI() + ".");
    }
}
