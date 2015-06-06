package fizzfuzz.concatenators;

import fizzfuzz.model.NumberTransform;
import fizzfuzz.rules.NumberRule;

public final class ConcatenatorWithRule implements Concatenator {
	
	private NumberTransform _numberTransform;
	private NumberRule _rule;

	public ConcatenatorWithRule(NumberRule rule,NumberTransform numberTransform) {
		_rule = rule;
		_numberTransform = numberTransform;
	}

	public StringBuffer concatValueNumberIn(StringBuffer buffer, Integer number) {
		if (_rule.numberFulfillRule(number, _numberTransform.number))
		    buffer.append(_numberTransform.toWord);
		return buffer;
	}
}
