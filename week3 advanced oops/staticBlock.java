class mobile
{
    static String name;
    String brand;
    String network;
    int price;

    //Static block : this block is called once when ever the object is created and is shared among all the objects.

    static {
        name= "Phone";
        System.out.println("in static block");
    }

    //constructor
    public mobile()
    {
        brand="";
        price=1200;
        System.out.println("in constructor block");
    }

}

class mobilePhone
{
    static String name;
    String brand;
    String network;
    int price;

    static{
        name="smartphone";
        System.out.println("in static block of mobilephone class");
    }

    public mobilePhone()
    {
        brand="";
        price=120000;
        System.out.println("in constructor of mobilephone class");
    }
}

public class staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        //creating an object 
        mobile obj1 = new mobile();
        mobile obj2 = new mobile();
        obj1.brand="apple";
        obj1.price=12000;
        //o/p:
        /*
         * in static block
           in constructor block
           in constructor block

           //this had happened here twice because two objects are created and when object created the constructor will run. but static bloc will run only once.
         */

         //Now for new class mobilephone we are not creating any object so here we get only below o/p:
         /*
          * in static block
            in constructor block
            in constructor block
          */
          //if we want to get the classloader to get added in the we need to call the classname wth Class.forName("mobilePhone") way as follows:

          //callling with class 
          Class.forName("mobilePhone");

          /*
           * o/p:
           * in static block
             in constructor block
             in constructor block
             in static block of mobilephone class
           */
    }
}
