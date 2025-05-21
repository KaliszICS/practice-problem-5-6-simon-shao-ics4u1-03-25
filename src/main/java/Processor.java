public class Processor {

    private String model;
    private double speedGHz;

    public Processor(String model, double speedGHz){
        this.model = model;
        this.speedGHz = speedGHz;
    }

    public String processTask(String task){
        return "Processing" + task + " with " + this.model + " at " + this.speedGHz + " GHz";
    }

    public String getModel(){
        return this.model;
    }

    public double getSpeedGHz(){
        return this.speedGHz;
    }

    @Override
    public String toString(){
        return "Processor: " + this.model + ", " + this.speedGHz + " GHz";
    }
}
