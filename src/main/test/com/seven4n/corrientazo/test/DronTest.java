package com.seven4n.corrientazo.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.seven4n.corrientazo.model.Dron;
import com.seven4n.corrientazo.model.Lunch;

public class DronTest {
	
	@Test
	//Tests the first example described on the file instructions of the technical test
	public void testInstructionsFirstDelivery() {
		
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		
		int expectedX = -2;
		int expectedY = 4;
		char expectedCardinal = 'N';
		
		dron.deliverLunchs();
		
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	
	@Test
	//Tests the second example described on the file instructions of the technical test
	public void testInstructionsSecondDelivery() {
		
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		
		int expectedX = -3;
		int expectedY = 3;
		char expectedCardinal = 'S';
		
		dron.deliverLunchs();
		
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	
	@Test
	//Tests the third example described on the file instructions of the technical test
	public void testInstructionsThirdDelivery() {
		
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		
		int expectedX = -4;
		int expectedY = 2;
		char expectedCardinal = 'E';
		
		dron.deliverLunchs();
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	
	@Test
	//Tests a first lunch delivery following business needs
	public void testFirstDelivery() {
		
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		
		int expectedX = -2;
		int expectedY = 4;
		char expectedCardinal = 'N';
		
		dron.deliverLunchs();
		
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	@Test
	//Tests a second lunch delivery following business needs
	public void testSecondDelivery() {
		
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		
		int expectedX = -1;
		int expectedY = 3;
		char expectedCardinal = 'S';
		
		dron.deliverLunchs();
		
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	
	@Test
	//Tests a third lunch delivery following business needs
	public void testThirdDelivery() {
		
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		
		int expectedX = 0;
		int expectedY = 0;
		char expectedCardinal = 'W';
		
		dron.deliverLunchs();
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}

}
