public class Calculator {
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int ans = calculator.add(2, 4);
        System.out.println(ans);
    }
}


