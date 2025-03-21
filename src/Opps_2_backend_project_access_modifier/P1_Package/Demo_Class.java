package Opps_2_backend_project_access_modifier.P1_Package;

public class Demo_Class {
    public static void main(String[] args) {
        New_Student a = new New_Student();
        // explaining private access modifier
        // a.age = 80; // age' has private access in 'Opps_2_backend_project.P1_Package.New_Student'
        // a.printDetails(); // printDetails()' has private access in 'Opps_2_backend_project.P1_Package.New_Student'
        // explaining default access modifier
        a.psp = 50;
        System.out.println( "psp  = " + a.psp );
        a.joinClass();
        // explaining protected access modifier...{ accessible within the same package + child classes }
        a.full_name = "shalini singh";
        System.out.println( "full_name  = " + a.full_name );
        // explaining public access modifier....{ public member is accessible from anywhere and everywhere }
        a.unique_email = "manvendra.2501@gmail.com";
        System.out.println( "email  = " + a.unique_email );

    }
}
