package inheritance;
import inheritance.AdvCalc;

public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();

        int r1 =obj.add(2, 3);
        int r2= obj.sub(7, 4);
        int r3 = obj.mul(3, 4);
        int r4 = obj.div(4, 2);

        System.out.println(r1 + " "+ r2 +" "+ r3+ " "+ r4);

    }
}
