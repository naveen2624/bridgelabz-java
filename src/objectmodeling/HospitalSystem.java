package ObjectModeling;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println(name + " consulting " + p.name);
    }
}

class Hospital {
}

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Ravi");
        Patient p = new Patient("Anil");

        d.consult(p);
    }
}
