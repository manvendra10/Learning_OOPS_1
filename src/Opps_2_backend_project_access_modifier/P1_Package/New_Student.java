package Opps_2_backend_project_access_modifier.P1_Package;

public class New_Student {
    // class has 2 members --> attributes and behaviours
    // first -> age,psp,name are attributes
    private int age;
    // explaining default access modifier
    float psp;      // default attribute....so we can access them within the same package
    // static protected String full_name; // protected attribute....{ access them within the same package + child class can access it }
    protected String full_name; // protected attribute....{ access them within the same package + child class can access it }
    public String unique_email; // public member is accessible from anywhere and everywhere.

    // Behaviours or methods
    // This is our getter and setter.....
    public int getAge() {
        return age;
    }
    public void setAge( int age ) {
        this.age = age;
    }
    // explaining default access modifier
    void changeBatch() {
        // explaining private access modifier
        age = age + 1; // here we can access age...though age is private but within the same class we can access it
        System.out.println( "changing the batch ");
    }
    // explaining default access modifier
    void joinClass() {
        System.out.println( "yeyyy !!! i am joining the class ");
    }
    // explaining private access modifier
    private void printDetails() {
        System.out.println( "Name: " + full_name );
        System.out.println( "Age: " + age );
        System.out.println( "Psp: " + psp );
    }

}
