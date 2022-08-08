package in.adi.j8intellij;

import java.util.Optional;

public class OptionalClassPractise {
    public static void main(String[] args) {
        OptionalClassPractise optionalClassPractise = new OptionalClassPractise();

        Integer a = new Integer(106);
        Integer b = new Integer(56);
        Integer c = null;

        Optional<Integer> no1 = Optional.of(a);
        Optional<Integer> no2 = Optional.of(b);
        Optional<Integer> no3 = Optional.ofNullable(c);
        System.out.println(optionalClassPractise.multiply(no1, no2, no3));


    }

    public Integer multiply(Optional<Integer> no1, Optional<Integer> no2, Optional<Integer> no3){
        System.out.println("Argument 1 present: "+no1.isPresent());
        System.out.println("Argument 2 present: "+no2.isPresent());
        System.out.println("Argument 3 present: "+no3.isPresent());
        Integer n1 = no1.get();
        Integer n2 = no2.get();
        Integer n3 = no3.orElse(new Integer(1));

        return n1*n2*n3;
    }
}
