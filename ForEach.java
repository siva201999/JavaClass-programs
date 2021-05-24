//For each loop

import java.util.Scanner;
public class ForEach {

	public static void main(String[] args) {
		System.out.println("For each without Scanner:");
		System.out.println();
		String s[]=new String[5];
		s[0]="Scorpio";
		s[1]="Duster";
		s[2]="fortuner";
		s[3]="XUV500";
		s[4]="BMW";
		for(String cars:s) {
			System.out.println(cars);
		}
		System.out.println();
		
		System.out.println("For each without Scanner:");
		System.out.println("Enter array size:");
		Scanner size=new Scanner(System.in);
		int n=size.nextInt();
		String a[]=new String[n];
		System.out.println("enter array elements");
		
		for(int i=0;i<n;i++) {
			System.out.println(i);
			System.out.println(a.length);
			a[i]=size.next();
		}
		for(String cars:a) {
			System.out.println(cars);
		}	
	}

}
