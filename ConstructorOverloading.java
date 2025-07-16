class Demo {
    Demo() {
        System.out.println("Default Constructor");
    }

    Demo(String name) {
        System.out.println("Name: " + name);
    }

    Demo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        new Demo();
        new Demo("John");
        new Demo("Alice", 25);
    }
}
