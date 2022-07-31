package capacity;

public class VisitantsAmount implements capacityFlow {
    int visitorAmount;

    public VisitantsAmount(int visitorAmount){
        this.visitorAmount = visitorAmount;
    }

    @Override
    public void entry() {
        visitorAmount++;
        System.out.println(visitorAmount);
    }

    @Override
    public void exit() {
        visitorAmount--;
        System.out.println(visitorAmount);
    }

    public int getVisitorAmount() {
        return visitorAmount;
    }

    public void setVisitorAmount(int visitorAmount) {
        this.visitorAmount = visitorAmount;
    }
}
