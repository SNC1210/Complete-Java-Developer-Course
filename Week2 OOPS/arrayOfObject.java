class student
{
    int rollNo;
    String name;
    int marks;

}

public class arrayOfObject {
    public static void main(String[] args) {
        student s1 = new student();
            s1.rollNo=1;
            s1.name="aadi";
            s1.marks=87;

        student s2 = new student();
            s2.rollNo=2;
            s2.name="aditi";
            s2.marks=79;
        
        student s3 = new student();
            s3.rollNo=3;
            s3.name="aadiaditi";
            s3.marks=98;

        student Student[] = new student[3];
        Student[0]=s1;
        Student[1]=s2;
        Student[2]=s3;

        for(int i=0; i<Student.length;i++)
        {
            System.out.println(Student[i].name+ " :" + Student[i].marks);
        }
    }
}
