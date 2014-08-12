package leetcode;

public class Solution {
    	public static void main(String[] args) {
        	System.out.println("Hello World!");
    	} 

    	public int minPathSum(int[][] grid) {
		int G = grid.length;
		if(G==0) {
			return 0;	
		}
		int G0 = grid[0].length;
		int[][] tmp = new int[G][G0];
		tmp[0][0] = grid[0][0];	
		for(int i=1; i<G0; i++) {
			tmp[0][i] = tmp[0][i-1] + grid[0][i];
		}	

		for(int i=1; i<G; i++) {
			tmp[i][0] = tmp[i-1][0] + grid[i][0];
		}

		int min = 0;
		for(int i=1; i<G; i++) {
			for(int j=1; j<G0; j++) {
				min = Math.min(tmp[i-1][j], tmp[i][j-1]);
				tmp[i][j] = min + grid[i][j];
			}
		}

		return tmp[G-1][G0-1];
    	}
}
