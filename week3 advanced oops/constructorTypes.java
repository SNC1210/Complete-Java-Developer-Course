class Human{
    private int age;
    private String name;

    public Human() //default constructor
    {
        age=12;
        name="john";
    }
    public Human(int age, String name) {  //parameterized constructor
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}


public class constructorTypes {

    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(26, "aadi");
        obj.setAge(25);
        obj.setName("aditi");
        System.out.println(obj.getAge()+ " : "+ obj.getName());
        System.out.println(obj1.getAge()+ " : "+ obj1.getName());
    }
     
}