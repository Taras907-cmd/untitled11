public class RandomAlg {
    private final long a;
    private final long c;
    private final long m;
    private long x;

    public RandomAlg(long a, long c, long m, long seed) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.x = seed;
    }

    public long next() {
        x = (a * x + c) % m;
        return x;
    }
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = 1L << 48;
        long seed = 12345;

        RandomAlg r = new RandomAlg(a, c, m, seed);

        for (int i = 0; i < 10; i++) {
            System.out.println(r.next());
        }
    }
}
