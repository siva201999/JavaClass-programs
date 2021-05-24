//Transpose of the given matrix

import java.util.Scanner;
public class Transpose {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Row:-");
	        int row = sc.nextInt();
	        System.out.println("Column:-");
	        int col = sc.nextInt();
	        int[][] arr = new int[row][col];
	           System.out.println();
	           if(row>=3 && row<=10 && col>=3 && col<=10 ) {
	        	   System.out.println("Enter array elements:-");
	        	   for(int i = 0; i<row; i++){
	        		   for(int j = 0; j<col; j++){
	        			   arr[i][j] = sc.nextInt();
	        		   }
	        	   }
	        	   	System.out.println();
	        	   	System.out.println("The given matrix:-");
	        	   		for(int i = 0; i<row; i++){
	        	   			for(int j = 0; j<col; j++){
	        	   				System.out.print(arr[i][j]+" ");
	        	   			}
	        	   			System.out.println();
	        	   		}
	        	   		System.out.println(); 
	        	   		System.out.println("The transposed matrix:-");
	        	   			for(int j = 0; j<col; j++){
	        	   				for(int i = 0; i<row; i++){
	        	   					System.out.print(arr[i][j]+" ");
	        	   				}	
	        	   				System.out.println();    
	        	   			}
	           	}
	}	           
}
