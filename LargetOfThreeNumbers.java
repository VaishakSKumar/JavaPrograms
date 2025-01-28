package Javapreparation;

import java.util.Scanner;

public class LargetOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the First number:");
		num1=scanner.nextInt();
		System.out.print("Enter the Second number:");
		num2=scanner.nextInt();
		System.out.print("Enter the Third number:");
		num3=scanner.nextInt();
		
		int largest=num1>num2?num1:num2;
		
		largest=num3>largest?num3:largest;
		
		System.out.println("The largest from this is: "+largest);
		scanner.close();
	}

}
