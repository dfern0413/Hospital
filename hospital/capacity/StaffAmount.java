package capacity;

public abstract class StaffAmount implements capacityFlow {
    int staffWorking;

    public StaffAmount(int staffWorking){
        this.staffWorking = staffWorking;
    }

    @Override
    public void entry() {
        staffWorking++;
        System.out.println(staffWorking);
    }

    @Override
    public void exit() {
        staffWorking--;
        System.out.println(staffWorking);
    }

    public int getStaffWorking() {
        return staffWorking;
    }

    public void setStaffWorking(int staffWorking) {
        this.staffWorking = staffWorking;
    }
}
