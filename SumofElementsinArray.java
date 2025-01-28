package Javapreparation;

public class SumofElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={23,14,15,18,21};
		int sum=0;
	/*	for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}*/
		
		for (int i : arr) {
			sum+=i;
		}
		System.out.println("the Sum of array is: "+sum);
	}

}
