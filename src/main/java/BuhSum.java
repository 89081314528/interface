public class BuhSum implements C{// для тестов
    int c;
    int d;

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public BuhSum(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public int summ() {
        return (c + d) / 2;
    }

}
