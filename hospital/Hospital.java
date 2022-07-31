import appointments.Appointments;
import capacity.PatientAmount;
import capacity.Visitants;
import medicine.Case;

import prescription.Prescription;

public class Hospital {
    public static void main(String[] args) {

        Case case1 = new Case(1, "Mild Fever", "Robert Paul", "Julian");
        case1.diagnose();
        Prescription.prescribe(case1);

        PatientAmount pAmount = new PatientAmount(6);
        pAmount.entry();

        Visitants vAmount = new Visitants(15);
        vAmount.exit();
        vAmount.exit();



    }
}
