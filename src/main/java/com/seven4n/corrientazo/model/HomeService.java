package com.seven4n.corrientazo.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.seven4n.corrientazo.utils.Constants;

public class HomeService implements Runnable{

	private String homeServiceId;
	
	@Override
	public void run() {
		sendHomeService();
	}
	
	
	public HomeService(String homeServiceId) {
		super();
		this.homeServiceId = homeServiceId;
	}


	public String getHomeServiceId() {
		return homeServiceId;
	}

	
	public void setHomeServiceId(String homeServiceId) {
		this.homeServiceId = homeServiceId;
	}


	//Reads the file and create lunchs per line readed.
	private void sendHomeService() {
		
		List<Lunch> lunchs = new ArrayList<Lunch>();
		
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader(Constants.INPUT_FILE_PATH+Constants.FILE_INPUT_NAME+homeServiceId+Constants.FILE_EXTENSION))) {
			
			String route;
			
			while((route = bufferedReader.readLine()) != null){
				lunchs.add(new Lunch(route.toUpperCase(), false));
			}
						
		} catch (FileNotFoundException e) {
			System.out.println(Constants.FILE_INPUT_NAME+homeServiceId+Constants.FILE_EXTENSION+Constants.FILE_NOT_FOUND);
			
		} catch (IOException e) {
			System.out.println(Constants.ERROR_READING_FILE + e.getMessage());
		}
		
		//If the list of lunchs aren't empty, the dron starts to deliver them
		if(!lunchs.isEmpty()) {
			Dron dron = new Dron(0, 0, Constants.NORTH,lunchs);
			dron.deliverLunchs(homeServiceId);
		}else{
			System.out.println(Constants.DRON_ID + homeServiceId + Constants.HAS_NO_LUNCHS);
		}
		
	}
	
}
