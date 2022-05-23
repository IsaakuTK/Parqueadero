package model;
public abstract class Car extends Vehicle{
    
    private int numDoors;
    private boolean polarized;
    private TypeC typeCar;

    public Car(boolean used, double bprice, double sprice, String brand, int model, double cylinder, double kilometers, String plate, int tc, int numDoors, boolean polarized, double prid, int year, String image, int[][]matriz,double prid2, int year2, String image2, double prid3, int year3, String image3) {
        super(used,bprice,sprice,brand,model,cylinder,kilometers,plate,prid,year,image,matriz,prid2,year2,image2,prid3,year3,image3);
        this.numDoors = numDoors;
        this.polarized = polarized;
        switch(tc)
        {
            case 1: this.typeCar=TypeC.SEDAN;
            break;

            case 2: this.typeCar=TypeC.PICKUPTRUCK;
            break;
        }
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isPolarized() {
        return this.polarized;
    }

    public boolean getPolarized() {
        return this.polarized;
    }

    public void setPolarized(boolean polarized) {
        this.polarized = polarized;
    }

    public TypeC getTypeCar() {
        return this.typeCar;
    }

    public void setTypeCar(TypeC typeCar) {
        this.typeCar = typeCar;
    }
    
}
