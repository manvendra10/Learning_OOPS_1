package Opps_2_Memory_Management_1;

public class Memory_manag_2_demo {
    public static void main(String[] args) {
        int pp = 103;
        Address_2 add = new Address_2("abc, lucknow");
        Our_Student_2 x = new Our_Student_2( "manvendra", 26, add );
        System.out.println( "hashcode of add = " +  add );
    }
}

/*
<-------------------- Stack memory-------------------------------------------->
{ main() frame }
int pp = 103
Address_2 add = @205
Our_Student_2 x = @700

<----------------------Heap memory -------------------------------------------->
1.
object add is created at address @205 ->
street = "abc, lucknow"

2.
object x is created at address @700 ->
String s_name = "manvendra"
int s_age = 26
Address_2 = @205  { here also address is saved }


 */
