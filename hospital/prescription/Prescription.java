package prescription;

import medicine.Case;
import person.Doctor;
import person.Patient;

public class Prescription {

    static String prescription;
    static int medicineAmount;
    static Case casePrescribed;


    public static void prescribe(Case casePrescribed) {

        if (casePrescribed.getPatientSymptoms().getSymptom() == "Headache") {
            prescription = "Pain Relief pills";
            medicineAmount = 3;
            System.out.println(casePrescribed.getAssignedDoctor().getFullName() + " prescribes: " +
                    prescription + " " + medicineAmount + "\n" + "To Patient: " + casePrescribed.getPatient().getFullName());
        } else if (casePrescribed.getPatientSymptoms().getSymptom() == "Broken hand") {
            prescription = "Put hand in a cast";
            medicineAmount = 1;
            System.out.println(casePrescribed.getAssignedDoctor().getFullName() + " prescribes: " +
                    prescription + " " + medicineAmount + "\n" + "To Patient: " + casePrescribed.getPatient().getFullName());

        } else {
            prescription = "N/A";
            medicineAmount = 0;
            System.out.println(casePrescribed.getAssignedDoctor().getFullName() + "prescribes: " +
                    prescription + " " + medicineAmount + "\n" + "To Patient: " + casePrescribed.getPatient().getFullName());
        }


    }


}





