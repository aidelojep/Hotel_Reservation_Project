package model;

public class Driver {

    public static void main(String[] args) {
        Customer customer = new Customer("Peter", "Aideloje", "aidelojepeter123@gmail.com" );
        System.out.println(customer);
    }
    public String toString() {
        return "Driver{}";
    }
}
