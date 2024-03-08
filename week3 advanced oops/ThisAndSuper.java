class A {
//class A extends Object {// every parent class or class will extends an Object Class (important interview question)
    public A(){
        super();//every costructor is having bydefault super(); method : which will call theconstructor of super class which is default unless its not manipulated in the code.
        System.out.println("in default constructor A");
    }

    public A(int n)
    {
        //super();//be default it will be here if we not specify
        System.out.println("in INT A parameterized constructor");
    }
}

class B extends A{//here B is the child class and will extends A super class 

    public B()//default constructor
    {
        //super();
        super(5);//this is to call the super class parameterized constructor
        System.out.println("in B defalt constructor");
    }

    public B(int n)
    {
        this();//this() is the method which call the cosntructor of the same class
        //this(5); // this is manipualted way to call the parameterized constructor
        System.out.println("in B parameteterized constructor");
    }
}


public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
