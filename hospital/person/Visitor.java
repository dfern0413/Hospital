package person;

import java.util.Objects;

public class Visitor extends Person{
    String patientVisiting;
    String checkIn;
    String checkOut;

    public Visitor(int age, char sex, String fullName, String patientVisiting, String checkIn,
                   String checkOut){
        super(age, sex, fullName);
        this.patientVisiting = patientVisiting;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitor visitor = (Visitor) o;
        return Objects.equals(patientVisiting, visitor.patientVisiting) && Objects.equals(checkIn, visitor.checkIn) && Objects.equals(checkOut, visitor.checkOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientVisiting, checkIn, checkOut);
    }
}
