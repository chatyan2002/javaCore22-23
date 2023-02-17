package homeworks.homework12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        employeeCase();

    }
    private static void employeeCase() throws ParseException {
        boolean isRun = true;
        while (isRun) {
            printCommand();

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByEmployeeCompanyName(companyName);
                    break;
                case "5":
                    searchEmployeeBySalaryRang();
                    break;
                case "6":
                    changeEmployeePositionById();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inActiveEmployee();
                    break;
                case "9":
                    activateEmployee();
                    break;
                default:
                    System.out.println("Wrong command, Please try again");

            }
        }
    }

    private static void printCommand() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print employees");
        System.out.println("Please input 3 for search employee by id");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for search employee by salary rang");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactivate employee by id");
        System.out.println("Please input 9 for activate employee by id");

    }


    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("wrong employee id please try again!");
        } else {
            employee.setActive(true);
            System.out.println("status changed");
        }


    }

    private static void inActiveEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("wrong employee id please try again!");
        } else {
            employee.setActive(false);
            System.out.println("status changed");
        }


    }

    private static void changeEmployeePositionById() {
        employeeStorage.print();
        System.out.println("please choose employeeId");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("wrong employee Id please try again ");
        } else {
            System.out.println("please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("position changed!");
        }
    }

    private static void searchEmployeeBySalaryRang() {
        System.out.println("please input minPrice,maxPrice");
        String salaryRangStr = scanner.nextLine();
        String[] salaryRang = salaryRangStr.split(",");
        double minPrice = Double.parseDouble(salaryRang[0]);
        double maxPrice = Double.parseDouble(salaryRang[1]);
        if (maxPrice < minPrice) {
            System.out.println("minPrice should be less then maxPrice");
            return;
        }
        employeeStorage.searchBySalaryRange(minPrice, maxPrice);
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + "id does not exists");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() throws ParseException {
        System.out.println("Please input name,surname,employeeId,salary,companyName,position,dateOfBirthday ");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeID = employeeData[2];
        String employeeDatum = employeeData[6];
        Date parse = sdf.parse(employeeDatum);
        Employee employeeById = employeeStorage.getEmployeeById(employeeID);
        if (employeeById == null) {
            Date date = new Date();
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeID,
                    Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5], date, parse);
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeById + " id already exists");
        }
    }
}
