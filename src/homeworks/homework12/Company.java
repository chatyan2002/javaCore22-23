package homeworks.homework12;

import java.util.Objects;

public class Company {

    private String id;
    private String name;
    private String adress;
    private String phoneNumber;
    private int employeeCount;

    public Company(String id, String name, String adress, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Company() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return employeeCount == company.employeeCount && Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(adress, company.adress) && Objects.equals(phoneNumber, company.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, adress, phoneNumber, employeeCount);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }
}
