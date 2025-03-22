package Opps_3_Inheritance_1;

public class Instructor_1 extends user_1 {
    String batch_name;
    double avg_rating;
    void schedule_class() {
        System.out.println( " Instructor is scheduling the class ");
        // user_eating_habits = " my own way";
        System.out.println( " Inside :: schedule_class... ");
        user_name = " ramesh ";
        user_role = " student";
        System.out.println( "user_name = " + user_name + "user_role = " + user_role );
    }

}
