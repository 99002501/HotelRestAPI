package com.hotelapp1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp1.model.HotelApp1;
import com.hotelapp1.service.HotellApp1Service;



@RestController
public class HotelController {
	@Autowired
     HotellApp1Service hotelService;
	 @GetMapping("/hotels")
	 public List<HotelApp1> showAllBooks(){
		 return  hotelService.getAllHotels();
			 
	}
	 @GetMapping("/hotel-by-city/{city}")
	 public List<HotelApp1> showHotelByCity(@PathVariable("city")String city){
		 return  hotelService.getCity(city);
			 
	}
	 @GetMapping("/hotels-by-cuisine/{cuisine}")
	 public List<HotelApp1> showHotelByCuisine(@PathVariable("cuisine")String cuisine){
		 return  hotelService.getCuisine(cuisine);
			 
	}
	 @GetMapping("/hotels-by-Id/{hotelId}")
	HotelApp1 showHotelById(@PathVariable("hotelId")int id){
		 return  hotelService.getHotelId(id);
			 
	}
}
