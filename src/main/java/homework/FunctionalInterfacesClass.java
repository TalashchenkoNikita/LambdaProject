package homework;

import java.util.function.*;
import java.util.stream.IntStream;

public class FunctionalInterfacesClass {
    Predicate<Integer> simpleNumber = x -> IntStream.rangeClosed(2, x / 2).noneMatch(i -> x % i == 0);
    Consumer<Integer> randomInt = x -> System.out.println((int) (Math.random() * x));
    Supplier<String> getDayOfWeek = DaysOfWeek::getDay;
    Function<Double, Long> doubleToLong = Math::round;
    UnaryOperator<Integer> findFibonacciNumber = x -> {
        int n0 = 1;
        int n1 = 1;
        int n2 = 1;
        if (x == 1 || x == 2) {
            return 1;
        } else {
            for (int i = 3; i <= x; i++) {
                n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
            }
            return n2;
        }
    };
}
