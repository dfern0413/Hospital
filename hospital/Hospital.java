import medicine.Case;
import medicine.Symptoms;
import person.Doctor;
import person.Patient;
import person.Person;
import prescription.Prescription;
import supplies.Supplies;

public class Hospital {
    public static void main(String[] args) {

        Case case1 = new Case(1, new Symptoms("Headache"), new Doctor(22,"James Olson",
                "Pediatrics"),new Patient("Lurdes Mary", 1));

        Prescription.prescribe(case1);


    }
}
