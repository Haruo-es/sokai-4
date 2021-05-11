package kadai4;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngtest1 {
	@Test
	public void test() {
		static String zeroKaraten(int x) {
	    	if(x == 0) return "zero";
	    	else if(x == 1) return "one";
	    	else if(x == 2) return "two";
	    	else if(x == 3) return "three";
	    	else if(x == 4) return "four";
	    	else if(x == 5) return "five";
	    	else if(x == 6) return "six";
	    	else if(x == 7) return "seven";
	    	else if(x == 8) return "eight";
	    	else if(x == 9) return "nine";
	    	else if(x == 10) return "ten";
	    	else return "";
	    }
	    
	    static String teen(int x) {
	    	if(x == 11) return "eleven";
	    	else if(x == 12) return "twelve";
	    	else if(x == 13) return "thirteen";
	    	else if(x == 14) return "fourteen";
	    	else if(x == 15) return "fifteen";
	    	else if(x == 16) return "sixteen";
	    	else if(x == 17) return "seventeen";
	    	else if(x == 18) return "eighteen";
	    	else if(x == 19) return "nineteen";
	    	else return "";
	    }
	    
	    static String futaketa(int x) {
	    	String[] num2= {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	    	
	    	if(x>=20&&x<30) {
	    		if(x==20) return num2[0];
	    		return num2[0]+"-"+zeroKaraten(x-20);
	    	}
	    	else if(x>=30&&x<40) {
	    		if(x==30) return num2[1];
	    		return num2[1]+"-"+zeroKaraten(x-30);
	    	}
	    	else if(x>=40&&x<50) {
	    		if(x==20) return num2[0];
	    		return num2[2]+"-"+zeroKaraten(x-40);
	    	}
	    	else if(x>=50&&x<60) {
	    		if(x==20) return num2[0];
	    		return num2[3]+"-"+zeroKaraten(x-50);
	    	}
	    	else if(x>=60&&x<70) {
	    		if(x==20) return num2[0];
	    		return num2[4]+"-"+zeroKaraten(x-60);
	    	}
	    	else if(x>=70&&x<80) {
	    		if(x==20) return num2[0];
	    		return num2[5]+"-"+zeroKaraten(x-70);
	    	}
	    	else if(x>=80&&x<90) {
	    		if(x==20) return num2[0];
	    		return num2[6]+"-"+zeroKaraten(x-80);
	    	}
	    	else if(x>=90&&x<100) {
	    		if(x==20) return num2[0];
	    		return num2[7]+"-"+zeroKaraten(x-90);
	    	}
	    	return "";
	    }
	}

}
