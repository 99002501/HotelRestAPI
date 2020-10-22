package com.hotelapp1.service;

import java.util.List;

import com.hotelapp1.model.HotelApp1;

public interface HotellApp1Service {
	List<HotelApp1> getAllHotels();
	List<HotelApp1> getHotelName(String HotelName);
	List<HotelApp1> getCity(String city);
	List<HotelApp1> getCuisine(String cuisine);
	HotelApp1 getHotelId(int id);
}
