package model;

public class OwnerCard extends Document{
    private String code;   

    public OwnerCard(double prid, int year, String image, int[][]matriz) {
        super(prid,year,image,matriz);
        this.code=generateCode(matriz);
        
    }

    public String generateCode(int [][] matriz){
        String message="";
        for (int i=matriz.length-1;i>=0;i--){
            for (int j=matriz.length-1;j>=0;j--){
                if((i+j)%2==0){
                    message+=matriz[i][j];
                }
            }
        }

        return message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}