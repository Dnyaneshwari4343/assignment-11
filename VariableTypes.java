public class VariableTypes {
    int instanceVar = 10;
    static int staticVar = 20;

    void display() {
        int localVar = 5;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.display();
    }
}
