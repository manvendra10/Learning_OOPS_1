package Opps_3_Deep_Copy;

public class Address {
    int street_no;

    // No arg constructor...
    public Address() {

    }
    // Parameterised constructor...
    public Address( int street_no) {
        this.street_no = street_no;
    }
    // this is copy constructor....
    public Address( Address obj ) {
        this.street_no = obj.street_no;
    }

}
