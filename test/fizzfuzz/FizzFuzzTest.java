package fizzfuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fizzfuzz.configurer.Configurer;


public final class FizzFuzzTest {
		
	private FizzFuzz _fizzFuzz;
		
	@Before public void setUp(){		
		_fizzFuzz =  new FizzFuzz(new Configurer().createConcatenator());
	}
	
	@Test public void whenNumberIsNotDivisible(){
		assertEquals(_fizzFuzz.trabsformToStringWith(11),"");
	}
	
	
	@Test public void whenNumberIsDivisibleByThree(){
		assertEquals(_fizzFuzz.trabsformToStringWith(3),"fizz");
	}
	
	@Test public void whenNumberIsDivisibleByFive(){
		assertEquals(_fizzFuzz.trabsformToStringWith(5),"fuzz");		
	}
		
	@Test public void whenNumberIsDivisibleByThreeAndFive(){
		assertEquals(_fizzFuzz.trabsformToStringWith(15),"fizzfuzz");
	}
	
	@Test public void whenNumberIsMagic(){
		assertEquals(_fizzFuzz.trabsformToStringWith(13),"magiNumber");
	}
}
