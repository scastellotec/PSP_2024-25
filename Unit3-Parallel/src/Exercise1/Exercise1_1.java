package Exercise1;

import java.util.function.Predicate;

public class Exercise1_1 {
    public static void main(String[] args) {
        //Case 1: Implementation of interface using lambda given 2 numbers print its multiplication.

        // Old fashion way
        MyFunctionalInterface multiplication = new MyFunctionalInterface() {
            @Override
            public void operate(int a, int b) {
                System.out.println(a*b);
            }
        };
        multiplication.operate(3,6);

        // Using Lambdas
        MyFunctionalInterface multiplicationLambda = (x,v) -> System.out.println(x*v);
        multiplicationLambda.operate(3,5);


        // Implementation of interface using lambda given 2 numbers print its addition
        MyFunctionalInterface addLambda = (x,v) -> System.out.println(x+v);
        addLambda.operate(3,5);

    }
}
