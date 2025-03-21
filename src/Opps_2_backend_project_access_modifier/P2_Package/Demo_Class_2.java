package Opps_2_backend_project_access_modifier.P2_Package;

import Opps_2_backend_project_access_modifier.P1_Package.New_Student;

public class Demo_Class_2 {
    public static void main(String[] args) {
        New_Student s3 = new New_Student();
        // explaining default access modifier
        // default access modifier members....can be accessed only within the same package...
        // default members can not be accessed outside the package
        // s3.psp = 50; // 'psp' is not public in 'Opps_2_backend_project.P1_Package.New_Student'. Cannot be accessed from outside package
        // s3.joinClass(); // 'joinClass()' is not public in 'Opps_2_backend_project.P1_Package.New_Student'. Cannot be accessed from outside package

        // explaining public access modifier....{ public member is accessible from anywhere and everywhere }
        s3.unique_email = "manvendrasingh.7777@gmail.com";
        System.out.println( "email  = " + s3.unique_email );
    }
}
