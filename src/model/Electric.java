package model;

public class Electric extends Car {
    private TypeCh typeCharger;
    private double batteryDuration;
    private double batteryConsume;


    public Electric(boolean alreadyUsed, double basePrice, double sellPrice, String brand, int model, double cylinderCapacity, double kilometers, String licensePlate, int typeC, int doors, boolean polarized, double batteryd, double batteryc, int typech, double prid, int year, String image, int[][]matriz,double prid2, int year2, String image2, double prid3, int year3, String image3) {
        super(alreadyUsed,basePrice,sellPrice,brand,model,cylinderCapacity,kilometers,licensePlate,typeC,doors,polarized,prid,year,image,matriz,prid2,year2,image2,prid3,year3,image3);
        this.batteryDuration = batteryDuration;
        this.batteryConsume = batteryConsume;
        switch(typech)
        {
            case 1: this.typeCharger=TypeCh.FAST;
            break;

            case 2: this.typeCharger=TypeCh.NORMAL;
            break;
        }
    }

    public TypeCh getTypeCharger() {
        return this.typeCharger;
    }

    public void setTypeCharger(TypeCh typeCharger) {
        this.typeCharger = typeCharger;
    }

    public double getBatteryDuration() {
        return this.batteryDuration;
    }

    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    public double getBatteryConsume() {
        return this.batteryConsume;
    }

    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }
}
