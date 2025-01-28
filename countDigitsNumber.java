package Javapreparation;

public class countDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=123456;
		
		int count=0;
		
		while (number!=0) {
			number/=10;
			count++;
		}
		
		System.out.println("The number of digits inside the number is: "+count);
	}

}
