package Exercise1;

import java.util.function.Predicate;

public class Exercise1_3 {
    public static void main(String[] args) {
        //Create a Predicate that tests whether a parameter is an even number or an odd number
        // and returns true or false. Test it with an odd and an even number.


        Predicate<Integer> isEven = n -> n%2==0;
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(5));

    }

    // just to talk about the answer, not neccessary
    public static boolean isEven2(Integer i){
        if(i%2 == 0)
            return true;
        return false;

        // return i%2==0;
    }
}
