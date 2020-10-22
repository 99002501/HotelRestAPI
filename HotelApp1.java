package com.hotelapp1.model;

public class HotelApp1 {
	String HotelName;
	Integer hotelId;
	String city;
	String cuisine;

	public HotelApp1() {
		// TODO Auto-generated constructor stub
		
		
	}

	public HotelApp1(String hotelName, Integer hotelId, String city, String cuisine) {
		super();
		HotelName = hotelName;
		this.hotelId = hotelId;
		this.city = city;
		this.cuisine = cuisine;
	}

	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	@Override
	public String toString() {
		return "HotelApp1 [HotelName=" + HotelName + ", hotelId=" + hotelId + ", city=" + city + ", cuisine=" + cuisine
				+ "]";
	}
	

}
