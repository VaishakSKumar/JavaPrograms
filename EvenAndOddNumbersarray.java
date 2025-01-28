package Javapreparation;

public class EvenAndOddNumbersarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={23,14,15,18,21};
		int evenCounter=0,oddCounter=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				evenCounter++;
				System.out.println("Even Number: "+arr[i]);
				
			}else {
				oddCounter++;
				System.out.println("Odd Number: "+arr[i]);
			}
		}
		
		System.out.println("Even numbers Count in an Array: "+evenCounter);
		System.out.println("Odd numbers Count in an Array: "+oddCounter);
	}

}
