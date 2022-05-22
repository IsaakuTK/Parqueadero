package model;
import java.util.ArrayList;
public abstract class Vehicle {

    private boolean alreadyUsed;
    private double basePrice;
    private double sellPrice;
    private String brand;
    private String model;
    private double cilinderCapacity;
    private double kilometers;
    private String licensePlate;
    private ArrayList <Document> documents;
    private int tipoc;

    public Vehicle(boolean alreadyUsed, double basePrice, double sellPrice, String brand, String model, double cilinderCapacity, double kilometers, String licensePlate, double prid, int year, String image,int[][]matriz,double prid2, int year2, String image2, int tipoc) {
        this.alreadyUsed = alreadyUsed;
        this.basePrice = basePrice;
        this.sellPrice = sellPrice;
        this.brand = brand;
        this.model = model;
        this.cilinderCapacity = cilinderCapacity;
        this.kilometers = kilometers;
        this.licensePlate = licensePlate;
        this.tipoc=tipoc;
        documents = new ArrayList <Document> ();
        documents.add(new Soat(prid,year,image,matriz));
        documents.add(new Technomechanics(prid2,year2,image2,matriz));
        //documents.add(new OwnerCard(prid,year,image,matriz));
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

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
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

    public int getTipoc() {
        return this.tipoc;
    }

    public void setTipoc(int tipoc) {
        this.tipoc = tipoc;
    }

    
}
