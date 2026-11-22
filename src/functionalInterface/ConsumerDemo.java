package src.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    static void main() {
        Consumer<Integer> output = System.out::println;

        BiConsumer<Integer, Integer> mul = (x, y) -> System.out.println(x * y);

        mul.accept(3, 4);
    }
}
