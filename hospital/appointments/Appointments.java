package appointments;

public class Appointments {
    int appointNum;
    String reasonVisit;
    String appointDate;

    public Appointments(int appointNum, String reasonVisit, String appointDate) {
        this.appointNum = appointNum;
        this.reasonVisit = reasonVisit;
        this.appointDate = appointDate;
    }

        public String toString(){
            return "Appointment number: " + appointNum
                    + " Reason for Visit: " + reasonVisit
                    + " Appointment Date: " + appointDate;
        }
}
