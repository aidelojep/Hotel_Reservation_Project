package api;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class HotelResource {

    private HotelResource instance;
    List<Reservation> reservation;
    private HotelResource() {
    }
    public Customer getCustomer(String email){
        return null;
    }
    public void createACustomer(String firstName, String lastName, String email){

    }
    public IRoom getRoom(String roomNumber){
        return null;
    }
    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate){
    return null;
    }

    public HotelResource getInstance(){
        if (instance == null){
            instance = new HotelResource();
        }
        return instance;
    }

    public List<Reservation> getCustomersReservations(String customerEmail) {
        return reservation;
    }
    public Collection<IRoom> findARoom(Date checkIn, Date checkOut){
        return null;
    }
}
