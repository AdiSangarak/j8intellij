package in.adi.j8intellij;

import java.util.ArrayList;
import java.util.List;

public class MRForEach {
    public static void main(String args[])
    {
        List names = new ArrayList();

        names.add("Aditya");
        names.add("Sangarak");
        names.add("Krishna");
        names.add("Ram");
        names.add("Hari");

        names.forEach(System.out::println);
    }
}
