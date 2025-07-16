public class NonStaticMethodCall {
    void greet() {
        System.out.println("Hello from non-static method!");
    }

    public static void main(String[] args) {
        NonStaticMethodCall obj = new NonStaticMethodCall();
        obj.greet();
    }
}
