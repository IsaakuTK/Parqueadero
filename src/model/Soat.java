package model;

public class Soat extends Document {
    private String code;

    public Soat(double prid, int year, String image, int[][]matriz) {
        super(prid,year,image,matriz);
        this.code=generateCode(matriz);
    }

    public String generateCode(int [][] matriz){
        String cod="";
        for(int i=0;i<matriz.length;i++)
      {
            cod+=""+matriz[i][0];
      }
        for(int j=0;j<matriz.length;j++)
      {
            cod+=""+matriz[matriz.length-1][j];
      }
        return cod;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
