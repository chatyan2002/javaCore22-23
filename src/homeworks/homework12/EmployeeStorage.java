package homeworks.homework12;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;


    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void extend() {
        Employee[] result = new Employee[employees.length + 10];
        // System.arraycopy(employees, 0, result,0,size);
        for (int i = 0; i < size; i++) {
            result[i] = employees[i];
        }
        employees = result;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }

    public void printByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == isActive){
                System.out.println(employees[i]);
            }
        }

    }


    public Employee getEmployeeById(String employeeID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getEmployeeId().contains(employeeID)) {
                return employee;
            }
        }
        return null;
    }

    public void searchEmployeeByCompany(Company company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().equals(company)) {
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("employee width " + company + " dos not exists");
        }
    }


    public void searchBySalaryRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minPrice && employee.getSalary() <= maxPrice) {
                System.out.println(employee);
            }
        }
    }
}
