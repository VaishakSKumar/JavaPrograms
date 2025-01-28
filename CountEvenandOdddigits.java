package Javapreparation;

public class CountEvenandOdddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=145678;
		
		int temp=number;
		
		int evenCount=0,oddCount=0,remainder=0;
		
		while (temp!=0) {
			remainder=temp%10;
			if (remainder%2==0) {
				evenCount++;
			} else  {
				oddCount++;
			}
			temp/=10;
	}
			
			System.out.println("the number of Even numbers in "+number+" is: "+evenCount);
			System.out.println("the number of Odd numbers in "+number+" is: "+oddCount);
		}

	}


