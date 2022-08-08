package in.adi.j8intellij;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FIWrapperClass {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(21, 22, 23, 24, 25, 26, 27, 28, 29);
        System.out.println("Displaying Numbers");
        eval(list, n -> true);
        System.out.println("Print even numbers:");
        eval(list, n -> (n % 2 == 0));
        System.out.println("Print numbers greater than 26:");
        eval(list, n -> n > 26);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {

        for (Integer n : list) {

            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
