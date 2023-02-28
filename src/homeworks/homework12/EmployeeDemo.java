package homeworks.homework12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        Company company = new Company("company001", "company example", "Gyumri", "1234567");
        company.setEmployeeCount(3);
        companyStorage.add(company);
        employeeStorage.add(new Employee("poxos", "poxosyan", "a111", 1000, company, "director", new Date(), DateUtil.stringToDate("04/02/1999")));
        employeeStorage.add(new Employee("petros", "petrosyan", "a112", 1050, company, "senior", new Date(), DateUtil.stringToDate("09/11/1959")));
        while (isRun) {
            Commands.printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADDD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    companyStorage.print();
                    System.out.println("Please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyById != null) {
                        employeeStorage.searchEmployeeByCompany(companyById);
                    } else {
                        System.out.println("Company does not exists");
                    }
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRang();
                    break;
                case CHANGE_EMPLOYEE_POSITION_BY_ID:
                    changeEmployeePositionById();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVE_EMPLOYEE_BY_ID:
                    inActiveEmployee();
                    break;
                case ACTIVATE_EMPLOYEE_BY_ID:
                    activateEmployee();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("Wrong command, Please try again");

            }
        }
    }

    private static void addCompany() {
        System.out.println("Please input id,name,adress,phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added!");
        } else {
            System.out.println("Company with " + companyId + "already exists");
        }

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
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("Please input name,surname,employeeId,salary,position,dateOfBirthday(15/02/2023)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeID = employeeData[2];
            Employee employeeById = employeeStorage.getEmployeeById(employeeID);
            if (employeeById == null) {
                Employee employee = new Employee(employeeData[0], employeeData[1], employeeID,
                        Double.parseDouble(employeeData[3]), companyById, employeeData[4],
                        new Date(), DateUtil.stringToDate(employeeData[5]));
                employeeStorage.add(employee);
                companyById.setEmployeeCount(companyById.getEmployeeCount() + 1);
                System.out.println("Employee was added!");
            } else {
                System.out.println("Employee with " + employeeById + " id already exists");
            }
        } else {
            System.out.println("wrong company id, please try again");
        }
    }
}

