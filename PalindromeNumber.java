package Javapreparation;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
		
		int temp=number;
		int dummy,palindrome = 0;
		
		while (temp!=0) {
			dummy=temp%10;
			palindrome=palindrome*10+dummy;
			temp/=10;
		}
		
		if (palindrome==number) {
			System.out.println(number+" is a Palindrome number");
		}else {
			System.out.println(number+" is not a Palindrome number");
		}
		
	}

}
