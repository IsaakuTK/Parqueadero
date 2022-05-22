package model;
import java.util.ArrayList;
public class Company {

    private String name;
    private ArrayList <Car> cars;
    private ArrayList <Motorcycle> motorcycles;


    public Company(String name) {
        this.name = name;
        cars = new ArrayList <Car> ();
        motorcycles = new ArrayList <Motorcycle> ();
    }    

    public String regVehicle(double bprice, double sprice, String brand, String model, double cylinder, double mileage, boolean used, String plate, double capacityg, int tipog, double consumeg, int typeC, int doors, boolean polarized, double prid, int year, String image, int[][]matriz, double prid2, int year2, String image2, int tipoc)
    {
        String m="";
        if(existP(plate)==false)
        {
                cars.add(new Gasoline(used,bprice,sprice,brand,model,cylinder,mileage,plate,typeC,doors,polarized,capacityg,consumeg,tipog,prid,year,image,matriz,prid2,year2,image2,tipoc));
                m="Vehicle registered";
        }
        else{
            m="Vehicle already exist";
        }
        return m;
    }

    public String regVehicle(double bprice, double sprice, String brand, String model, double cylinder, double mileage, boolean used, String plate, int typech, double batteryd, double batteryc, int typeC, int doors, boolean polarized, double prid, int year, String image, int[][]matriz, double prid2, int year2, String image2, int tipoc)
    {
        String m="";
        if(existP(plate)==false)
        {
                cars.add(new Electric(used,bprice,sprice,brand,model,cylinder,mileage,plate,typeC,doors,polarized,batteryd,batteryc,typech,prid,year,image,matriz,prid2,year2,image2,tipoc));
                m="Vehicle registered";
        }
        else{
            m="Vehicle already exist";
        }
        return m;
    }

    public String regVehicle(double bprice, double sprice, String brand, String model, double cylinder, double mileage, boolean used, String plate, double capacityg, int tipog, double consumeg, int typeC, int doors, boolean polarized, int typech, double batteryd, double batteryc, double prid, int year, String image, int[][]matriz, double prid2, int year2, String image2, int tipoc)
    {
        String m="";
        if(existP(plate)==false)
        {
                cars.add(new Hybrid(used,bprice,sprice,brand,model,cylinder,mileage,plate,typeC,doors,polarized,capacityg,consumeg,tipog,batteryd,batteryc,typech,prid,year,image,matriz,prid2,year2,image2,tipoc));
                m="Vehicle registered";
        }
        else{
            m="Vehicle already exist";
        }
        return m;
    }

    public String regVehicle(double bprice, double sprice, String brand, String model, double cylinder, double mileage, boolean used, String plate, int motrocyclet, double capacityg, double consumeg, double prid, int year, String image, int[][]matriz, double prid2, int year2, String image2)
    {
        String m="";
        if(existP(plate)==false)
        {
                motorcycles.add(new Motorcycle(used,bprice,sprice,brand,model,cylinder,mileage,plate,motrocyclet,capacityg,consumeg,prid,year,image,matriz,prid2,year2,image2));
                m="Vehicle registered";
        }
        else{
            m="Vehicle already exist";
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
        String men="Cars:";
        for(int i=0; i<cars.size(); i++)
        {
            Vehicle obj1=cars.get(i);
            if(obj1!=null)
            {
                men+="\n Type of car: "+cars.get(i).getTypeCar()+" type of fuel: "+" el vehiculo tiene un estado de usado: "+cars.get(i).isAlreadyUsed();
            }
        }

        for(int i=0; i<motorcycles.size(); i++)
        {
            Vehicle obj2=motorcycles.get(i);
            if(obj2!=null)
            {
                men+=" Motorcycles: \n Type of motorcycle: "+motorcycles.get(i).getTypemoto()+" type of fuel: "+" el vehiculo tiene un estado de usado: "+motorcycles.get(i).isAlreadyUsed();
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
                for(int j=0; j<obj1.getDocuments().size();j++)
                if(obj1.getDocuments().get(j)==null)
                {
                    obj1.setSellPrice(500000);
                    
                }
                if(obj1.getTipoc()==1)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+obj1.getBasePrice());
                }
                else if(obj1.getTipoc()==2)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.20));
                }
                else if(obj1.getTipoc()==3)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.15));
                }
                if(obj1.getAlreadyUsed()==true)
                {
                    obj1.setSellPrice(obj1.getSellPrice()-(obj1.getSellPrice()*0.10));
                }
                if(obj1.getTipoc()==0)
                {
                    obj1.setSellPrice(obj1.getSellPrice()+(obj1.getBasePrice()*1.04));
                    if(obj1.getAlreadyUsed()==true)
                    {
                        obj1.setSellPrice(obj1.getSellPrice()-(obj1.getSellPrice()*0.02));
                    }
                }
                mens="The price of the vehicle is: "+obj1.getSellPrice();
            }
        }
        return mens;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
