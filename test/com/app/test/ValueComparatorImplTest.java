package com.app.test;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import com.app.ValueComparatorImpl;


public class ValueComparatorImplTest {
	
	private final ValueComparatorImpl comparator = new ValueComparatorImpl();
	
	@Test
	public void comparatorTestTrue() {
		Assert.assertEquals(true, comparator.compare(245556042, 1431495498));
	}
	
	@Test
	public void comparatorTestFalse() {
		Assert.assertEquals(false, comparator.compare(1092455, 430625591));
	}
}
