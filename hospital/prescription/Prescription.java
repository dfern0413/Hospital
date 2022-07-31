package prescription;

import medicine.Case;
import supplies.Supplies;


public abstract class Prescription{

    static String prescription;


    public static void prescribe(Case casePrescribed, Supplies suppliesUsedDuring) {

        casePrescribed.diagnose();
        switch (casePrescribed.doctorDiagnose) {
            case "Common Cold":
                prescription = "Pain Relief pills";
                suppliesUsedDuring.glovesUsed();
                suppliesUsedDuring.syringeUsed();
                System.out.println(prescription);
                break;
            case "Dislocated Shoulder":
                prescription = "1 week rest and therapy";
                suppliesUsedDuring.bandageUsed();
                suppliesUsedDuring.glovesAdded();
                System.out.println(prescription);
                break;
            case "Mild Burn":
                prescription = "Ointment";
                suppliesUsedDuring.bandageUsed();
                suppliesUsedDuring.glovesUsed();
                suppliesUsedDuring.syringeUsed();
                System.out.println(prescription);
                break;
            default:
                prescription = "N/A";
                System.out.println(prescription);
                break;
        }


    }


}





