public class StudentArray {
    public static void main(String [] args){

        String [] student_names= new String[]{"Josh","olatunde","Adeshina","Carol","Adrianna","Ariadna"};
        double [] student_grade= new double []{0.0,30.5,99.2,80.0,56.9,39.0};
        String [] course;
        course = new String[6];
        course[0]="Biology";
        course[1]="IT";
        course[2]="Further Mathematics";
        course[3]="Yoruba";
        course[4]="Chemistry";
        course[5]="Politics";

        System.out.println(student_names[1]);
        System.out.println(student_names[0]);
        System.out.println(student_grade[1]);
        System.out.println(student_grade[3]);
        System.out.println(course[3]);
        System.out.println(course[1]);

    }
}
