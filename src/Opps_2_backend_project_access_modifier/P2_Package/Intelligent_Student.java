package Opps_2_backend_project_access_modifier.P2_Package;

import Opps_2_backend_project_access_modifier.P1_Package.New_Student;

public class Intelligent_Student extends New_Student {

    public static void main(String[] args) {
//        // since main is static method....so error
//        // non-static variable full_name cannot be referenced from a static context
//        full_name = " manvendra singh "; // solution -> make full_name as static also
//        System.out.println( "from child class -> our name = " + full_name );

        Intelligent_Student i1 = new Intelligent_Student();
        i1.full_name = " manvendra singh "; // solution -> make full_name as static also
        System.out.println( "from child class -> our name = " + i1.full_name );
        // explaining public access modifier....{ public member is accessible from anywhere and everywhere }
        i1.unique_email = "manvendrasingh.2658@gmail.com";
        System.out.println( "email  = " + i1.unique_email );
    }
}
