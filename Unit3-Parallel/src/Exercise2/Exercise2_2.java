package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2_2 {
    public static void main(String[] args) {
        // List of people we will be working with
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("John", 50));
        people.add(new Person("May", 12));
        people.add(new Person("Tiff", 23));
        people.add(new Person("Azul", 15));
        people.add(new Person("Samantha", 67));

        //2.2.1 Convert names to uppercase and print them on the screen
        System.out.println("2.2.1 Modo 1");
        people.stream()
                .map(x->x.getName().toUpperCase())
                .forEach(a-> System.out.println(a));

        System.out.println("2.2.1 Modo 2");
        people.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //2.2.2 Obtain people's names with length less than 4
        System.out.println("2.2.2");
        people.stream()
                .map(p->p.getName())
                .filter(n->n.length()<4)
                .forEach(System.out::println);

        //2.2.3 Obtain the age of the oldest person
        System.out.println("2.2.3");
        people.stream()
                .map(p->p.getAge())
                .max(Integer::compareTo)
                .ifPresent(System.out::println);

        people.stream()
                .mapToInt(p->p.getAge())
                .max()
                .ifPresent(System.out::println);

        //2.2.4 Create a people summary (average age, min age, max age, amount of people)
        System.out.println("2.2.4");

        System.out.println("average");
        people.stream()
                .mapToInt(p->p.getAge())
                .average()
                .ifPresent(System.out::println);

        System.out.println("min");
        people.stream()
                .mapToInt(p->p.getAge())
                .min()
                .ifPresent(System.out::println);

        System.out.println("max");
        people.stream()
                .mapToInt(p->p.getAge())
                .max()
                .ifPresent(System.out::println);

        System.out.println("count");
        long countTotal = people.stream()
                .mapToInt(p->p.getAge())
                .count();
        System.out.println(countTotal);

        System.out.println("sum");
        long sumTotal = people.stream()
                .mapToInt(p->p.getAge())
                .sum();
        System.out.println(sumTotal);



    }
}
