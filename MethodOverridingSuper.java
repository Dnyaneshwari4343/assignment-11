class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void greet() {
        super.greet();
        System.out.println("Hello from Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
