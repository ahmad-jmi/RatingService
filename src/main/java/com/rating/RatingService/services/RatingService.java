package com.rating.RatingService.services;

import com.rating.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);
    //get All rating
    List<Rating> getRatings();
    // get all rating by user
    List<Rating> getRatingByUserId(String userId);
    //get all by hotel
    List<Rating> getRatingByHotel(String hotelId);
}
