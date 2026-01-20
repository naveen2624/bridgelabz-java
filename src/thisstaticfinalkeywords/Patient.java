package thisstaticfinalkeywords;
class Patient {

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Ailment: " + ailment);
        }
    }
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Suresh", 30, "Fever");
        p1.displayDetails(p1);
        Patient.getTotalPatients();
    }
}

