package Util;

public class Test {

	public static void main(String[] args) {
		String val="$123,365.24";
		String d=val.substring(1,val.length());
		String strNew = d.replaceFirst(",", "");
		double totBal=Double.parseDouble(strNew);
		System.out.println(totBal);
		Test t=new Test();
		double r=t.convertStringToDouble(val);
		System.out.println(r);
	}
	public static double convertStringToDouble(String input) {		
		String value=input.substring(1,input.length());
		value = value.replaceFirst(",", "");
		return Double.parseDouble(value);		
	}
}
