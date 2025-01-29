package Javapreparation;

public class VowelsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Vaishak S Kumar";
		
		String no_space=name.replace(" ", "");
		
		char[] charArr=no_space.toCharArray();
		int count=0;
		for (char c : charArr) {
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		System.out.println("Vowels in a String:"+count);
	}

}
