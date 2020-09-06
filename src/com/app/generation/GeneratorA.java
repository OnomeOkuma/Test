package com.app.generation;

public class GeneratorA implements Generator {
	
	private long remainder;
	
	public GeneratorA() {
	}
	
	@Override
	public long generate(long seed) {
		long result = (16807 * seed) % 2147483647;
		this.remainder = result;
		return result;
	}

	@Override
	public long getRemainder() {
		return this.remainder;
	}

}
