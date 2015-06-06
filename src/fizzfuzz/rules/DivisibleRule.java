package fizzfuzz.rules;

public final class DivisibleRule implements NumberRule {
	
		
	public boolean numberFulfillRule(Integer number,Integer numberRule){
	
		 return number%numberRule ==0;
	}
}
