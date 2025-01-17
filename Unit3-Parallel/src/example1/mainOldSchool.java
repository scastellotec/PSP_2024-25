package example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class mainOldSchool {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        StarswithConditionIMPL condition1 = new StarswithConditionIMPL();
        filter(languages, condition1);

        System.out.println("Languages which ends with a ");
        filterStringsEndsWith(languages, "a");

        System.out.println("Print language whose length greater than 4:");
        for (String a: languages){
            if(a.length() > 4)
                System.out.println(a);
        }

    }

    public static void filter(List<String> list, InterfaceCondition condition) {
        for (String a: list){
            if(condition.evaluate(a, "J"))
                System.out.println(a);
        }
    }

    public static void filterStringsStartWith(List<String> list, String letter) {
        for (String a: list){
            if(a.startsWith(letter))
                System.out.println(a);
        }
    }

    public static void filterStringsEndsWith(List<String> list, String letter) {
        for (String a: list){
            if(a.endsWith(letter))
                System.out.println(a);
        }
    }

}
