public class MethodOverloading {
    void display() {
        System.out.println("No arguments");
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display();
        obj.display("Alice");
        obj.display("Bob", 30);
    }
}
