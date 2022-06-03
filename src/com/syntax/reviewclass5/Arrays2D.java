package com.syntax.reviewclass5;

import java.util.Arrays;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row0[]= {1,2,3,4,5};
		int row1[]= {1,2,3};
		int row2[]= {1,2,3,4,5};
		int row3[]= {1,2,3,4,5};
		int row4[]= {1,2,3,4,5};
		
		int[][] matrix=new int[5][];
		matrix[0]=row0; //row zero contains a complete one D array
		matrix[1]=row1;
		matrix[2]=row2;
		matrix[3]=row3;
		matrix[4]=row4;
		
		//System.out.println(Arrays.toString(matrix));
	//	System.out.println(matrix[0][0]);
		for(int[] array:matrix) {
			System.out.println(Arrays.toString(array));
		}
		

	}

}
