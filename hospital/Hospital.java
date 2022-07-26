import appointments.Appointments;
import person.Patient;
import person.Person;
import person.staff.Nurse;
import supplies.Supplies;

public class Hospital {
    public static void main(String[] args) {
        //Persons
        Person person1 = new Person(33, 'M', "Alberto Oto");

        //Patients
        Patient patient2 = new Patient(19, 'M', "Bob Ant", 18273, "Headache",
                "Ibuprofen");
        Patient patient3 = new Patient(19, 'M', "Bob Ant", 18273, "Headache",
                "Ibuprofen");
        Patient patient4 = new Patient(25, 'F', "Louisa Ant", 18777, "Broken Hand",
                "Cast");

        //Nurses
        Nurse nurse1 = new Nurse(355, "Emergency Care", "Burns", 5, 22,
                'F', "Luisa Jomes");
        Nurse nurse2 = new Nurse(355, "Emergency Care", "Burns", 5, 22,
                'F', "Luisa Jomes");
        Nurse nurse3 = new Nurse(356, "Pediatrics", "Recovery", 7, 25,
                'M', "Luis Jon");

        // appointments.Appointments
        Appointments appoint1 = new Appointments(25, "Annual check up", "July 26");

        //Supplies
        Supplies supplies1 = new Supplies(100, 150);

        // toString test
        System.out.println(nurse1);
        System.out.println(appoint1);
        System.out.println(supplies1);

        // equals test
        System.out.println(nurse1.equals(nurse2));
        System.out.println(nurse2.equals(nurse3));
        System.out.println(nurse3.equals(nurse1));

        // hashCode test
        System.out.println("Patient 2 hashCode: " + patient2.hashCode());
        System.out.println("Patient 3 hashCode: " + patient3.hashCode());
        System.out.println("Patient 4 hashCode: " + patient4.hashCode());

        person1.setAge(55);
        person1.setFullName("Francis Conor");

        int person1Age = person1.getAge();
        String person1Name = person1.getFullName();

        System.out.println(person1Age);
        System.out.println(person1Name);
    }
}
