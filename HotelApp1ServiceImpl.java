package com.hotelapp1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp1.dao.HotelApp1DAO;
import com.hotelapp1.model.HotelApp1;
@Service
public class HotelApp1ServiceImpl implements HotellApp1Service {
	@Autowired
	HotelApp1DAO hotelApp1Dao;

	public HotelApp1ServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<HotelApp1> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelApp1Dao.getAllHotels();
	}
	@Override
	public List<HotelApp1> getHotelName(String HotelName) {
		// TODO Auto-generated method stub
		return hotelApp1Dao.getHotelName(HotelName);
	}
	@Override
	public List<HotelApp1> getCity(String city) {
		// TODO Auto-generated method stub
		return hotelApp1Dao.getCity(city);
	}
	@Override
	public List<HotelApp1> getCuisine(String cuisine) {
		// TODO Auto-generated method stub
		return hotelApp1Dao.getCuisine(cuisine);
	}
	@Override
	public HotelApp1 getHotelId(int id) {
		// TODO Auto-generated method stub
		return hotelApp1Dao.getHotelId(id);
	}

}
