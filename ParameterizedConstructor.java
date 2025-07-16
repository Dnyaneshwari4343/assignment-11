class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Alice", 55000);
        e.display();
    }
}
