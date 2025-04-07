class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sumInt = calculator.add(5, 10);  
        double sumDouble = calculator.add(5.5, 10.5);  
        int sumThreeInts = calculator.add(5, 10, 15); 

        System.out.println("Sum of two integers: " + sumInt);
        System.out.println("Sum of two doubles: " + sumDouble);
        System.out.println("Sum of three integers: " + sumThreeInts);
    }
}
