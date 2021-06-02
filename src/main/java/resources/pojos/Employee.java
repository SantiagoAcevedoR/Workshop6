package resources.pojos;

/**
 * Creating the Pojo Employee with constructors and Getters and Setters
 */
public class Employee {

    private String name;
    private String role;

    /**
     * Creating default constructor
     */
    public Employee() {
    }

    /**
     * Creating an specific constructor
     * @param name is what we call the employee.name != null , name != " "
     * @param role is the function that has the employee in the society.role != null, role!=" "
     */
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
