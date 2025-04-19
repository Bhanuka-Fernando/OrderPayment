package com.fooddelivery.orderpayment.controller;

import com.fooddelivery.orderpayment.model.Restaurants;
import com.fooddelivery.orderpayment.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/restaurants")
public class RestaurantsController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<Restaurants> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @PostMapping
    public Restaurants createRestaurant(@RequestBody Restaurants restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    @DeleteMapping("/{restaurantId}")
    public void deleteRestaurant(@PathVariable String restaurantId){
        restaurantService.deleteRestaurant(restaurantId);
    }


}
