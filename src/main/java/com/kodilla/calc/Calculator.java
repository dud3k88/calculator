package com.kodilla.calc;

public class Calculator {

    public double add (double a, double b){
        return a+b;
    }

    public double substract (double a, double b) {
        return a-b;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double addResult = calculator.add(35.5, 44.3);
        double substractResult = calculator.substract(50.2, 44.2);

        System.out.println(addResult);
        System.out.println(substractResult);
    }
}
