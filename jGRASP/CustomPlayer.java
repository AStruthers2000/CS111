import java.util.StringTokenizer;

public class CustomPlayer extends Player {
    private double spiritApproval;
    private int carryingCapacity;

    //default constructor
    public CustomPlayer(String name, int room, String inventory, int carryCapacity) {
        super(name, room, inventory);
        this.spiritApproval = 0.0;
        this.carryingCapacity = carryCapacity;
    }

    //getter for SpiritApproval
    protected double getSpiritApproval(){
        return spiritApproval;
    }
    //adds to SpiritApproval
    protected void addToSpiritApproval(double pointsToAdd){
        this.spiritApproval += pointsToAdd;
    }
    //prints out SpiritApproval, called in printInventory()
    protected void printSpiritApproval(){
        System.out.println("Spirit approval:\n\t" + spiritApproval + "% approval");
    }

    //getter for CarryingCapacity
    protected int getCarryingCapacity(){
        return carryingCapacity;
    }
    //adds to CarryingCapacity, can take negative numbers to subtract
    protected void addToCarryingCapacity(int increase){
        this.carryingCapacity += increase;
    }
    //prints CarryingCapacity, called in printInventory()
    protected void printCarryingCapacity(){
        System.out.println("Carrying capacity:\n\t" + carryingCapacity + " items");
    }

    //adds item to inventory
    public void addToInventory(String item) {
        String[] currentInventory = super.getInventory().split(";");
        if(currentInventory.length + 1 <= getCarryingCapacity()) {
            super.addToInventory(item);
            if(item.equalsIgnoreCase("backpack") || item.equalsIgnoreCase("bag") || item.equalsIgnoreCase("sack")){
                addToCarryingCapacity(5);
            }
        }else{
            System.out.println("Inventory full!\n\tThe spirits that haunt this place have deemed you greedy. For that, they approve of you 10% less");
            addToSpiritApproval(-10.0);
        }
    }

    //prints inventory
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