package kadai4;
import java.util.Scanner;
public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int input = sc.nextInt();
			System.out.println(translateEng(input));
		}
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n >= 0 && n < 11) return zeroKaraten(n);
    	if(n>=11 && n<20) return teen(n);
    	else return "";
    }
   
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
    
}
