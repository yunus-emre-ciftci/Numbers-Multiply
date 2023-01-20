public class NumbersMultiply {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;



    public NumbersMultiply(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }


    public NumbersMultiply(int a, int b, int c, int d) {

        this(a, b, c, d, 1);
    }

    public NumbersMultiply(int a, int b, int c) {

        this(a, b, c, 1);
    }

    public NumbersMultiply(int a, int b) {

        this(a, b, 1);
    }

    public NumbersMultiply(int a) {

        this(a, 1);
    }

    public int calculate() {
        return a * b * c * d * e;
    }


}