//Library Fine


import java.io.*;
import java.util.Scanner;
public class LibraryFine {
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = new String[3];
		int d1,m1,y1,d2,m2,y2;
		System.out.println("Enter Return day:-");
		input1 = in.readLine().split(" "); 
		d1 = Integer.parseInt(input1[0]); 
		m1 = Integer.parseInt(input1[1]);
		y1 = Integer.parseInt(input1[2]);
		System.out.println("Enter Due day:-");
		String[] input2 = new String[3];
		input2 = in.readLine().split(" "); 
		d2 = Integer.parseInt(input2[0]); 
		m2 = Integer.parseInt(input2[1]);
		y2 = Integer.parseInt(input2[2]);
		if(d1>=1 && d1<=31 && d2>=1 && d2<=31 && m1>=1 && m1<=12 && m2>=1 && m2<=12 && y1>=1 && y1<=3000 && y2>=1 && y2<=3000 ){
			if(d1<=d2 && m1<=m2 && y1<=y2) {
				System.out.println(0);
			}
			else if(d1>d2 && m1<=m2 && y1<=y2) {
				System.out.println(15*(d1-d2));
			}
			else if(m1>m2 && y1<=y2) {
				System.out.println(500*(m1-m2));
			}
			else if(y1>y2) {
				System.out.println(10000);
			}
		}

	}

}
