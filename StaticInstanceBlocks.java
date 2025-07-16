public class StaticInstanceBlocks {
    static {
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    StaticInstanceBlocks() {
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        new StaticInstanceBlocks();
    }
}
