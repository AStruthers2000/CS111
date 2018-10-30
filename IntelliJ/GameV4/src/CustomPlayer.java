import java.util.StringTokenizer;

public class CustomPlayer extends Player {
    double spiritApproval;
    int carryingCapacity;

    public CustomPlayer(String name, int room, String inventory, int carryCapacity) {
        super(name, room, inventory);
        this.spiritApproval = 0.0;
        this.carryingCapacity = carryCapacity;
    }

    protected double getSpiritApproval(){
        return spiritApproval;
    }
    protected void addToSpiritApproval(double pointsToAdd){
        this.spiritApproval += pointsToAdd;
    }
    protected void printSpiritApproval(){
        System.out.println("Spirit approval:\n\t" + spiritApproval + "% approval");
    }

    protected int getCarryingCapacity(){
        return carryingCapacity;
    }
    protected void addToCarryingCapacity(int increase){
        this.carryingCapacity += increase;
    }
    protected void printCarryingCapacity(){
        System.out.println("Carrying capacity:\n\t" + carryingCapacity + " items");
    }

    public void printInventory() {
        StringTokenizer strT = new StringTokenizer(super.getInventory(), ";");
        System.out.println(super.getName() + "'s items: ");
        int numItems = 0;
        while (strT.hasMoreTokens()) {
            System.out.println("  " + strT.nextToken());
            numItems++;
        }
        System.out.println("  A total of " + numItems + " item(s)");
        printSpiritApproval();
        printCarryingCapacity();
    }
}