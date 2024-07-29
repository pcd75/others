package com.nath.sma.service;

import com.nath.sma.entity.Takes;

public interface TakesService {

	Iterable<Takes> listAllTakes();

	void saveTakes(Takes takes);

	Takes findById(long id);

	void deleteTakes(Takes takes);
    
}
