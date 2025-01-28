package Javapreparation;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=6;
		
		System.out.println("before Swapping Numbers: "+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping Numbers: "+a+" "+b);
	}

}
