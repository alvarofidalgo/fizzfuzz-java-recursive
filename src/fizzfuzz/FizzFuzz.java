package fizzfuzz;

import fizzfuzz.concatenators.Concatenator;


public final class FizzFuzz {
			
	private Concatenator _concatenator;
	
	public FizzFuzz(Concatenator concatenator){
		_concatenator = concatenator;
	}
		
	public String trabsformToStringWith(int number) {		
		return _concatenator.concatValueNumberIn(new StringBuffer(), number).toString();
	}
		
}



