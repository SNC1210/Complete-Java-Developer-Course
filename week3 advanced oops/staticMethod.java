class mobile
{
    static String name;
    String brand;
    int price;

    static 
    {
        name="Smartphone";
        System.out.println("in static block");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
        System.out.println("In Non Static method");

    }

    public static void show1(mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : "+ name );//here we can use static variable in static method but to call non static  variable we have to specify the variable where ist calling from
        System.out.println("in static method "); 
    }

}

public class staticMethod {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        mobile obj2 = new mobile();

        obj1.brand="apple";
        obj1.price=12000;

        obj2.brand="samsung";
        obj2.price=1200000;

        obj1.show();
        obj2.show();

        //obj1.show1(obj2); this can be done but not recommended

        mobile.show1(obj1);
        mobile.show1(obj2);

    }
}
