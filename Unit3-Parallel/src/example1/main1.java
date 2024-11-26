package example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class main1 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        PredicatImpl predicateJ = new PredicatImpl();
        filter(languages, predicateJ);

    }

    public static void filter(List<String> names, Predicate condition) {
        for(String name: names) {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

}
