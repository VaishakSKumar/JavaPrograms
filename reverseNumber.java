package Javapreparation;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=5478;
		int reverse=0,num1=0;
		while (number!=0) {
			reverse=number%10;
			num1=num1*10+reverse;
			number=number/10;
		}
		System.out.println(num1);
	}

}
