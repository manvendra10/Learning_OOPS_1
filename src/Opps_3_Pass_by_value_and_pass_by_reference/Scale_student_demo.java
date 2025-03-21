package Opps_3_Pass_by_value_and_pass_by_reference;

public class Scale_student_demo {
    public static boolean check_age( int age ) {
        if( age >= 18 ) {
            return true;
        }
        return false;
    }
    public static void print_student( Scaler_student s2 ) {
        System.out.println(" in print_function...before modification :: age is  = " + s2.age );
        System.out.println(" in print_function...before modification :: name is  = " + s2.name);
        s2.age = 25;
        s2.name = " manvendra";
        System.out.println(" in print_function...after modification :: age is  = " + s2.age );
        System.out.println(" in print_function...after modification :: name is  = " + s2.name);
    }
    public static void main(String[] args) {
        int age = 18;
        // if age is >=18 then only we create the object...
        if( check_age( age) ) {
            Scaler_student s1 = new Scaler_student( age, " bhavik" );
            print_student( s1 );
            System.out.println(" in main() -> after the print_function call :: age is  = " + s1.age );
            System.out.println(" in main() -> after the print_function call :: name is  = " + s1.name );
        }
    }
}

/*
1. java is pass by value...meaning the value gets copied.
2. in primitives, the value get copied    { primitives work on copy }
3. in non-primitives, the value gets copied but the value is address. so address gets copied.

<--------------Heap memory ------------------------------>
Scaler_student object created at @300
age = 18
name = " bhavik"

age = 25             { these values are changed }
name = " manvendra"

<--------------stack memory------------------------------>
main() frame
int age = 18
Scaler_student s1 = @300

check_age() frame
int age = 18

print_student() frame
Scaler_student s2 = @300  { the value gets copied...but the value is address only }


 */
