import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static String formatOddIndexNames(List<String> names){
        String res = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
        return res;
    }

    public static void main(String[] args) {
        List<String> list = List.of("Ivan", "Peter", "Oleh", "Anna");
        System.out.println(formatOddIndexNames(list));
    }
}
