package homeworks.homework13;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class MedicalCentre implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENT_BY_DOCTOR:
                    printAllPatientByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command!");

            }
        }
    }


    private static void printAllPatientByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctors id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorId + "does not exists!");
        }
    }

    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please choose doctors id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input id, name, surname, phone, registerDateTime (26-02-2023 12:00)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("Patient registered!");
                } else {
                    System.out.println("Doctor is unavailable in that time, please choose another!");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again");
            }
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input name,surname,email,phoneNumber,profession");
            personStorage.listProfession();
            String doctorDataStr = scanner.nextLine();
            String[] personData = doctorDataStr.split(",");
            String personDatum = personData[4];
            doctorById.setName(personData[0]);
            doctorById.setSurname(personData[1]);
            doctorById.setEmail(personData[2]);
            doctorById.setPhoneNumber(personData[3]);
         try{
             doctorById.setProfession(Profession.valueOf(personDatum));
         }catch (IllegalArgumentException e){
             System.out.println("profession is wrong");
         }
            System.out.println("doctor changed");
        } else {
            System.out.println("Doctor with " + doctorId + " does not exists!");
        }
    }


    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose id");
        String doctorId = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(doctorId);
        if (doctor != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("Wrong id. please try again!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {
        System.out.println("Please input id,name,surname,email,phoneNumber,profession");
        personStorage.listProfession();
        String doctorDataStr = scanner.nextLine();
        String[] personData = doctorDataStr.split(",");
        String doctorId = personData[0];
        String personDatum = personData[5];
        Person personById = personStorage.getDoctorById(doctorId);
        if (personById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(personData[1]);
            doctor.setSurname(personData[2]);
            doctor.setEmail(personData[3]);
            doctor.setPhoneNumber(personData[4]);
           try {
               doctor.setProfession(Profession.valueOf(personDatum));
           }catch (IllegalArgumentException e){
               System.out.println("profession is wrong ");
           }
            personStorage.add(doctor);
            System.out.println("doctor added" + doctor + ":");
        } else {
            System.out.println("Doctor with " + doctorId + " already exists");
        }
    }
}


