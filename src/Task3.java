import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String extractAndSort(String[] arr) {
        return Arrays.stream(arr).sorted()
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] ints = {"1, 2, 0", "4, 5"};
        System.out.println(extractAndSort(ints));
    }
}
