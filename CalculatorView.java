package Seminar_5_1;

import java.util.Scanner;

public class CalculatorView {
    Scanner scan = new Scanner(System.in);

    public Double getInputNumber() {
        System.out.print("Enter a number: ");
        return scan.nextDouble();
    }

    //public String getOperator() {
      //  System.out.print("Enter operand & operator (+, -, *, /): ");
        //return scan.nextLine();
    //}

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public char getInputOperator() {
        System.out.print("Enter operand & operator (+, -, *, /): ");
        return scan.next().charAt(0);
    }
}
