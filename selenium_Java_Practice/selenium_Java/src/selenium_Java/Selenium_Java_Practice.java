package selenium_Java;

import java.math.BigInteger;
import java.util.Scanner;

public class Selenium_Java_Practice {

	public static void main(String[] args) {
		//reverseStrMethod();
		//nFactorial();
		bigNumFactorial();
	}
	
	public static void reverseStrMethod(){
		
		String originalStr = "Tayyab";
		String reversedStr = "";
		
		
		for (int i = originalStr.length()-1; i >= 0; i--){
		reversedStr = reversedStr + originalStr.charAt(i);
		
		}
		
		System.out.println(reversedStr);
	}

	public static void nFactorial(){
		int n = 9;
	    int result = 1;
	    for (int i = 1; i <= n; i++) {
	          result = result * i;
	       }
	       System.out.println("The factorial of " + n + " is " + result);
	   }
		
@SuppressWarnings("resource")
public static void bigNumFactorial(){

	/*		int n = 900;
	   BigInteger factorial = BigInteger.valueOf(1);
	    for (int i = 1; i <= n; i++)
	        factorial = factorial.multiply(BigInteger.valueOf(i));

	    System.out.println("The factorial of big num "+ n + " is " +factorial);
} */

	        BigInteger fac=new BigInteger("1");
	        int n;
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number:");
	        n=sc.nextInt();
	        
	        for(int i=1;i<=n;i++){
	            fac=fac.multiply(BigInteger.valueOf(i));
	        }
	        
	        System.out.println(fac);
	    }
	}



