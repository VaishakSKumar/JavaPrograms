package Javapreparation;

public class sumOfaNumber {
public static void main(String[] args) {
	
	int number=14526;
	int sum=0,remainder=0;
	
	while (number!=0) {
		remainder=number%10;
		sum+=remainder;
		number/=10;
	}
	System.out.println("The su of the digit is: "+sum);
}
}
