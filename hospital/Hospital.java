import capacity.Capacity;
import medicine.Case;
import prescription.Prescription;
import supplies.Supplies;

public class Hospital {
    public static void main(String[] args) {
        Supplies.showInventory();

        Case case1 = new Case(1, "Mild Fever", "Robert Paul", "Julian");
        Supplies supplies1 = new Supplies();

        case1.diagnose();
        Prescription.prescribe(case1, supplies1);

        Supplies.showInventory();

        supplies1.syringeAdded();
        supplies1.bandageAdded();

        Supplies.showInventory();

       Capacity capacity1 = new Capacity(25, 40, 30);
       capacity1.docExit();
       capacity1.patientEntry();
       capacity1.visitorEntry();


    }
}
