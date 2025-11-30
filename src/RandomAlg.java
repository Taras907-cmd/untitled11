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
}
