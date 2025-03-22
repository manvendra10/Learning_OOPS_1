package Opps_3_Copy_Constructor_1;

public class Copy_constructor_demo_2 {
    public static void main(String[] args) {
        C_student c1 = new C_student( "Shalini", 20 );
        // copy constructor -> this is going to work very well...even well with private attributes...
        Copy_student_2 m2 = new Copy_student_2( c1 );
        m2.print_details();

    }
}

/*
With copy constructor -> we create exact duplicate

stack memory -->
1. C_student c1 = @ 100
2. Copy_student_2 m2 = @105  ( here we pass @100 )

heap memory -->
1. c1 object is created at @ 100
name = shalini
age = 20

2. m2 object is created at @ 105
name = shalini
age = 20

 */
