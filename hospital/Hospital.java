import capacity.Capacity;
import exceptions.ExceedCapacityException;
import exceptions.NegativeValueException;
import medicine.Case;
import prescription.Prescription;
import supplies.Supplies;

public class Hospital {
    public static void main(String[] args) throws NegativeValueException, ExceedCapacityException {
        Supplies.showInventory();

        Case case1 = new Case(1, "Mild Fever", "Robert Paul", "Julian");
        Supplies supplies1 = new Supplies();

        case1.diagnose();
        Prescription.prescribe(case1, supplies1);

        Supplies.showInventory();

        supplies1.syringeAdded();
        supplies1.bandageAdded();

        Supplies.showInventory();

       Capacity capacity1 = new Capacity(2, 119, 247);
       capacity1.visitorExit();
       capacity1.visitorExit();
       capacity1.docEntry();
       capacity1.visitorExit();

    }
}
