package capacity;

public class Capacity implements ICapacityFlow{
    int patientAmount;
    int staffAmount;
    int visitorAmount;

    public Capacity(int visitorAmount, int staffAmount, int patientAmount){
        this.visitorAmount = visitorAmount;
        this.staffAmount = staffAmount;
        this.patientAmount = patientAmount;
    }


    public void patientEntry() {
        patientAmount++;
        System.out.println(patientAmount);
    }

    public void patientExit() {
        patientAmount--;
        System.out.println(patientAmount);
    }
    public void visitorEntry() {
        visitorAmount++;
        System.out.println(visitorAmount);
    }

    public void visitorExit() {
        visitorAmount--;
        System.out.println(visitorAmount);
    }
    public void docEntry() {
        staffAmount++;
        System.out.println(staffAmount);
    }

    public void docExit() {
        staffAmount--;
        System.out.println(staffAmount);
    }
}
