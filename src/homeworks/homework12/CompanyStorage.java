package homeworks.homework12;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;


    public void add(Company company) {
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
    }

    public void extend() {
        Company[] result = new Company[companies.length + 10];
        // System.arraycopy(employees, 0, result,0,size);
        for (int i = 0; i < size; i++) {
            result[i] = companies[i];
        }
        companies = result;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i] + " ");
        }
    }

    public Company getCompanyById(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Company company = companies[i];
            if (company.getId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}
