package appointments;

import person.Doctor;
import person.Patient;

public class Appointments {
    String reasonAppointment;
    Doctor doctorAssigned;
    Patient patient;

    public Appointments(String reasonAppointment, Doctor doctorAssigned, Patient patient) {
        this.reasonAppointment = reasonAppointment;
        this.doctorAssigned = doctorAssigned;
        this.patient = patient;
    }

    public String getReasonAppointment() {
        return reasonAppointment;
    }

    public void setReasonAppointment(String reasonAppointment) {
        this.reasonAppointment = reasonAppointment;
    }

    public Doctor getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(Doctor doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
