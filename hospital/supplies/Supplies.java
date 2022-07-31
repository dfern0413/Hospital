package supplies;


public class Supplies implements supplyUsage {
    static int bandages = 150;
    static int syringes = 100;
    static int gloves = 250;


    public static void showInventory(){
        System.out.println("Bandages: " + bandages +" Syringes: " + syringes +
                " Gloves: " + gloves);
    }

    public void syringeUsed(){
        syringes--;
    }
    public void syringeAdded(){
        syringes++;
    }
    public void bandageUsed(){
        bandages--;
    }
    public void bandageAdded(){
        bandages++;
    }
    public void glovesUsed(){
        gloves--;
    }
    public void glovesAdded(){
        gloves++;
    }


}
