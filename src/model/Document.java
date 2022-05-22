package model;

public abstract class Document {
    private double price;
    private int year;
    private String image;
    private int matriz[][] = new int[4][4];

    public Document(double price, int year, String image, int[][] matriz) {
        this.price = price;
        this.year = year;
        this.image = image;
        this.matriz = matriz;
    }
    

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
}
    