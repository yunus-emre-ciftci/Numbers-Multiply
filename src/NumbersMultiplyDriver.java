public class NumbersMultiplyDriver {
    public static void main(String[] args) {
        NumbersMultiply multiplyInstance1 = new NumbersMultiply(2);
        NumbersMultiply multiplyInstance2 = new NumbersMultiply(2, 3);
        NumbersMultiply multiplyInstance3 = new NumbersMultiply(2, 3, 4);
        NumbersMultiply multiplyInstance4 = new NumbersMultiply(2, 3, 4, 5);
        NumbersMultiply multiplyInstance5 = new NumbersMultiply(2, 3, 4, 5, 6);
        long calculate = multiplyInstance1.calculate();
        long calculate1 = multiplyInstance2.calculate();
        long calculate2 = multiplyInstance3.calculate();
        long calculate3 = multiplyInstance4.calculate();
        long calculate4 = multiplyInstance5.calculate();

        System.out.println(calculate);
        System.out.println(calculate1);
        System.out.println(calculate2);
        System.out.println(calculate3);
        System.out.println(calculate4);

    }
}