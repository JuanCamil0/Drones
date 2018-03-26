package com.seven4n.corrientazo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.seven4n.corrientazo.model.HomeService;
import com.seven4n.corrientazo.utils.Constants;

//Runs the program with 20 threads and 20 task to be executed simultaneously
public class Main {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(Constants.NUMBER_OF_DRONES);

		for(int i = 1; i <= 20; i++) 
			executorService.execute(new HomeService(String.format(Constants.HOME_SERVICE_ID_FORMAT, i)));
		
		executorService.shutdown();
		
	}

}
