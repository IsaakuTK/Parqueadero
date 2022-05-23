package model;
import java.util.ArrayList;
public class Company {

    private String name;
    private ArrayList <Car> cars;
    private ArrayList <Motorcycle> motorcycles;
    private Vehicle parking[][] = new Vehicle[10][5];


    public Company(String name) {
        this.name = name;
        cars = new ArrayList <Car> ();
        motorcycles = new ArrayList <Motorcycle> ();
    }    

    public String regVehicle(double bprice, double sprice, String brand, int model, double cylinder, double mileage, boolean used, String plate, double capacityg, int tipog, double consumeg, int typeC, int doors, boolean polarized, double prid, int year, String image, int[][]matriz, double prid2, int year2, String image2,double prid3, int year3, String image3)
    {
        String m="";
        if(existP(plate)==false)
        {
                cars.add(new Gasoline(used,bprice,sprice,brand,model,cylinder,mileage,plate,typeC,doors,polarized,capacityg,consumeg,tipog,prid,year,image,matriz,prid2,year2,image2,prid3,year3,image3));
                m="Vehicle registered";
        }
        else{
            m="Vehicle already exist";
        }
        for(int i=0; i<cars.size(); i++)
        {
            Vehicle obj1=cars.get(i);
                if(cars.get(i)instanceof Gasoline)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+obj1.getBasePrice());
                }
                else if(cars.get(i)instanceof Electric)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.20));
                }
                else if(cars.get(i)instanceof Hybrid)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.15));
                }
                if(obj1.getAlreadyUsed()==true)
                {
                    obj1.setSellPrice(obj1.getSellPrice()-(obj1.getSellPrice()*0.10));
                }
        }
                
        for(int j=0; j<motorcycles.size(); j++)
        {
            Vehicle obj2=motorcycles.get(j);
                
                obj2.setSellPrice(obj2.getSellPrice()+(obj2.getBasePrice()*1.04));
                if(obj2.getAlreadyUsed()==true)
                {
                    obj2.setSellPrice(obj2.getSellPrice()-(obj2.getSellPrice()*0.02));
                }
        }
        return m;
    }

    public String regVehicle(double bprice, double sprice, String brand, int model, double cylinder, double mileage, boolean used, String plate, int typech, double batteryd, double batteryc, int typeC, int doors, boolean polarized, double prid, int year, String image, int[][]matriz, double prid2, int year2, String image2, double prid3, int year3, String image3)
    {
        String m="";
        if(existP(plate)==false)
        {
                cars.add(new Electric(used,bprice,sprice,brand,model,cylinder,mileage,plate,typeC,doors,polarized,batteryd,batteryc,typech,prid,year,image,matriz,prid2,year2,image2,prid3,year3,image3));
                m="Vehicle registered";
        }
        else{
            m="Vehicle already exist";
        }
        for(int i=0; i<cars.size(); i++)
        {
            Vehicle obj1=cars.get(i);
                if(cars.get(i)instanceof Gasoline)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+obj1.getBasePrice());
                }
                else if(cars.get(i)instanceof Electric)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.20));
                }
                else if(cars.get(i)instanceof Hybrid)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.15));
                }
                if(obj1.getAlreadyUsed()==true)
                {
                    obj1.setSellPrice(obj1.getSellPrice()-(obj1.getSellPrice()*0.10));
                }
        }
                
        for(int j=0; j<motorcycles.size(); j++)
        {
            Vehicle obj2=motorcycles.get(j);
                
                obj2.setSellPrice(obj2.getSellPrice()+(obj2.getBasePrice()*1.04));
                if(obj2.getAlreadyUsed()==true)
                {
                    obj2.setSellPrice(obj2.getSellPrice()-(obj2.getSellPrice()*0.02));
                }
        }
        return m;
    }

    public String regVehicle(double bprice, double sprice, String brand, int model, double cylinder, double mileage, boolean used, String plate, double capacityg, int tipog, double consumeg, int typeC, int doors, boolean polarized, int typech, double batteryd, double batteryc, double prid, int year, String image, int[][]matriz, double prid2, int year2, String image2, double prid3, int year3, String image3)
    {
        
        String m="";
        if(existP(plate)==false)
        {
                cars.add(new Hybrid(used,bprice,sprice,brand,model,cylinder,mileage,plate,typeC,doors,polarized,capacityg,consumeg,tipog,batteryd,batteryc,typech,prid,year,image,matriz,prid2,year2,image2,prid3,year3,image3));
                m="Vehicle registered";
        }
        else{
            m="Vehicle already exist";
        }
        for(int i=0; i<cars.size(); i++)
        {
            Vehicle obj1=cars.get(i);
                if(cars.get(i)instanceof Gasoline)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+obj1.getBasePrice());
                }
                else if(cars.get(i)instanceof Electric)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.20));
                }
                else if(cars.get(i)instanceof Hybrid)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.15));
                }
                if(obj1.getAlreadyUsed()==true)
                {
                    obj1.setSellPrice(obj1.getSellPrice()-(obj1.getSellPrice()*0.10));
                }
        }
                
        for(int j=0; j<motorcycles.size(); j++)
        {
            Vehicle obj2=motorcycles.get(j);
                
                obj2.setSellPrice(obj2.getSellPrice()+(obj2.getBasePrice()*1.04));
                if(obj2.getAlreadyUsed()==true)
                {
                    obj2.setSellPrice(obj2.getSellPrice()-(obj2.getSellPrice()*0.02));
                }
        }
        return m;
    }

    public String regVehicle(double bprice, double sprice, String brand, int model, double cylinder, double mileage, boolean used, String plate, int motrocyclet, double capacityg, double consumeg, double prid, int year, String image, int[][]matriz, double prid2, int year2, String image2, double prid3, int year3, String image3)
    {
        
        String m="";
        if(existP(plate)==false)
        {
                motorcycles.add(new Motorcycle(used,bprice,sprice,brand,model,cylinder,mileage,plate,motrocyclet,capacityg,consumeg,prid,year,image,matriz,prid2,year2,image2,prid3,year3,image3));
                m="Vehicle registered";
        }
        else{
            m="Vehicle already exist";
        }
        for(int i=0; i<cars.size(); i++)
        {
            Vehicle obj1=cars.get(i);
                if(cars.get(i)instanceof Gasoline)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+obj1.getBasePrice());
                }
                else if(cars.get(i)instanceof Electric)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.20));
                }
                else if(cars.get(i)instanceof Hybrid)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.15));
                }
                if(obj1.getAlreadyUsed()==true)
                {
                    obj1.setSellPrice(obj1.getSellPrice()-(obj1.getSellPrice()*0.10));
                }
        }
                
        for(int j=0; j<motorcycles.size(); j++)
        {
            Vehicle obj2=motorcycles.get(j);
                
                obj2.setSellPrice(obj2.getSellPrice()+(obj2.getBasePrice()*1.04));
                if(obj2.getAlreadyUsed()==true)
                {
                    obj2.setSellPrice(obj2.getSellPrice()-(obj2.getSellPrice()*0.02));
                }
        }
        return m;
    }


    public boolean existP(String plate)
    {
        boolean r=false;
        boolean seguir=true;

        for(int i=0; i<cars.size() && seguir==true; i++)
        {
            Vehicle obj= cars.get(i);
            if(obj.getLicensePlate().equalsIgnoreCase(plate))
            {
                r=true;
                seguir=false;
            }
        }
        return r;
    }

    public String infoV()
    {   
        String men="Vehicles:";
        for(int i=0; i<cars.size(); i++)
        {
            Vehicle obj1=cars.get(i);
            Gasoline obj3=(Gasoline) cars.get(i);
            if(obj1!=null)
            {
                men+="\n Type of car: "+cars.get(i).getTypeCar()+" type of fuel: "+obj3.getTypeGasoline()+" the vehicle have a status of use: "+cars.get(i).isAlreadyUsed()+" The price of the vehicle is: "+obj1.getSellPrice();
            }
        }

        for(int i=0; i<motorcycles.size(); i++)
        {
            Vehicle obj2=motorcycles.get(i);
            if(obj2!=null)
            {
                men+="\n Type of motorcycle: "+motorcycles.get(i).getTypemoto()+" the vehicle have a status of use: "+motorcycles.get(i).isAlreadyUsed()+" The price of the vehicle is: "+obj2.getSellPrice();
            }
        }
        return men;
    }
    
    public String totalprice(String pl) {
        String mens="";
        for(int i=0; i<cars.size(); i++)
        {
            Vehicle obj1=cars.get(i);
            if(obj1.getLicensePlate().equalsIgnoreCase(pl)){
            mens="The price of the vehicle is: "+obj1.getSellPrice();
            }
        }
                
        for(int j=0; j<motorcycles.size(); j++)
        {
            Vehicle obj2=motorcycles.get(j);
            if(obj2.getLicensePlate().equalsIgnoreCase(pl))
            {
                
                obj2.setSellPrice(obj2.getSellPrice()+(obj2.getBasePrice()*1.04));
                if(obj2.getAlreadyUsed()==true)
                {
                    obj2.setSellPrice(obj2.getSellPrice()-(obj2.getSellPrice()*0.02));
                }
                mens="The price of the vehicle is: "+obj2.getSellPrice();
            }
            else{
                mens="The plate dont exist";
            }
        }
    
        return mens;
    }

    public String cDocuments(String plate) {
        String mens="";
        
        for(int i=0; i<cars.size(); i++)
        {
            Vehicle obj1=cars.get(i);
            if(obj1.getLicensePlate().equalsIgnoreCase(plate)){
                mens+=obj1.documents();
            }
        }
        return mens;
    }

    public String map(){
        for(int i=0; i<parking.length;i++)
        {
            for(int j=0; j<parking[0].length;j++)
            {
                    parking[j][j]=null;
            }
        }
        boolean seguir=true;
        for(int i=0; i<cars.size();i++)
        {
            Vehicle obj=cars.get(i);
            for(int j=0; j<parking[0].length && seguir==true;j++)
            {
                int columna=acColumna(obj.getModel());
                if(parking[j][columna]==null){
                    parking[j][columna]=obj;
                    seguir=false;
                }
            }
        }
        for(int i=0; i<motorcycles.size();i++)
        {
            Vehicle obj=motorcycles.get(i);
            for(int j=0; j<parking[0].length && seguir==true;j++)
            {
                int columna=acColumna(obj.getModel());
                if(parking[j][columna]==null){
                    parking[j][columna]=obj;
                    seguir=false;
                }
            }
        }
        return sMatriz();
    }

    public int acColumna(int model) {
        boolean flag=true;
        int colum=0;
        for (int i=0;i<cars.size() && flag==true;i++){
            Vehicle obj=cars.get(i);
            if(obj.getModel()<2015 && obj.isAlreadyUsed()==true){    
                if(obj.getModel()==2014){
                    colum=0;

                }else if(obj.getModel()==2013){
                    colum=1;

                }else if(obj.getModel()==2012){
                    colum=2;

                }else if(obj.getModel()==2011){
                    colum=3;

                }else if(obj.getModel()<2011){
                    colum=4;
                }
            }
        }
        return colum;
    }

    public String sMatriz(){
        String message="";
        for(int i=0; i<parking.length; i++){
            for(int j=0; j<parking[0].length; j++){
                    if(j+1<parking[0].length){
                        if(parking[i][j]!=null){
                            message+="|  Occupied |";
                        }else{ message+="|   Empty   |";}
                    }
                    else{
                        if(parking[i][j]!=null){
                            message+="|  Occupied |"+" \n";
                        }else{ message+="|   Empty   |"+" \n";}
                    }
            }
        }
        return message;
    }

    public String infomap() {
        String men="";
        for(int i=0; i<parking.length;i++)
        {
            for(int j=0; j<parking[0].length;j++)
            {
                    if(parking[i][j]!=null)
                    {
                        men+="\nThe vehicle with the plate: "+parking[i][j].getLicensePlate()+" is a model of "+parking[i][j].getModel()+" and have a cilinder capacity of: "+parking[i][j].getCilinderCapacity();
                    }
            }
        }
        boolean continu=true;
        for(int i=0; i<parking.length;i++)
        {
            for(int j=0; j<parking[0].length && continu==true;j++)
            {
                continu=false;
                men+="\n\n\n The oldest vehicle is the one with the plate "+parking[i][j];
            }
        }
        String men1="";
        for(int i=0; i<parking.length;i++)
        {
            for(int j=parking.length; j>0 && continu==true;j--)
            {
                if(parking[i][j]!=null)
                {
                    continu=false;
                    men1="\n\n\n The news vehicle is the one with the plate "+parking[i][j];
                }
            }
        }
        men+=men1;
        
        return men;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
