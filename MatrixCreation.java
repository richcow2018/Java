public class MatrixCreation {
	public static void main(String[] args) {
	
		int array[][] = new int[4][4];
		int outer[] = new int[16];
		int counter = 0;
		
		for (int i=0; i<4; i++){
			for (int j =0; j<4; j++){
				
				array[i][j] += counter;
				
				System.out.println(array[i][j]);
				System.out.println();
				counter += 1;
			}
		}
	
		// let's loop through array to populate board
		for (int row = 0; row<array.length; row++) {
			for (int col = 0; col<array[row].length; col++) {
				array[row][col] = row * col; 
			}
		}
	
		// let's loop through array to print each row and column
		for (int row = 0; row<array.length; row++) {
			for (int col = 0; col<array[row].length; col++) {
				array[row][col] = row * col;
				System.out.print(array[row][col]);
			} 
			System.out.println();
		}
	}
}