//finding maximum number in an array and find how many times it is repeated
import java.util.Scanner;
class DuplicateCount
{
    public static void main(String[] args)
    {
    int n,great1=0,repeated=0;
	System.out.println("enter array length:");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int A[]=new int[n];
	System.out.println("enter array elements:");
	for(int i=0;i<A.length;i++) {
		A[i]=s.nextInt();
	}
	for(int i=0;i<A.length;i++) {
		if(great1<A[i]){
			great1=A[i];
		}
		
	}
	 for(int i=0;i<A.length;i++) {
			if(great1==A[i]){
  			repeated++;
			}
		}
	System.out.println("first greatest:"+ " "+great1);
	System.out.println("no of times the biggest no repeated:"+" "+repeated);
    }
}