import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Zipper {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();

        Iterable<T> iterable = () -> new Iterator<T>() {
            boolean takeFromFirst = true;

            @Override
            public boolean hasNext() {
                return it1.hasNext() && it2.hasNext();
            }

            @Override
            public T next() {
                if (takeFromFirst) {
                    takeFromFirst = false;
                    return it1.next();
                } else {
                    takeFromFirst = true;
                    return it2.next();
                }
            }
        };

        return StreamSupport.stream(iterable.spliterator(), false);
    }
    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("A", "B", "C");
        Stream<String> s2 = Stream.of("1", "2", "3", "4");

        Stream<String> zipped = Zipper.zip(s1, s2);

        zipped.forEach(System.out::println);
    }
}
