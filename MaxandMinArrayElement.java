package Javapreparation;

public class MaxandMinArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {23,51,24,65,41};
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Maximum element is:"+max);
		System.out.println("Minimum element is:"+min);

	}

}
