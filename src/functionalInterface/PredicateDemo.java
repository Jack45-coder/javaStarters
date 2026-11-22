package src.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    static void main() {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        BiPredicate<Integer, Integer> bp = (x, y) -> x > y;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        System.out.println(bp.test(4, 5));
        System.out.println(bp.test(9, 5));
    }
}
