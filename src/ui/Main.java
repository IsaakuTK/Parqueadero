package ui;
import java.util.Scanner;
import model.*;
import java.util.ArrayList;

public class Main {
    public final static int MAX=100;
    public static Scanner lt = new Scanner(System.in);
    public static void main (String[] args){
        Company obj = Company(); 
        boolean s= true;
        while(s==true)
        {
            System.out.println("What you wanna do: \n1.Register vehicle \n2.Calculate the total price \n3.Generate info of the cars \n4.Condition of the documents \n5.Map of the parking lot \n6.Parking lot occupancy reports");    
            int a=lt.nextInt();
            lt.nextLine();
            if(a==1)
            {
                regiterVehicle(obj);
            }
            else if(a==2)
            {
                totalprice(obj);
            }
            else if(a==3)
            {
                info(obj);
            }
        }
    }

    public static Company Company(){
        System.out.println("Company name: ");
        String name=lt.nextLine();

        Company a=new Company(name);
        return a;
    }
    public static void regiterVehicle(Company v)
    {
        int matriz[][] = new int[4][4];

        for(int i=0;i<matriz.length;i++)
            {
                for(int j=0;j<matriz[0].length;j++)
                {
                    matriz[i][j]=(int)(Math.random() * 50 + 1);
                }
            }

        System.out.println("Base price: ");
        double bprice=lt.nextDouble();
        lt.nextLine();

        double sprice=0;

        System.out.println("Car brand: ");
        String brand=lt.nextLine();
        System.out.println("Car model: ");
        String model=lt.nextLine();
        System.out.println("Cylinder capacity: ");
        double cylinder=lt.nextDouble();
        lt.nextLine();;
        System.out.println("Traveled mileage: ");
        double mileage=lt.nextDouble();
        lt.nextLine();
        System.out.println("1.New vehicle / 2.Used vehicle: ");
        int an=lt.nextInt();
        lt.nextLine();
        boolean used=true;
        if(an==1)
        {
            used=false;
        }
        else if(an==2)
        {
            used=true;
        }
        System.out.println("License plate: ");
        String plate=lt.nextLine();
        
        System.out.println("Is a: 1.car / 2.motorcycle");
        int ans=lt.nextInt();
        lt.nextLine();
        if(ans==1)
        {
            System.out.println("Type of car 1.sedan 2.pickuptruck: ");
            int typeC=lt.nextInt();
            lt.nextLine();
            System.out.println("Number of doors: ");
            int doors=lt.nextInt();
            lt.nextLine();
            System.out.println("polarized windows: 1.yes / 2.no");
            int l=lt.nextInt();
            lt.nextLine();
            boolean polarized=false;
            if(l==1)
            {
                polarized=true;
            }
            else if(an==2)
            {
                polarized=false;
            }
            System.out.println("Type of car: 1.gasoline / 2.electrinic / 3.hybrid");
            int tipoc=lt.nextInt();
            lt.nextLine();
            if(tipoc==1)
            {
                System.out.println("Capacity of gasoline");
                double capacityg=lt.nextDouble();
                System.out.println("Type of gasoline: 1.extra / 2.corriente / 3.diesel");
                int tipog=lt.nextInt();
                lt.nextLine();
                double consumeg=capacityg*(cylinder/150);
 
                System.out.println("Regist documents 1.yes / 2.no");
                int re=lt.nextInt();
                double prid=0;
                int year=0;
                String image="";
                double prid2=0;
                int year2=0;
                String image2="";

                if(re==1)
                {
                    System.out.println("What documents you wanna regist: 1.SOAT / 2.Tehnomechanic");
                    int doc=lt.nextInt();
                    if(doc==1)
                    {
                    System.out.println("Price: ");
                    prid=lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Year: ");
                    year=lt.nextInt();
                    lt.nextLine();
                    System.out.println("Image");
                    image=lt.nextLine();
                    }
                    else if(doc==2)
                    {
                    System.out.println("Price: ");
                    prid2=lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Year: ");
                    year2=lt.nextInt();
                    lt.nextLine();
                    System.out.println("Image");
                    image2=lt.nextLine();
                    }
                    
                }
                System.out.println(v.regVehicle(bprice,sprice,brand,model,cylinder,mileage,used,plate,capacityg,tipog,consumeg,typeC,doors,polarized,prid,year,image,matriz,prid2,year2,image2,tipoc));
            }
            else if(tipoc==2)
            {
                System.out.println("Type of charger: 1.fast / 2.normal");
                int tipoch=lt.nextInt();
                lt.nextLine();
                System.out.println("Battery Duration (per Km): ");
                double batteryd=lt.nextDouble();
                double batteryc=0;
                if(tipoch==1)
                {
                    batteryc=(batteryd+13)*(cylinder/100);
                }
                else if(tipoch==2)
                {
                    batteryc=(batteryd+18)*(cylinder/100);
                }
                System.out.println("Regist documents 1.yes / 2.no");
                int re=lt.nextInt();
                double prid=0;
                int year=0;
                String image="";
                double prid2=0;
                int year2=0;
                String image2="";

                if(re==1)
                {
                    System.out.println("What documents you wanna regist: 1.SOAT / 2.Tehnomechanic");
                    int doc=lt.nextInt();
                    if(doc==1)
                    {
                    System.out.println("Price: ");
                    prid=lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Year: ");
                    year=lt.nextInt();
                    lt.nextLine();
                    System.out.println("Image");
                    image=lt.nextLine();
                    }
                    else if(doc==2)
                    {
                    System.out.println("Price: ");
                    prid2=lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Year: ");
                    year2=lt.nextInt();
                    lt.nextLine();
                    System.out.println("Image");
                    image2=lt.nextLine();
                    }
                    
                }
                System.out.println(v.regVehicle(bprice,sprice,brand,model,cylinder,mileage,used,plate,tipoch,batteryd,batteryc,typeC,doors,polarized,prid,year,image,matriz,prid2,year2,image2,tipoc));
                
            }
            else if(tipoc==3)
            {
                System.out.println("Capacity of gasoline");
                double capacityg=lt.nextDouble();
                System.out.println("Type of gasoline: 1.extra / 2.corriente / 3.diesel");
                int tipog=lt.nextInt();
                lt.nextLine();
                double consumeg=capacityg*(cylinder/180);
                System.out.println("Type of charger: 1.fast / 2.normal");
                int tipoch=lt.nextInt();
                lt.nextLine();
                System.out.println("Battery Duration (per Km): ");
                double batteryd=lt.nextDouble();
                double batteryc=0;
                if(tipoch==1)
                {
                    batteryc=batteryd*(cylinder/200);
                }
                else if(tipoch==2)
                {
                    batteryc=(batteryd+7)*(cylinder/200);
                }
                System.out.println("Regist documents 1.yes / 2.no");
                int re=lt.nextInt();
                double prid=0;
                int year=0;
                String image="";
                double prid2=0;
                int year2=0;
                String image2="";

                if(re==1)
                {
                    System.out.println("What documents you wanna regist: 1.SOAT / 2.Tehnomechanic");
                    int doc=lt.nextInt();
                    if(doc==1)
                    {
                    System.out.println("Price: ");
                    prid=lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Year: ");
                    year=lt.nextInt();
                    lt.nextLine();
                    System.out.println("Image");
                    image=lt.nextLine();
                    }
                    else if(doc==2)
                    {
                    System.out.println("Price: ");
                    prid2=lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Year: ");
                    year2=lt.nextInt();
                    lt.nextLine();
                    System.out.println("Image");
                    image2=lt.nextLine();
                    }
                    
                }
                System.out.println(v.regVehicle(bprice,sprice,brand,model,cylinder,mileage,used,plate,capacityg,tipog,consumeg,typeC,doors,polarized,tipoch,batteryd,batteryc,prid,year,image,matriz,prid2,year2,image2,tipoc));

        }
        else if(ans==2)
        {
            System.out.println("Type of motorcycle: 1.standar / 2.sport / 3.scooter / 4.cross");
            int motrocyclet=lt.nextInt();
            System.out.println("Capacity of gasoline: ");
            double capacityg=lt.nextDouble();
            double consumeg=capacityg*(cylinder/75);
            System.out.println("Regist documents 1.yes / 2.no");
                int re=lt.nextInt();
                double prid=0;
                int year=0;
                String image="";
                double prid2=0;
                int year2=0;
                String image2="";

                if(re==1)
                {
                    System.out.println("What documents you wanna regist: 1.SOAT / 2.Tehnomechanic");
                    int doc=lt.nextInt();
                    if(doc==1)
                    {
                    System.out.println("Price: ");
                    prid=lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Year: ");
                    year=lt.nextInt();
                    lt.nextLine();
                    System.out.println("Image");
                    image=lt.nextLine();
                    }
                    else if(doc==2)
                    {
                    System.out.println("Price: ");
                    prid2=lt.nextDouble();
                    lt.nextLine();
                    System.out.println("Year: ");
                    year2=lt.nextInt();
                    lt.nextLine();
                    System.out.println("Image");
                    image2=lt.nextLine();
                    }
                    
                }
            System.out.println(v.regVehicle(bprice,sprice,brand,model,cylinder,mileage,used,plate,motrocyclet,capacityg,consumeg,prid,year,image,matriz,prid2,year2,image2));
        }
    }
        
    }
    
    public static void totalprice(Company v)
    {
        System.out.println("plate of the vehicle: ");
        String pl=lt.nextLine();
        System.out.println(v.totalprice(pl));
    }

    public static void info(Company v)
    {
        System.out.println(v.infoV());
    }
}