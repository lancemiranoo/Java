public class Main {
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int result = obj.sum(10,5);
        System.out.println("Sum: " + result);
    }
}