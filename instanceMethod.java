class Student {
    public void name_student(String name){
        System.out.printf("The name of the student is ", name);
        System.out.println();
    }

    public void student_grade(double g){
        System.out.printf("The student grade is %f", g);
        System.out.println();

    }
}
public class instanceMethod{
    public static void main(String [] args){
        //create first student
        Student student1=new Student();
        student1.name_student("Tunde");
        student1.student_grade(90.5);

        //create second student
        Student student2= new Student();
        student2.name_student("Chukwuma");
        student2.student_grade(69.0);




    }
}