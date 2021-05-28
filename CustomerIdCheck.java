import java.util.Scanner;
public class CustomerIdCheck {
	public static void main(String[] args) {
		int flag=0;
		Scanner s=new Scanner(System.in);
		// enter the no of customer ID
		int length=s.nextInt();
		String a[]=new String[length];
		//Enter the customer id in a single line with a space between each id
		for(int i=0;i<a.length;i++) {
			a[i]=s.next();
		}
		//if the customer ID's length is greater than 6 print it
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<6 || a[i].length()>6) {
				System.out.print(a[i]+" ");
				flag=1;
			}
		}
		//if there is no invalid ID print 0
		if(flag==0) {
			System.out.println(0);
		}
	}

}
