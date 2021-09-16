package Util;

public class Utils {
	
	public static double convertStringToDouble(String input) {
		double outputValue = 0;
		if (input != null && input.length() > 0) {
			String value = input.substring(1, input.length());
			value = value.replaceFirst(",", "");
			outputValue= Double.parseDouble(value);
		}
		return outputValue;
	}

}
