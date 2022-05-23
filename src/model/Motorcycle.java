package model;

public class Motorcycle extends Vehicle{
    private TypeM typemoto;
    private double gasolineCapacity;
    private double gasolineConsume;


    public Motorcycle(boolean used, double bprice, double sprice, String brand, int model, double cylinder, double mileage, String plate, int tm, double gasolineCapacity, double gasolineConsume, double prid, int year, String image, int[][]matriz,double prid2, int year2, String image2,double prid3, int year3, String image3) {
        super(used,bprice,sprice,brand,model,cylinder,mileage,plate,prid,year,image,matriz,prid2,year2,image2,prid3,year3,image3);
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineConsume = gasolineConsume;
        switch(tm)
        {
            case 1: this.typemoto=TypeM.STANDAR;
            break;

            case 2: this.typemoto=TypeM.SPORT;
            break;

            case 3: this.typemoto=TypeM.SCOOTER;
            break;

            case 4: this.typemoto=TypeM.CROSS;
        }
    }

    public TypeM getTypemoto() {
        return this.typemoto;
    }

    public void setTypemoto(TypeM typemoto) {
        this.typemoto = typemoto;
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


}
