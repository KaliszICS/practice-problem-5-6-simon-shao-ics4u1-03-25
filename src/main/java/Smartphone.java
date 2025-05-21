public class Smartphone {

    private Battery battery;
    private Display display;
    private Processor processor;
    private String brand;
    private String model;
    private boolean power;
    
    public Smartphone(String brand, String model, Battery battery, Display display, Processor processor){
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.display = display;
        this.processor = processor;
        power = false;
    }

    public Smartphone(String brand, String model, int batteryCapacity, double displaySize, String resolution, String processorModel, double processorSpeed){
        this.brand = brand;
        this.model = model;
        this.battery = new Battery(batteryCapacity);
        this.display = new Display(displaySize, resolution);
        this.processor = new Processor(processorModel, processorSpeed);
    }

    public String powerOn(){
        if(this.battery.isCharged()){
            this.display.turnOn();
            this.power = true;
            return "Powering on " + this.brand + " " + this.processor.getModel();
        }
        else{
            return "Cannot power on: Battery depleted";
        }
    }

    public String powerOff(){
        this.display.turnOff();
        this.power = false;
        return "Powering off " + this.brand + " " + this.processor.getModel();
    }

    public void chargeBattery(){
        this.battery.charge();
    }

    public String runApp(String appName){
        if (power){
            this.processor.processTask(appName);
            return appName + " running.";
        }
        else{
            return "Phone is off. Cannot run " + appName;
        }
    }

    public void upgradeComponent(Battery newBattery){
        this.battery = newBattery;
    }

    public void upgradeComponent(Display newDisplay){
        this.display = newDisplay;
    }

    public void upgradeComponent(Processor newProcessor){
        this.processor = newProcessor;
    }

    @Override
    public String toString(){
        String words = "" + this.brand + " " + this.processor.getModel() + "Smartphone" +"\n";
        words = words + battery.toString() + "\n";
        words = words + display.toString() + "\n";
        words = words + processor.toString();
        return words;

    }

}
