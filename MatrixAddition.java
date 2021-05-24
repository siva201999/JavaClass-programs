//Two dimentional array elements

import java.util.Scanner;
public class MatrixAddition {
	public static void main(String[] args) {
		int row,col;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter row and column:");
		row=ip.nextInt();
		col=ip.nextInt();
		int arr[][]= new int[row][col];
		int arr2[][]= new int[row][col];
		int arr3[][]= new int[row][col];
		System.out.println("Enter array1 elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		System.out.println("Enter array2 elements:");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=ip.nextInt();
			}
		}
			for(int i=0;i<arr3.length;i++) {
				for(int j=0;j<arr3[i].length;j++) {
					arr3[i][j]=arr[i][j]+arr2[i][j];
				}
				System.out.println();
			}
			System.out.println("The addition of this two matrix is:");
			for(int i=0;i<arr3.length;i++) {
				for(int j=0;j<arr3[i].length;j++) {
					System.out.print(arr3[i][j]+" ");
				}
				System.out.println();
			}
	}
}
