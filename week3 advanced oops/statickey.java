class mobile {
    static String name;
    String brand;
    int price;
    String network;


    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class statickey{
    public static void main(String args[])
    {
        mobile.name="phone";// static variable is called with the classname always


//Static variable is always created once and is called when ever object is created, if object is not created it will not get insantiated.
//static variable i shared with all teh object and can be called with the classname.
        
       mobile obj1 = new mobile();
        obj1.brand="apple";
        // obj1.name="smartphone";//we can also call the static variable with object but best practice is to call with classname
        obj1.price=17000;

        mobile obj2= new mobile();
        obj2.brand="samsung";
        //obj2.name="smartphone";
        obj2.price=15000;

        obj1.show();
        obj2.show();

    }
}
