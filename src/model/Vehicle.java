package model;
import java.util.ArrayList;
public abstract class Vehicle {

    private boolean alreadyUsed;
    private double basePrice;
    private double sellPrice;
    private String brand;
    private int model;
    private double cilinderCapacity;
    private double kilometers;
    private String licensePlate;
    private ArrayList <Document> documents;

    public Vehicle(boolean alreadyUsed, double basePrice, double sellPrice, String brand, int model, double cilinderCapacity, double kilometers, String licensePlate, double prid, int year, String image,int[][]matriz,double prid2, int year2, String image2,double prid3, int year3, String image3) {
        this.alreadyUsed = alreadyUsed;
        this.basePrice = basePrice;
        this.sellPrice = sellPrice;
        this.brand = brand;
        this.model = model;
        this.cilinderCapacity = cilinderCapacity;
        this.kilometers = kilometers;
        this.licensePlate = licensePlate;
        documents = new ArrayList <Document> ();
        documents.add(new Soat(prid,year,image,matriz));
        documents.add(new Technomechanics(prid2,year2,image2,matriz));
        documents.add(new OwnerCard(prid3,year3,image3,matriz));
    }

    public String documents() {
        String m="\n";
        for(int i=0; i<documents.size(); i++)
        {
            if(documents.get(i)instanceof Soat){
                m+="\nSoat: ";
                Soat obj1=(Soat) documents.get(i);
                if(obj1!=null)
                {
                    m+="\n"+obj1.getCode();
                }
            }

            if(documents.get(i)instanceof Technomechanics){
                m+="\nTechnomechanic: ";
                Technomechanics obj1=(Technomechanics) documents.get(i);
                if(obj1!=null)
                {
                    m+="\n"+obj1.getCode();
                }
            }

            if(documents.get(i)instanceof OwnerCard){
                m+="\nOwner Card:";
                OwnerCard obj1=(OwnerCard) documents.get(i);
                if(obj1!=null)
                {
                    m+="\n"+obj1.getCode();
                }
            }
        }
            
        return m;
    }

    public boolean isAlreadyUsed() {
        return this.alreadyUsed;
    }

    public boolean getAlreadyUsed() {
        return this.alreadyUsed;
    }

    public void setAlreadyUsed(boolean alreadyUsed) {
        this.alreadyUsed = alreadyUsed;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return this.model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getCilinderCapacity() {
        return this.cilinderCapacity;
    }

    public void setCilinderCapacity(double cilinderCapacity) {
        this.cilinderCapacity = cilinderCapacity;
    }

    public double getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public ArrayList<Document> getDocuments() {
        return this.documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    
}
