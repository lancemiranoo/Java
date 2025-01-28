import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Number list: " + numbers);

        numbers.set(2, 35);
        numbers.remove(1);
        System.out.println("Updated list: " + numbers);

        boolean exist = numbers.contains(40);
        System.out.println(exist);

        int size = numbers.size();
        System.out.println(size);
    }
}