package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ReservationService {
    private List<Reservation> reservationList;
    private ReservationService instance;

    private ReservationService() {
    }

    public void addRoom(IRoom room){

    }
    public IRoom getARoom(String roomId){
        return null;

    }
    public Reservation reserveARoom(Customer customer, IRoom room, Date CheckInDate, Date CheckOutDate){
        return null;

    }
    public Collection<IRoom> findRooms(Date CheckInDate, Date CheckOutDate){
        return null;
    }
    public void printAllReservations(){

    }
    public ReservationService getInstance(){
        if (instance == null){
            instance = new ReservationService();
        }
        return instance;
    }
}
