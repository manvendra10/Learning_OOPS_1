package Opps_2_Memory_Management_1;

public class Memory_management_demo {
    public static void main(String[] args) {
        // Primitives
        boolean flag = true;
        int x = 123;
        // Non-Primitives
        // because of new keyword -> memory is allocated to the object...memory is allocated inside the heap memory
        Product a = new Product();
        Product b = new Product("laptop", 50 );
        System.out.println( "object a's hashcode = " + a );
        System.out.println( "object b's hashcode = " + b );

    }
}

/*
In the stack memory ->
{ within main() frame }
boolean flag = true
int x = 123
Product a = @105    { object's address is stored inside stack memory }
product b = @109    { object's address is stored inside stack memory }

{ in stack, the variable "a" stores the address of the object to which "a" points to }
{ "a" is just a reference variable which points to object created on heap and the object is created in heap at address 105 }

{ in stack, the variable "b" stores the address of the object to which "b" points to }
{ "b" is just a reference variable which points to object created on heap and the object is created in heap at address 109 }

In the heap memory ->
1. object "a" is created at heap memory at @105....this object stores the class attributes
product_name = "abc"
quantity = 1
2. object "b" is created at heap memory at @109....this object stores the class attributes
product_name = "laptop"
quantity = 50



 */

/*
1. in java, all the objects are stored inside the heap memory.
2. Objects are stored inside the heap and their address is stored inside stack memory.
3. Primitives are directly stored inside the stack memory
4. String pool is stored inside the heap....since String pool is collection of String objects
5. An object will be removed from heap -> when no one is referencing it, then it is marked by garbage collection

 */