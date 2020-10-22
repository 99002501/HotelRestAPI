package com.hotelapp1.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp1.model.HotelApp1;
@Service
public class HotelApp1DAOImpl implements HotelApp1DAO {

	public HotelApp1DAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<HotelApp1> getHotelName(String HotelName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<HotelApp1> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}
	@Override
	public List<HotelApp1> getCity(String city) {
		// TODO Auto-generated method stub
		List<HotelApp1> newHotelList=new ArrayList<>();
		for(HotelApp1 hotel:showHotelList())
		{
		if(hotel.getCity().equals(city))
		newHotelList.add(hotel);
		}
		return newHotelList;
		}
		

	@Override
	public List<HotelApp1> getCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<HotelApp1> newHotelList=new ArrayList<>();
		for(HotelApp1 hotel:showHotelList())
		{
		if(hotel.getCuisine().equals(cuisine))
		newHotelList.add(hotel);
		}

		return newHotelList;
		}
		
	

	@Override
	public HotelApp1 getHotelId(int id) {
		// TODO Auto-generated method stub
		for(HotelApp1 hotel:showHotelList()) {
			if(hotel.getHotelId()==id)
			return hotel;
			}
			return null;
			}
	
	
	
	private List<HotelApp1> showHotelList(){
		return Arrays.asList(
				new HotelApp1("aryas",100,"coimbatore","Chinese"),
				new HotelApp1("shabana hotel",200,"mysore","Indian"),
				new HotelApp1("monika dabar",300,"sandeppani","mexican"),
				new HotelApp1("rayapas",400,"salem","indian"));
				
	}

	

}
