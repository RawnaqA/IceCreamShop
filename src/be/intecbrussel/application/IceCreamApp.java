
package be.intecbrussel.application;
import be.intecbrussel.sellers.*;
import be.intecbrussel.eatables.*;


        public class IceCreamApp {
    public static void main(String[] args)
    {
        PriceList pricelist = new PriceList(2, 3, 5);
       IceCreamSeller salon1= new IceCreamSalon(pricelist);

        Eatable [] icecreams= new Eatable[5];

        icecreams[0]= salon1.orderIceRocket();
        icecreams[1]= salon1.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        icecreams[2]= salon1.orderCone(new Cone.Flavor[]  {Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE});
        icecreams[3]= salon1.orderCone(new Cone.Flavor[]  {Cone.Flavor.STRAWBERRY, Cone.Flavor.LEMON});
        icecreams[4]=salon1.orderMagnum(Magnum.MagnumType.ALPINENUTS);


     for(int i =0; i<icecreams.length;i++)
      icecreams[i].eat();

        System.out.println("\nThe profit = $"+salon1.getProfit());

        }
        }





