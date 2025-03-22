package Opps_3_Copy_Constructor_1;

public class Copy_student_2 {
    String name;
    int age;

    public Copy_student_2() {
    }
    // this is normal parameterised constructor....
    public Copy_student_2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // this is our copy constructor....
    public Copy_student_2( C_student original ) {
        this.name = original.name;
        this.age = original.age;
    }
    public void print_details( ) {
        System.out.println( " in copy student....");
        System.out.println( " name = " + this.name );
        System.out.println( " age = " + this.age );
    }
}
