public class calcdto implements calc {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        calcdto calculator = new calcdto();
        int ans = calculator.add(2, 4);
        System.out.println(ans);
    }
}