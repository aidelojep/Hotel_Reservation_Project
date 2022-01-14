package api;

import model.Customer;
import model.IRoom;

import java.util.Collection;
import java.util.List;

public class AdminResource {
    private AdminResource instance;
    private AdminResource() {
    }
    public Customer getCustomer(String email){
        return null;
    }
    public void addRoom(List<IRoom> rooms){

    }
    public Collection<IRoom> getAllRooms(){
        return null;
    }
    public Collection<Customer> getAllCustomer(){
        return null;
    }
    public void displayAllReservations(){

    }


    public AdminResource getInstance(){
        if (instance == null){
            instance = new AdminResource();
        }
        return instance;
    }
}
