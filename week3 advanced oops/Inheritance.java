public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 =obj.add(2, 3);
        int r2= obj.sub(7, 4);
        int r3 =obj.mul(3,4);
        int r4 = obj.div(4, 2);
        double r5 = obj.pow(4,2);

        System.out.println(r1 + " "+ r2 +" "+ r3+ " "+ r4+ " "+ r5);

    }
}
