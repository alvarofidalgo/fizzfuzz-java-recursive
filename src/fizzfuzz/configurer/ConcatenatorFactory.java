package fizzfuzz.configurer;

import java.util.ArrayList;
import java.util.List;

import fizzfuzz.concatenators.ComplexConcatenator;
import fizzfuzz.concatenators.Concatenator;
import fizzfuzz.concatenators.ConcatenatorWithRule;
import fizzfuzz.concatenators.EmptyConcatenator;
import fizzfuzz.model.NumberTransform;
import fizzfuzz.rules.NumberRule;

public final class ConcatenatorFactory {
	
	private List<Concatenator> _concatenators = new ArrayList<Concatenator>();
		
	public Concatenator build(){
		Concatenator concatenator = new EmptyConcatenator();
		for (int index=0;index<_concatenators.size();index++)
			concatenator = new ComplexConcatenator(concatenator, _concatenators.get(index));
		return concatenator;
	}
	
	public ConcatenatorFactory addConcatentorWithRule(NumberRule rule,Integer number,String toWord){
		NumberTransform numberTransform = new NumberTransform(number,new StringBuffer(toWord));
		_concatenators.add(new ConcatenatorWithRule(rule, numberTransform));
		return this;
	}

}
