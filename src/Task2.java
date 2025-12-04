import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static List<String> toUpperAndSortDesc(List<String> input) {
        return input.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public static void main(String[] args) {
        List<String> list = List.of("Ivan", "Peter", "Oleh", "Anna");
        System.out.println(toUpperAndSortDesc(list));
    }
}
