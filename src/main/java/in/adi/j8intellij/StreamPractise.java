package in.adi.j8intellij;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamPractise {
    public static void main(String args[]){
        List<String> strings = Arrays.asList("Aditya","Is","","A","Developer");
        System.out.println("List: "+strings);

        long count = strings.stream().filter(str -> str.isEmpty()).count();
        System.out.println("Blank strings: "+count);

        count = strings.stream().filter(str -> str.length() == 6).count();
        System.out.println("Strings of length 6: "+count);

        List<String> filtered = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println("NonEmpty Filtered list: "+filtered);

        String mergedString = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining());
        System.out.println("Merged string "+mergedString);

        List<Integer> numbers = Arrays.asList(9,3,66,3,85,4);
        System.out.println("no: "+numbers);
        List<Integer> squareList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println("sq_nos: "+squareList);

        List<Integer> integers = Arrays.asList(5,290,4563,567,890);
        System.out.println("integers list: "+integers);
        IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Max: "+stats.getMax());
        System.out.println("Min: "+stats.getMin());
        System.out.println("sum: "+stats.getSum());
        System.out.println("Avg: "+stats.getAverage());

        System.out.println("Random numbers: ");
        Random random = new Random();
        random.ints().limit(3).sorted().forEach(System.out::println);

        count = strings.parallelStream().filter(str -> str.isEmpty()).count();
        System.out.println("empty strings: "+count);
    }
}
