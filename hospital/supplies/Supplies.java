package supplies;

public class Supplies {
    int bandages;
    int syringes;

    public Supplies(int bandages, int syringes){
        this.bandages = bandages;
        this.syringes = syringes;
    }

    public String toString(){
        return "Amount of bandages: " + bandages +
                " Amount of syringes: " + syringes;
    }
}
