package Opps_3_Deep_Copy;

public class Student {
    int age;
    Address curr_address;
    // No arg constructor...
    Student() {

    }
    // copy constructor...
    public Student( Student original ) {
        this.age = original.age;
        // this.curr_address = original.curr_address;  -> this leads to shallow copy
        this.curr_address = new Address( original.curr_address ); //---> for deep copy...this is compulsory here
    }
    // parameterised constructor...
    public Student( int age, Address curr_address ) {
        this.age = age;
        this.curr_address = curr_address; // when u use below, then comment this line
        // this.curr_address = new Address( curr_address ); // ---> this is for deep copy...for good practice..use it
    }
    // Function for printing...
    public void print_details() {
        System.out.println( " this.age = " + this.age );
        System.out.println( " this.curr_address.street_no = " + this.curr_address.street_no);
    }

}
