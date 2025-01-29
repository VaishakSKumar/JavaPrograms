package Javapreparation;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,6};
		
		int range=a.length+1;
		int sum1=0,sum2=0,missing_number=0;
		
		for (int i = 0; i < a.length; i++) {
			sum1+=a[i];
		}
		System.out.println("Sum of the array is: "+sum1);
		
		for (int i = 1; i <= range; i++) {
			sum2+=i;
		}
		
		System.out.println("Sum of the range is: "+sum2);
		
		missing_number=sum2-sum1;
		
		System.out.println("The Missing Number is: "+missing_number);
	}

}
