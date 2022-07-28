import appointments.Appointments;
import medicine.Case;
import medicine.Symptoms;
import person.Doctor;
import person.Patient;
import person.Person;
import prescription.Prescription;
import supplies.Supplies;

public class Hospital {
    public static void main(String[] args) {

        Case case1 = new Case(1, new Symptoms("Headache"), new Doctor(22, "James Olson",
                "Pediatrics"), new Patient("Lurdes Mary", 1));
        Case case2 = new Case(2, new Symptoms("Broken hand"), new Doctor(25, "Mark James",
                "Pediatrics"), new Patient("Louis Mary", 2));

        Prescription.prescribe(case1);
        Appointments.makeAppointment(case1);

        if (!case1.equals(case2)) {
            Prescription.prescribe(case2);
            Appointments.makeAppointment(case2);
        }

        System.out.println(case1.hashCode());
        System.out.println(case2.hashCode());


    }
}
