package Javapreparation;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="MADAM";
		

		
String palindrome = "";

char[] charArr=name.toCharArray();

for (int i = charArr.length-1; i >=0; i--) {
	palindrome+=charArr[i];
}
		
		if (palindrome.equalsIgnoreCase(name)) {
			System.out.println(name+" is a Palindrome String");
		}else {
			System.out.println(name+" is not a Palindrome String");
		}
		
	}

}
