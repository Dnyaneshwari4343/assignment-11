class Helper {
    static void sayHello() {
        System.out.println("Hello from Helper class!");
    }
}

public class StaticMethodFromAnotherClass {
    public static void main(String[] args) {
        Helper.sayHello();
    }
}
