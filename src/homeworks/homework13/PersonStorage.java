package homeworks.homework13;

import java.util.Date;

public class PersonStorage {

    private Person[] persons = new Person[10];
    private int size = 0;

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;
    }


    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                System.out.println(person);
            }
        }
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if(patient.getDoctor().equals(doctor)){
                    System.out.println(patient);
                }
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor
                    && person.getId().equals(id)) {
                deleteByIndex(i);
            }
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor
                    && person.getId().equals(id)) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void printTodaysPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                DateUtil.isSameDay(today, patient.getRegisterDateTime());
                System.out.println(patient);
            }
        }
    }


    private void extend() {
        Person[] result = new Person[persons.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = persons[i];
        }
        persons = result;
    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    public boolean isDoctorAvailable(Doctor doctor, Date registerDateTime) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor) &&
                        patient.getRegisterDateTime().equals(registerDateTime)) {
                    return false;
                }
            }
        }
        return true;
    }
    public void listProfession(){
        System.out.println("please choose profession");
        Profession[] values = Profession.values();
        for (Profession profession : values) {
            System.out.println(profession);

        }
    }
}
