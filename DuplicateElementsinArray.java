package Javapreparation;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,47,58,69};
		boolean isElementFound=false;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					isElementFound=true;
					System.out.println("Found Duplicate Element: "+a[i]);
				}
					
				
			}
		}
		if (isElementFound==false) {
			System.out.println("Duplicate Element Not Found.");
		}
	}

}
