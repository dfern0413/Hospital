package person.staff;

import person.Staff;

public class Nurse extends Staff {
    String specialty;
    int amountPatients;

    public Nurse(int staffNum, String department, String specialty, int patientNum,
                 int age, char sex, String fullName){
        super(age, sex, fullName, staffNum, department);
        this.amountPatients = patientNum;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Nurse " + '\n'+
                "specialty: " + specialty + '\n' +
                "Amount of Patients: " + amountPatients;
    }
}
