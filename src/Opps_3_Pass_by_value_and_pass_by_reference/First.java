package Opps_3_Pass_by_value_and_pass_by_reference;

import java.util.ArrayList; // for arraylist...we need to import this

/*
1. java is pass by value only.
2. in case of Primitives -> value is passed and copy gets created.
2. in case of non-primitives -> value is passed but here the value is address only.
{ since the value is address only -> so address is passed }
so, in case of non-primitives -> the address is passed....so the original object get impacted by any change.

Java is technically pass by value only
1. for primitives -> the value gets copied into the parameter.
2. for non-primitives -> the value gets copied but the value is address

 */
public class First {
    public static void modify_array ( ArrayList<Integer> arr ) {
        arr.add( 4 );
        arr.add( 5 );
        System.out.println( " Inside modify()...value of arr array = "+ arr );
    }
    public static void modify( int x ) {
        int b = x + 2;
        System.out.println( " Inside modify()...value of b = "+ b );
    }
    public static void main(String[] args) {
        // b is primitive
        int b = 5;
        System.out.println( " before calling modify()...value of b = "+ b );
        modify( b );
        System.out.println( " after calling modify()...value of b = "+ b );
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add( 1 );
        ans.add(2);
        ans.add(3);
        System.out.println( " before calling modify_array()...value of ans array = "+ ans );
        modify_array( ans );
        System.out.println( " after calling modify_array()...value of ans array = "+ ans );
    }
}

/*
stack memory ->
1. frame main()
int b = 5
ArrayList<Integer> ans = @200

2. frame modify()
int x = 5
int b = 7

3. frame modify_array()
ArrayList<Integer> arr = @200

 */