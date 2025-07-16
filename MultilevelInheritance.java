class Grandparent {
    void showGrandparent() {
        System.out.println("Grandparent");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();
    }
}
