package Exercise2;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Exercise2_1 {
    public static void main(String[] args) {
        List<String> names = asList("John", "Jack", "Jacob");

        //2.1.1 Print “Hello name” for each element on the list.
        // A: Do it if you want with just forEach()
        names.forEach(x->System.out.println("Hello "+x));
        // B: Use the map() operation and then forEach()
        names.stream()
                .map(x->"Hello "+x)
                .forEach(System.out::println);

        //2.1.2 Return a List that contains the same elements but with “Captain name” for each element.
        // You can do it with collector(....)
        List<String> captainNames = names.stream()
                                            .map(x->"Captain "+x)
                                            .toList();

        captainNames.forEach(System.out::println);

        //2.1.3 Print the name that begin with ‘Ja’
        // filter()
        names.stream()
                .filter(s->s.startsWith("Ja"))
                .forEach(System.out::println);


        List<Integer> numbers = asList(1, 2, 3, 4);
        //2.1.4 List only the even numbers.
        numbers.stream()
                .filter(a -> a%2==0)
                .forEach(System.out::println);
        //2.1.5 Calculate the sum, avg, max, and min for all the numbers in the list.
		//For this exercise a conversion from Integer to int needs to be carried out.
		//In order to do so, use the function mapToInt(x -> x)
        int suma = numbers.stream()
                .mapToInt(a -> a)
                .sum();
        System.out.println("Suma: "+suma);

        OptionalDouble avg = numbers.stream()
                .mapToInt(a -> a)
                .average();
        System.out.println("Avg: "+avg);
    }
}
