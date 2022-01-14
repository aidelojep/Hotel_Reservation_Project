package service;

import model.Customer;

import java.util.Collection;

public class CustomerService {
    private CustomerService instance;
    private CustomerService() {
    }

    public void addCustomer(String firstName, String lastName, String email) {

    }
    public Customer getCustomer(String customerEmail) {
        return null;
    }
    public Collection<Customer> getAllCustomers (){
        return null;
    }

   public CustomerService getInstance(){
        if (instance == null){
            instance = new CustomerService();
        }
        return instance;
   }
}
