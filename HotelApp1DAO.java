package com.hotelapp1.dao;
import java.util.List;
import com.hotelapp1.model.HotelApp1;

public interface HotelApp1DAO {
	List<HotelApp1> getHotelName(String HotelName);
	List<HotelApp1> getCity(String city);
	List<HotelApp1> getCuisine(String cuisine);
	HotelApp1 getHotelId(int id);
	List<HotelApp1> getAllHotels();
	
	

}
