package prescription;

import medicine.Case;
import person.Doctor;
import person.Patient;

public abstract class Prescription {

    static String prescription;
    static Case casePrescribed;


    public static void prescribe(Case casePrescribed) {

        casePrescribed.diagnose();
        if (casePrescribed.doctorDiagnose == "Common Cold") {
            prescription = "Pain Relief pills";
            System.out.println(prescription);
        } else if (casePrescribed.doctorDiagnose == "Dislocated Shoulder") {
            prescription = "1 week rest and therapy";
            System.out.println(prescription);
        } else if (casePrescribed.doctorDiagnose == "Mild Burn") {
            prescription = "Ointment";
            System.out.println(prescription);
        } else {
            prescription = "N/A";
            System.out.println(prescription);
        }


    }


}





