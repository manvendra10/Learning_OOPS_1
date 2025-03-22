package Opps_3_Shallow_Copy;

public class Student {
    int age;
    Address curr_address;
    Student() {

    }
    // copy constructor...
    public Student( Student original ) {
        this.age = original.age;
        this.curr_address = original.curr_address;
    }
    // parameterised constructor
    public Student( int age, Address curr_address ) {
        this.age = age;
        this.curr_address = curr_address;
    }
    public void print_details() {
        System.out.println( " this.age = " + this.age );
        System.out.println( " this.curr_address.street_no = " + this.curr_address.street_no);
    }
}
