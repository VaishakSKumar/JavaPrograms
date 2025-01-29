package Javapreparation;

public class ArrayEqualorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,47,56};
		int b[]= {1,2,7,56};
		
		boolean status=true;
		if (a.length==b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i]!=b[i]) {
					status=false;
				}
				}
			}
		 else {
			status=false;
		}
		
		
		if (status==true) {
			System.out.println("Array is equal");
		}else {
			System.out.println("Array is not equal");
		}
	}

}
