import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("Alex");

        System.out.println("Student list: " + students);

        students.remove("John");
        System.out.println("Updated list: " + students);
    }
}