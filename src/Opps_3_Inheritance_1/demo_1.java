package Opps_3_Inheritance_1;

public class demo_1 {
    public static void main(String[] args) {
        Instructor_1 i = new Instructor_1();
        i.batch_name = " academy_begineer batch";
        i.schedule_class();
        i.user_name = " manvendra ";
        i.user_role = " instructor ";
        System.out.println(" i.batch_name = "+ i.batch_name );
        System.out.println(" i.user_name = "+ i.user_name );
        System.out.println(" i.user_role = "+ i.user_role );
        i.login();
        // i.user_eating_habits = " my style of eating";
    }
}
