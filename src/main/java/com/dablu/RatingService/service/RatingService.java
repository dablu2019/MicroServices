package com.dablu.RatingService.service;

import java.util.List;

import com.dablu.RatingService.entities.Rating;

public interface RatingService {

	//create
	
	Rating create(Rating rating);
	
	//get all ratings
	List<Rating> getRatings();
	
	// all by UserId
	List<Rating> getRatingByUserId(String userId);
	
	//get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);
}
