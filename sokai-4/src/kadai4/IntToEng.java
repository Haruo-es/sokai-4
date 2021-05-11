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
    	if(n >= 0 && n < 11) {return zeroKaraten(n);}
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
}
