package selenium_Java;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Selenium_Java_Practice {

	public static void main(String[] args) {
		
		
		
		/*reverseStrMethod();
		//nFactorial();
		 //bigNumFactorial();
		//System.out.print("Is given String a palindrome?  The answer is ");
		//System.out.print(isPalindromeFor("racecar"));
		//System.out.print(isPalindromeWhile("racecar"));
		//System.out.println(isPalindrome("noon"));
		//System.out.println(isParlidomeWhile("noon"));
		
		//System.out.println(isPalindromeForLoop("nooN"));
	
		*/System.out.println(isParlidromeFor("mayIyam"));
		/*int[] arr = new int[3];
		System.out.println(arr.length);//length for array
		 
		String str = "abc";
		System.out.println(str.length());//length() for string
		
		
		 Calendar calNewYork = Calendar.getInstance();  
	     calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));  
	        System.out.println();   
	      System.out.println("Time is: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"  
	        + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));  
	           System.out.println();  */
	     }
		
	
	
	public static void reverseStrMethod(){
		
		String originalStr = "JAckson";
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
/*
 String  

Need to find the first character in a string? Use charAt(0).
If a character or word is in the string? Use contains.
Need a suffix? Try endsWith.
Check if two strings are the same with equals and equalsIgnoreCase.
You can see if a string isEmpty(), or use length() to see how many characters are in the string.
You can convert the string toCharArray(), toUpperCase(), toLowerCase(),
or even trim() the whitespace in the beginning and the end of the string.
Remember that double quotes should wrap a string. 

Character

The boolean methods isLetter, isLetterOrDigit, isLowerCase, isUpperCase, isLowerCase, and isWhitespace
help investigate the nature of characters.
Example: Character.isLetter('A') would be true.
When declaring new characters, wrap them in single quotes, such as char newCharacter = 'a'. 

Integer

Want to convert an integer? Input the integer into Integer.toBinaryString(int i),
Integer.toHexString(int i), or Integer.toOctalString(int i) to convert it to the format you are looking for. 

If you were trying out a new vocabulary word, you would try it out in a sentence.
When using a new method in one of the Helper objects, try it out in a block of code. 


4. Ditch the IDE: Practice on paper
There is one weird trick to learning a programming language: Practice writing solutions down on paper. 

Read the documentation and lessons. Make up simple homework examples and solve them on paper.
For example, you could ask yourself how to use a for loop to print out: 

All integers from 1 to 100 (start with something easy)
All even numbers ( i % 2 == 0) within that range of 1 to 100 {1 ... 100} (hard if you don't know the mod operator)
All odd numbers. ( i %2 != 0) (build on what you just practiced)
All numbers divisible by three ( i % 3 == 0) (once more unto the breach, dear friends!)
All numbers divisible by three and five ( i % 3 == 0 && i % 5 == 0 ) (and one more time to cement it in your brain!)


public boolean isPalindrome(String s) {
    int head = 0;
    int tail = s.length() - 1;
    while (head < tail) {
        if (s.charAt(head) != s.charAt(tail)) {
            return false;
        }
        head++;
        tail--;
    }
    return true;
}


Best Article ever https://techbeacon.com/how-pass-coding-interview-automation-developer







public static boolean isPalindromeWhile(String s) {
    int head = 0;
    int tail = s.length() - 1;
    while (head < tail) {
        if (s.charAt(head) != s.charAt(tail)) {
            return false;
         }
        head++;
        tail--;
    }
    
   return true;
}

public static boolean isPalindromeFor(String s) {
    int len = s.length();
    for (int i = 0; i < len / 2; i++) {
        if ( s.charAt(i) != s.charAt(len - 1 - i)) {
            return false;
        }
    }
    return true;
}


*/

public static boolean isParlidomeWhile(String s){

int head = 0;
int tail = s.length()-1;
while(head < tail){
	if (s.charAt(head)!= s.charAt(tail)){
		return false;
	}
	head++;
	tail--;
	
}
return true;





}

public static boolean isParlidromeFor(String s){
	
	int len = s.length();
	
	for (int i =0; i < len / 2 ; i++){
		if(s.charAt(i)!= s.charAt(len -1 -i)){
			return false;
		}
		}
		return true;
	}
	
	
}







