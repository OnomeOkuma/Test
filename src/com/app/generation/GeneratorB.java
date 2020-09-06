package com.app.generation;

public class GeneratorB implements Generator {
	
	private long remainder;
	
	@Override
	public long generate(long seed) {
		long result = (48271 * seed) % 2147483647;
		this.remainder = result;
		return result;
	}

	@Override
	public long getRemainder() {
		return this.remainder;
	}

}
