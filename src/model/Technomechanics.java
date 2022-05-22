package model;

public class Technomechanics extends Document {
    private String code;
    
    public Technomechanics(double prid, int year, String image, int[][]matriz) {
        super(prid,year,image,matriz);
        this.code=generateCode(matriz);
    }

    public String generateCode(int [][] matriz){
        String message="";
        for (int i=0;i<matriz.length;i++){
            message+=matriz[0][i];
        }
        
        for (int i=1;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(j+i==matriz.length-1){
                 message+=matriz[i][j];
                }
                
            }
        }
        for (int a=1;a<matriz.length;a++){
            message+=matriz[matriz.length-1][a];
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
