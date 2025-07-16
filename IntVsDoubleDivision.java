public class IntVsDoubleDivision {
    public static void main(String[] args) {
        int a = 5, b = 2;
        double resultInt = a / b;
        double resultDouble = (double) a / b;

        System.out.println("Integer Division: " + resultInt);
        System.out.println("Double Division: " + resultDouble);
    }
}
