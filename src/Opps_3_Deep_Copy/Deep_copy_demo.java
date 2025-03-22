package Opps_3_Deep_Copy;

public class Deep_copy_demo {
    public static void main(String[] args) {
        // in order to create Student object....first we have to create Address object
        Address address_obj = new Address( 886 );
        Student student_org_obj = new Student( 18, address_obj );
        Student dup_obj = new Student( student_org_obj ); // calling the copy constructor...

        System.out.println( " without any changes -> student_org_obj = " );
        student_org_obj.print_details();

        System.out.println( " without any changes -> dup_obj = " );
        dup_obj.print_details();

        System.out.println( " Only updating student_org_obj.curr_address.street_no = 567 " );
        student_org_obj.curr_address.street_no = 567;

        System.out.println( " after the change -> student_org_obj = " );
        student_org_obj.print_details();

        System.out.println( " Important print out -> after the change -> dup_obj = " );
        dup_obj.print_details();

        System.out.println( " Important print -> dup_obj.curr_address.street_no = " + dup_obj.curr_address.street_no );
    }
}
