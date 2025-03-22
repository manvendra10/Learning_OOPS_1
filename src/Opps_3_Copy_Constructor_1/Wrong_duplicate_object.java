package Opps_3_Copy_Constructor_1;

public class Wrong_duplicate_object {

    public static void main(String[] args) {
        C_student s1 = new C_student("manvendra", 18 );
        System.out.println( " For original object s1 ------> "+ " s1.name = " +
                s1.name + "     " +
                "s1.age = " + s1.age );
        C_student duplicate_object = new C_student();
        System.out.println( " For --> duplicate_object -> before modifying the values are : --> Getting the default values...");
        System.out.println( " duplicate_object.name = "+ duplicate_object.name + "    " +
                "duplicate_object.age = " + duplicate_object.age );
        System.out.println( " After modifying the values are : ----------> ");
        duplicate_object.name = s1.name;
        duplicate_object.age = s1.age;
        System.out.println( " duplicate_object.name = "+ duplicate_object.name + "     " +
                "duplicate_object.age = " + duplicate_object.age );

    }
}

/*
<----------------stack memory ------------------>
1. frame main()
C_student s1 = @100
C_student duplicate_object = @105

<----------------Heap Memory -------------------->
s1 object is created at location @100
name = "manvendra"
age = 18

duplicate_object object is created at location @105
name = null
age = 0

For "duplicate_object object at location @105" -> the values are changed to ->
name = "manvendra"
age = 18
<----------------------------Cons of this approach --------------------------------->
Cons of this approach is --->
1. if there are lot of attributes then lot od code is repeated
2. if the attributes are private then it will not work.
3. the code will be repeated, everytime we try to duplicate an object
 */
