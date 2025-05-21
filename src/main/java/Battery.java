public class Battery {

    private int capacityMAh;
    private boolean isCharged;

    public Battery(int capacityMAh){
        this.capacityMAh = capacityMAh;
        this.isCharged = false;
    }

    public void charge(){
        this.isCharged = true;
    }

    public boolean isCharged(){
        return this.isCharged;
    }

    public int getCapacityMAh(){
        return this.capacityMAh;
    }

    @Override
    public String toString(){
        return "Battery: " + this.capacityMAh +  "mAh, Charged: " + this.isCharged;
    }
}
