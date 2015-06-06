package fizzfuzz.configurer;

import fizzfuzz.concatenators.Concatenator;
import fizzfuzz.rules.DivisibleRule;
import fizzfuzz.rules.MagicNumber;

public final class Configurer {
	
	
	public Concatenator createConcatenator(){
		 return new ConcatenatorFactory ()
				     .addConcatentorWithRule(new DivisibleRule(), 3, "fizz")
				     .addConcatentorWithRule(new DivisibleRule(), 5, "fuzz")
				     .addConcatentorWithRule(new MagicNumber(), 13,"magiNumber")
				     .build();
	}

}
