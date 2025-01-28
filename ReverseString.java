package Javapreparation;

public class ReverseString {
	public static void main(String[] args) {
		
		String name="Vaishak S Kumar";
		
		String no_space=name.replace(" ", "");
		
		String reverse="";
		
		char[] charArray=no_space.toCharArray();
		
		for (int i = charArray.length-1; i >=0 ; i--) {
			reverse+=charArray[i];
		}
		System.out.println(reverse);
	}
}
