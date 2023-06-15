package Seminar_5_1;
public class CalculatorModel {
    private double result;

    public void add(double number) {
        result += number;
    }

        public void subs(double number) {
        result -= number;
    }

        public void mult(double number) {
        result *= number;
    }

        public void devision(double number) {
            CalculatorView localNumber = new CalculatorView();
            while (number == 0) {
                System.out.println("Cannot divide by zero");
                number = localNumber.getInputNumber();
            }
            result /= number;
    }

        public double getResult() {
            return result;
        }

        public void setResult(double result) {
            this.result = result;
        }
}
