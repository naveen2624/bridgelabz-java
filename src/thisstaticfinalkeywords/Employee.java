package thisstaticfinalkeywords;

class Employee {

    static String companyName = "Tech Corp";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Naveen", "Developer");
        e1.displayDetails(e1);
        Employee.displayTotalEmployees();
    }
}
