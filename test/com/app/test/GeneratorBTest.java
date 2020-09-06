package com.app.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.app.generation.GeneratorB;

public class GeneratorBTest {
	private final GeneratorB generator = new GeneratorB();
	
	@Test
	public void numberGenerationTest() {
		Assert.assertEquals(430625591, generator.generate(8921));
		Assert.assertEquals(1233683848, generator.generate(430625591));
	}
}
