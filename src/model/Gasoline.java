package model;

public class Gasoline extends Car {
    private double gasolineCapacity;
    private double gasolineConsume;
    private TypeG typeGasoline;


    public Gasoline(boolean used, double bprice, double sprice, String brand, int model, double cylinder, double mileage,String plate,int typeC, int doors, boolean polarized, double gasolineCapacity, double gasolineConsume, int typeG, double prid, int year, String image, int[][]matriz,double prid2, int year2, String image2, double prid3, int year3, String image3) {
        super(used,bprice,sprice,brand,model,cylinder,mileage,plate,typeC,doors,polarized,prid,year,image,matriz,prid2,year2,image2,prid3,year3,image3);
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsume = gasolineConsume;
        switch(typeG)
        {
            case 1: this.typeGasoline=TypeG.EXTRA;
            break;

            case 2: this.typeGasoline=TypeG.CORRIENTE;
            break;

            case 3: this.typeGasoline=TypeG.DIESEL;
            break;
        }
    }

    public double getGasolineCapacity() {
        return this.gasolineCapacity;
    }

    public void setGasolineCapacity(double gasolineCapacity) {
        this.gasolineCapacity = gasolineCapacity;
    }

    public double getGasolineConsume() {
        return this.gasolineConsume;
    }

    public void setGasolineConsume(double gasolineConsume) {
        this.gasolineConsume = gasolineConsume;
    }

    public TypeG getTypeGasoline() {
        return this.typeGasoline;
    }

    public void setTypeGasoline(TypeG typeGasoline) {
        this.typeGasoline = typeGasoline;
    }

}
