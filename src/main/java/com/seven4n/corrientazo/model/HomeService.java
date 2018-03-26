package com.seven4n.corrientazo.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.seven4n.corrientazo.utils.Constants;

public class HomeService {

	//Reads the file and create lunchs per line readed.
	public void sendHomeService() {
		
		List<Lunch> lunchs = new ArrayList<Lunch>();
		
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader(Constants.INPUT_FILE_PATH+Constants.FILE_INPUT_NAME+Constants.FILE_EXTENSION))) {
			
			String route;
			
			while((route = bufferedReader.readLine()) != null){
				lunchs.add(new Lunch(route.toUpperCase(), false));
			}
						
		} catch (FileNotFoundException e) {
			System.out.println(Constants.FILE_INPUT_NAME+Constants.FILE_EXTENSION+Constants.FILE_NOT_FOUND);
			
		} catch (IOException e) {
			System.out.println(Constants.ERROR_READING_FILE + e.getMessage());
		}
		
		//If the list of lunchs aren't empty, the dron starts to deliver them
		if(!lunchs.isEmpty()) {
			Dron dron = new Dron(0, 0, Constants.NORTH,lunchs);
			dron.deliverLunchs();
		}else{
			System.out.println(Constants.DRON_HAS_NO_LUNCHS);
		}
		
	}
	
}
