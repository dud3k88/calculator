package com.kodilla.calc;

public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add (){
        return a+b;
    }

    public double substract () {
        return a-b;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator(45.3, 22.5);

        double addResult = calculator.add();
        double substractResult = calculator.substract();

        System.out.println(addResult);
        System.out.println(substractResult);
    }
}
