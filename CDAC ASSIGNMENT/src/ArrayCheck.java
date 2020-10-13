import java.util.Arrays; 
import java.util.Scanner;

public class ArrayCheck {

	public static void main(String[] args) {
		System.out.println("Please input the number of elements in array");
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int arr1[]= new int[l];
		int[] arr2= new int[l];
		
		for(int i=0;i<2;i++) {
			System.out.println("Please input the elements of array "+(i+1));
			for(int j=0;j<l;j++) {
				if(i==0) {
					arr1[j]=scan.nextInt();
				}
				else if(i==1) {
					arr2[j]=scan.nextInt();
				}
			}
		}
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		scan.close();

	}

}
