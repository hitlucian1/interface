package pack3;
import pack1.*;
import pack2.*;
class access
{
    public static void main()
    {
        System.out.println("wiht respect to ssc");
        System.out.println("*********************");
        Sbc obj1=new Sbc();
        obj1.displaydetails();
        System.out.println("");
        System.out.println("ssc.....");
        System.out.println(".......................");
        // Ssc obj2=new Ssc();
        // obj2.displaydetails();
        System.out.println("");
        System.out.println("sic........");
        System.out.println(".......................");
        Sic obj3=new Sic();
        obj3.displaydetails();
        System.out.println("");
        System.out.println("osc......");
        System.out.println(".......................");
        Osc obj4=new Osc();
        obj4.displaydetails();
        System.out.println("");
        System.out.println("oic.......");
        System.out.println("....................");
        Oic obj5=new Oic();
        obj5.displaydetails();        
    }
}