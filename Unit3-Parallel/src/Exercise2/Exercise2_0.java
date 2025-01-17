package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2_0 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Gerhard");
        names.add("Philip");
        names.add("John");

        System.out.println("2.1 Given the following list print each of the items");
        // Not necessary to use streams just for this
        names.forEach(x-> System.out.println(x));

        names.stream()
                .filter(a -> a.startsWith("P"))
                .forEach(x-> System.out.println(x));

        names.stream()
                .forEach(System.out::println);

    }
}
