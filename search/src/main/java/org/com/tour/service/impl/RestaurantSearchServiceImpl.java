package org.com.tour.service.impl;

import org.com.tour.GoogleSearchEngin;
import org.com.tour.service.RestaurantSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RestaurantSearchServiceImpl implements RestaurantSearchService {

    @Autowired
    private GoogleSearchEngin search;

    @Transactional
    public List<String> getRestaurantByUrl(String url) {

        List<String> restaurantList = null;
        //GoogleSearchEngin search = new GoogleSearchEngin();
        try {
            // url = "https://www.brooklynfare.com/chefs-table/";
            System.out.println("qqqqqqqq     " + url);
            restaurantList = search.getRestaurantDocumentByUrl(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return restaurantList;
    }
}
