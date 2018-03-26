package com.seven4n.corrientazo.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.seven4n.corrientazo.utils.Constants;

public class Dron {

	private int xPosition;
	private int yPosition;
	private char cardinalPoint;
	private List<Lunch> lunchs;
			
	public Dron(int xPosition, int yPosition, char cardinalPoint, List<Lunch> lunchs) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.cardinalPoint = cardinalPoint;
		this.lunchs = lunchs;
	}
	public char getCardinalPoint() {
		return cardinalPoint;
	}
	public void setCardinalPoint(char cardinalPoint) {
		this.cardinalPoint = cardinalPoint;
	}

	
	public int getxPosition() {
		return xPosition;
	}
	
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	
	public int getyPosition() {
		return yPosition;
	}
	
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	public List<Lunch> getLunchs() {
		return lunchs;
	}
	
	public void setLunchs(List<Lunch> lunchs) {
		this.lunchs = lunchs;
	}
	
	//Calculates XY Coordinates for every lunch and print them on a file
	public void deliverLunchs() {
		
		StringBuilder stringBuilder = new StringBuilder(Constants.REPORT_TITLE);
		stringBuilder.append(System.lineSeparator());
		for (Lunch lunch : lunchs) {
			calculateAddress(lunch.getRoute());
			lunch.setDelivered(true);
			stringBuilder.append("(" + xPosition + ", " + yPosition + ") dirección " + getCardinal());
			stringBuilder.append(System.lineSeparator());
		}
		
		printFile(stringBuilder.toString());
	}
	
	
	private void calculateAddress(String route) {
		
		int length = route.length();
		
		for (int i=0; i<length; i++) {
				
			char instruction = route.charAt(i);
			
			if(instruction == Constants.GO_FORWARD) {
				moveForward();
			}else if (instruction == Constants.TURN_RIGHT) {
				rotateRight();
			}else if (instruction == Constants.TURN_LEFT) {
				rotateLeft();
			}
		}
			
	}
	
	private void moveForward() {
		
		switch(cardinalPoint) {
			case Constants.NORTH: 
				yPosition++;
				break;		
				
			case Constants.SOUTH:
				yPosition--;
				break;
				
			case Constants.EAST:
				xPosition++;
				break;
				
			case Constants.WEST:
				xPosition--;
				break;
				
		}
	}
	
	private void rotateRight() {
		
		switch(cardinalPoint) {
			case Constants.NORTH: 
				cardinalPoint = Constants.EAST;
				break;		
			
			case Constants.SOUTH:
				cardinalPoint = Constants.WEST;
				break;
			
			case Constants.EAST:
				cardinalPoint = Constants.SOUTH;
				break;
				
			case Constants.WEST:
				cardinalPoint = Constants.NORTH;
				break;
				
		}
	}
	
	private void rotateLeft() {
		
		switch(cardinalPoint) {
			case Constants.NORTH: 
				cardinalPoint = Constants.WEST;
				break;		
			
			case Constants.SOUTH:
				cardinalPoint = Constants.EAST;
				break;
			
			case Constants.EAST:
				cardinalPoint = Constants.NORTH;
				break;
				
			case Constants.WEST:
				cardinalPoint = Constants.SOUTH;
				break;
				
		}
	}
	
	private String getCardinal() {
		
		String cardinal = "";
		
		switch(cardinalPoint) {
		case Constants.NORTH: 
			cardinal = Constants.NORTE;
			break;		
		
		case Constants.SOUTH:
			cardinal = Constants.SUR;
			break;
		
		case Constants.EAST:
			cardinal = Constants.ORIENTE;
			break;
			
		case Constants.WEST:
			cardinal = Constants.OCCIDENTE;
			break;
			
		}
		
		return cardinal;
	}
	
	private void printFile(String content) {
				
		try (BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(Constants.OUTPUT_FILE_PATH+Constants.FILE_OUTPUT_NAME+Constants.FILE_EXTENSION))){
			
			bufferedWriter.write(content);
			
			System.out.println(Constants.WRITE_OK);
		} catch (IOException e) {
			System.out.println(Constants.ERROR_WRITING_FILE + e.getMessage());
		}
	}
}
