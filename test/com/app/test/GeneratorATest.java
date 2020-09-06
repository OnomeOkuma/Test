package com.app.test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.app.generation.GeneratorA;

public class GeneratorATest {
	
	private final GeneratorA generator = new GeneratorA();
	
	@Test
	public void numberGenerationTest() {
		Assert.assertEquals(1092455, generator.generate(65));
		Assert.assertEquals(1181022009, generator.generate(1092455));
	}
}
