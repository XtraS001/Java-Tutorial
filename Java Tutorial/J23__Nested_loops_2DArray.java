
public class J23__Nested_loops_2DArray {
	public static void main (String [] args) {
		
		int [][] numberGrid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{0}
		};
		
		System.out.println(numberGrid[1][2]) ; //
		
		for (int i = 0 ; i<numberGrid.length ; i++) {
			for (int j = 0 ; j<numberGrid[i].length ; j++) {
				System.out.println (numberGrid[i][j]) ;
			}
		}
	
	}
}
