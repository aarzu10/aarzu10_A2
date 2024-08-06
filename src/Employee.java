public class Employee extends Person {
    private String employeeId;
    private String position;

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor
    public Employee(String name, int age, String address, String employeeId, String position) {
        super(name, age, address); // Call the constructor of the superclass (Person)
        this.employeeId = employeeId;
        this.position = position;
    }

    // Getter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for position
    public String getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(String position) {
        this.position = position;
    }
}
