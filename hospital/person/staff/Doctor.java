package person.staff;

import person.Staff;

import java.util.Objects;

public class Doctor extends Staff {
    Boolean onCall;

    public Doctor(int age, char sex, String fullName, int staffNum, String department,
                  Boolean onCall){
        super(age, sex, fullName, staffNum, department);
        this.onCall = onCall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(onCall, doctor.onCall);
    }

}
