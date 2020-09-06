package com.app;

public class ValueComparatorImpl implements ValueComparator {

	@Override
	public boolean compare(long valueA, long valueB) {
		String binaryStringA = Long.toBinaryString(valueA);
		String binaryStringB = Long.toBinaryString(valueB);

		if (binaryStringA.length() < 8) {
			int difference = 8 - binaryStringA.length();
			for (int counter = 0; counter < difference; counter++) {
				binaryStringA = "0".concat(binaryStringA);
			}
			String subStringA = binaryStringA.substring(binaryStringA.length() - 8);
			String subStringB = binaryStringB.substring(binaryStringB.length() - 8);
			return subStringA.equals(subStringB);
		} else if (binaryStringB.length() < 8) {
			int difference = 8 - binaryStringB.length();
			for (int counter = 0; counter < difference; counter++) {
				binaryStringB = "0".concat(binaryStringB);
			}
			String subStringA = binaryStringA.substring(binaryStringA.length() - 8);
			String subStringB = binaryStringB.substring(binaryStringB.length() - 8);
			return subStringA.equals(subStringB);
		} else {
			String subStringA = binaryStringA.substring(binaryStringA.length() - 8);
			String subStringB = binaryStringB.substring(binaryStringB.length() - 8);
			return subStringA.equals(subStringB);
		}
	}

}
