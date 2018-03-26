package com.seven4n.corrientazo.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.seven4n.corrientazo.model.Dron;
import com.seven4n.corrientazo.model.Lunch;

public class DronTest {
	
	@Test
	//Tests a first lunch delivery following business needs
	public void testFirstDelivery() {
		
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		
		String homeServiceId = "01";
		int expectedX = -2;
		int expectedY = 4;
		char expectedCardinal = 'N';
		
		dron.deliverLunchs(homeServiceId);
		
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	@Test
	//Tests a second lunch delivery following business needs
	public void testSecondDelivery() {
		
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		
		String homeServiceId = "01";
		int expectedX = -1;
		int expectedY = 3;
		char expectedCardinal = 'S';
		
		dron.deliverLunchs(homeServiceId);
		
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
				
		String homeServiceId = "01";
		int expectedX = 0;
		int expectedY = 0;
		char expectedCardinal = 'W';
		
		dron.deliverLunchs(homeServiceId);
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	@Test
	//Tests a fourth lunch delivery following business needs
	public void testFourthDelivery() {
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		dron.getLunchs().add(new Lunch("ADAIDAIDIAI",false));
				
		String homeServiceId = "01";
		int expectedX = -2;
		int expectedY = 2;
		char expectedCardinal = 'S';
		
		dron.deliverLunchs(homeServiceId);
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	@Test
	//Tests a fifth lunch delivery following business needs
	public void testFifthDelivery() {
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		dron.getLunchs().add(new Lunch("ADAIDAIDIAI",false));
		dron.getLunchs().add(new Lunch("IADIADADAI",false));
				
		String homeServiceId = "01";
		int expectedX = -1;
		int expectedY = 1;
		char expectedCardinal = 'S';
		
		dron.deliverLunchs(homeServiceId);
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	@Test
	//Tests a sixth lunch delivery following business needs
	public void testSixthDelivery() {
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		dron.getLunchs().add(new Lunch("ADAIDAIDIAI",false));
		dron.getLunchs().add(new Lunch("IADIADADAI",false));
		dron.getLunchs().add(new Lunch("IAIDADIADAI",false));
				
		String homeServiceId = "01";
		int expectedX = 2;
		int expectedY = 0;
		char expectedCardinal = 'E';
		
		dron.deliverLunchs(homeServiceId);
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	@Test
	//Tests a seventh lunch delivery following business needs
	public void testSeventhDelivery() {
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		dron.getLunchs().add(new Lunch("ADAIDAIDIAI",false));
		dron.getLunchs().add(new Lunch("IADIADADAI",false));
		dron.getLunchs().add(new Lunch("IAIDADIADAI",false));
		dron.getLunchs().add(new Lunch("ADIADIAIIDAID",false));
				
		String homeServiceId = "01";
		int expectedX = 5;
		int expectedY = 1;
		char expectedCardinal = 'N';
		
		dron.deliverLunchs(homeServiceId);
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	@Test
	//Tests a eighth lunch delivery following business needs
	public void testEighthDelivery() {
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		dron.getLunchs().add(new Lunch("ADAIDAIDIAI",false));
		dron.getLunchs().add(new Lunch("IADIADADAI",false));
		dron.getLunchs().add(new Lunch("IAIDADIADAI",false));
		dron.getLunchs().add(new Lunch("ADIADIAIIDAID",false));
		dron.getLunchs().add(new Lunch("DDIIAAADIDIA",false));
				
		String homeServiceId = "01";
		int expectedX = 5;
		int expectedY = 5;
		char expectedCardinal = 'N';
		
		dron.deliverLunchs(homeServiceId);
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}

	@Test
	//Tests a ninth lunch delivery following business needs
	public void testNinthDelivery() {
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		dron.getLunchs().add(new Lunch("ADAIDAIDIAI",false));
		dron.getLunchs().add(new Lunch("IADIADADAI",false));
		dron.getLunchs().add(new Lunch("IAIDADIADAI",false));
		dron.getLunchs().add(new Lunch("ADIADIAIIDAID",false));
		dron.getLunchs().add(new Lunch("DDIIAAADIDIA",false));
		dron.getLunchs().add(new Lunch("IIAADIDIADI",false));
				
		String homeServiceId = "01";
		int expectedX = 5;
		int expectedY = 2;
		char expectedCardinal = 'S';
		
		dron.deliverLunchs(homeServiceId);
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}
	
	@Test
	//Tests a tenth lunch delivery following business needs
	public void testTenthDelivery() {
		List<Lunch> lunchs = new ArrayList<>();
		Dron dron = new Dron(0, 0, 'N', lunchs);
		
		dron.getLunchs().add(new Lunch("AAAAIAAD",false));
		dron.getLunchs().add(new Lunch("DDAIAD",false));
		dron.getLunchs().add(new Lunch("AAIADAD",false));
		dron.getLunchs().add(new Lunch("ADAIDAIDIAI",false));
		dron.getLunchs().add(new Lunch("IADIADADAI",false));
		dron.getLunchs().add(new Lunch("IAIDADIADAI",false));
		dron.getLunchs().add(new Lunch("ADIADIAIIDAID",false));
		dron.getLunchs().add(new Lunch("DDIIAAADIDIA",false));
		dron.getLunchs().add(new Lunch("IIAADIDIADI",false));
		dron.getLunchs().add(new Lunch("AAIDDIADIAD",false));
		
		String homeServiceId = "01";
		int expectedX = 5;
		int expectedY = -2;
		char expectedCardinal = 'W';
		
		dron.deliverLunchs(homeServiceId);
				
		assertTrue( (expectedX == dron.getxPosition()) && (expectedY == dron.getyPosition()) && (expectedCardinal == dron.getCardinalPoint()) );
	}

}
