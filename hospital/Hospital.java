import capacity.Capacity;
import exceptions.ExceedCapacityException;
import exceptions.NegativeValueException;
import medicine.Case;
import prescription.Prescription;
import supplies.Supplies;
import org.apache.log4j.Logger;

public class Hospital {
    public static void main(String[] args) throws NegativeValueException, ExceedCapacityException {
        Supplies.showInventory();

        Case case1 = new Case(1, "Mild Fever", "Patrick James", "Julian");


    }
}
