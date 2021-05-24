//denomination problem 

import java.io.*;
public class TotalDenomination {
	public static void main(String[] args) throws IOException {
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		String[] s=new String[6];
		System.out.println("enter denomination in order(25p,50p,1rs,2rs,5rs,10rs)");
		s=in.readLine().split(" "); 
		int paise25= Integer.parseInt(s[0]);
		int paise50= Integer.parseInt(s[1]);
		int rs1= Integer.parseInt(s[2]);
		int rs2= Integer.parseInt(s[3]);
		int rs5= Integer.parseInt(s[4]);
		int rs10= Integer.parseInt(s[5]);
		System.out.println("Total amount: "+((paise25*0.25)+(paise50*0.50)+(rs1*1)+(rs2*2)+(rs5*5)+(rs10*10)));
	}

}
