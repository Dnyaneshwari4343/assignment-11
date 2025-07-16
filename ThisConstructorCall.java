class Test {
    Test() {
        this("Hello from this()");
        System.out.println("Default Constructor");
    }

    Test(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        new Test();
    }
}
