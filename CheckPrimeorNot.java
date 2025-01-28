package Javapreparation;

public class CheckPrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=13;
		boolean isPrime=true;
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime=false;
			}
		}
		
		if (isPrime==true) {
			System.out.println(number+" is a Prime Number");
		}else {
			System.out.println(number+" is a Composite Number");
		}
		
	}

}
