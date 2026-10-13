import java.util.List;
import java.util.ArrayList;

public class PredefinedInterface {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Ravi");
        names.add("Priya");

        System.out.println("Student Names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}

