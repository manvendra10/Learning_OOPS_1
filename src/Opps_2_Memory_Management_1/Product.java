package Opps_2_Memory_Management_1;

/*
There are 2 important memory created when some code is executed...
1. stack memory
2. heap memory
Java divides its memory in 2 things -> stack and heap

stack memory ->
1. stack is nothing but function stack
2. main() calls -> func1() -> func2()  => once func2() done -> go back to func1() -> go back to main()
3. In stack, ur function related information is getting stored.


heap memory ->
1. it is collection of objects
2. whatever objects u create, they are getting stored inside the heap


 */

public class Product {
    String product_name;
    int quantity;
    public Product() {
        this.product_name = "abc";
        this.quantity = 1;
    }
    public Product(String product_name, int quantity) {
        this.product_name = product_name;
        this.quantity = quantity;
    }
}
