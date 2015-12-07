package org.epa.mda.poc;

public class CompanyEncoder {
	public static String encodeString(String toEncode) {
		String toReturn = "no%20value";
		toReturn = toEncode.replaceAll("\\s+", "%20");
		System.out.println(toReturn);
		return toReturn;
	}
}
