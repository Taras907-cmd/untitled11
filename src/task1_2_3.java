import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class task1_2_3 {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger(0);
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Peter");
        list.add("Oleh");
        list.add("Anna");

        String res = list.stream()
                .filter(s -> {
                    return i.getAndIncrement() % 2 == 1;
                }).map(s -> (i.get()) + ". " + s)
                .collect(Collectors.joining(", "));
        System.out.println(res);


    }

    public static List<String> toUpperAndSortDesc(List<String> input) {
        return input.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public static String extractAndSort(String[] arr) {
        return Arrays.stream(arr).sorted()
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
