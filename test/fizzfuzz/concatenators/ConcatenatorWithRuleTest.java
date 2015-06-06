package fizzfuzz.concatenators;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fizzfuzz.concatenators.Concatenator;
import fizzfuzz.concatenators.ConcatenatorWithRule;
import fizzfuzz.model.NumberTransform;
import fizzfuzz.rules.DivisibleRule;

public final class ConcatenatorWithRuleTest {
	
	private StringBuffer _buffer;
	private Concatenator _concatenator;
	
	@Before public void setUp(){
		_buffer = new StringBuffer("existWord");
		_concatenator = new ConcatenatorWithRule(new DivisibleRule(),
				                         new NumberTransform(3, new StringBuffer("-fizz")));
	}
		
	
	@Test public void whenNumberIsDivisible(){
		_concatenator.concatValueNumberIn(_buffer,3);
		assertEquals(_buffer.toString(),"existWord-fizz");
		
	}
	
	@Test public void whenNumberIsNotDivisible(){
		_concatenator.concatValueNumberIn(_buffer,11);
		assertEquals(_buffer.toString(),"existWord");	
	}
}
