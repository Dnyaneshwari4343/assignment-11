class Parent {
    void parentMethod() {
        System.out.println("This is parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is child method");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();
        c.childMethod();
    }
}
