package fizzfuzz.concatenators;

public final class ComplexConcatenator implements Concatenator{
	
	private Concatenator _actual;
	private Concatenator _nextConcatenator;
	
	public ComplexConcatenator(Concatenator actual,Concatenator nextConcatenator){
		_actual = actual;
		_nextConcatenator = nextConcatenator;
	}
	
	public StringBuffer concatValueNumberIn(StringBuffer buffer, Integer number) {
		return _nextConcatenator.concatValueNumberIn(_actual.concatValueNumberIn(buffer, number), number);
	}
	
}