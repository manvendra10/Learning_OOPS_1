package Opps_3_Copy_Constructor_1;

public class Wrong_duplicate_object {

    public static void main(String[] args) {
        C_student s1 = new C_student("manvendra", 18 );
        C_student duplicate_object = new C_student();
        duplicate_object.name = s1.name;
        duplicate_object.age = s1.age;


    }
}
