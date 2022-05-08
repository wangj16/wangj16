package org.com.tour.service.impl;

import java.util.List;

import org.com.tour.GoogleSearchEngin;
import org.com.tour.service.TourismSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TourismSearchServiceImpl implements TourismSearchService  {

	@Autowired
	private GoogleSearchEngin search;

	@Transactional
	public List getTourismByUrl(String url)  {
		List<String> tourList = null;
		try {
			tourList = search.getTourDocumentByUrl(url);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tourList; 
	}

}
