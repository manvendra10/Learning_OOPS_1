package Opps_3_Shallow_Copy;

public class shallow_copy_demo {
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
/*
--------------------------------------------------------------------------------------------------------------
1. A shallow copy will only copy the primitive attributes properly.
2. Shallow copy will not create new objects in case of non-primitives.
3. In Shallow copy -> for non-primitives, we store the same reference as the original
so, in case we change in the value for the original non-primitives -> then the value will also change in copy
4. But shallow copy, normally works fine...since they create copy
{ though, non-primitives don't have exact new copy }
Since creating a deep copy is generally difficult....if level is large
 */

/*
-------------------------------------------------------------------------------------------------------------
Stack Memory -->
Address address_obj = @ 1000
Student student_org_obj = @ 1050
Student dup_obj = @ 1070

Heap Memory --->
1. Address address_obj is created at @ 1000
street_no = 886

2. Student student_org_obj is created at @1050
age = 18
curr_address = @ 1000

3. Student dup_obj is created at @1070
age = 18
curr_address = @ 1000
--------------------------------------------------------------------------------------------------------------
when u write -> student_org_obj.curr_address.street_no = 567;
then ->

Stack Memory -->
Address address_obj = @ 1000
Student student_org_obj = @ 1050
Student dup_obj = @ 1070

Heap Memory --->
1. Address address_obj is created at @ 1000
street_no = 567

student_org_obj.curr_address.street_no = 567;
goto student_org_obj -> goto curr_address -> get street_no
goto @1050 -> goto @1000 -> then change street_no = 567

2. Student student_org_obj is created at @1050
age = 18
curr_address = @ 1000

3. Student dup_obj is created at @1070
age = 18
curr_address = @ 1000

dup_obj.curr_address.street_no = ? ? ?
goto dup_obj -> goto curr_address -> get street_no
goto @1070 -> goto @1000 -> then get the street_no => street_no = 567
---------------------------------------------------------------------------------------------------------------

 */
