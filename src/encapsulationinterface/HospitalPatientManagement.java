package EncapsulationInterface;

import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private int daysAdmitted;

    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        daysAdmitted = days;
    }

    public double calculateBill() {
        return daysAdmitted * 3000;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println(records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 500;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        System.out.println(records);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient(1, "Ravi", 45, 4));
        patients.add(new OutPatient(2, "Kiran", 30));

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            System.out.println("----------------------");
        }
    }
}
