package leetcode;

public class Solution {
    	public static void main( String[] args ) {
        	System.out.println( "Hello World!" );
    	}

    	public int uniquePaths(int m, int n) {
		if(m==0 || n==0) {
			return 0;
		}
		if(m==1 || n==1) {
			return 1;
		}
		int[][] tmp = new int[m][n];
		for(int i=0; i<m; i++) {
			tmp[i][n-1] = 1;
		}
		for(int i=0; i<n; i++) {
			tmp[m-1][i] = 1;
		}
		for(int i=m-2; i>=0; i--) {
			for(int j=n-2; j>=0; j--) {
				tmp[i][j] = tmp[i+1][j]+tmp[i][j+1];
			}
		}
		return tmp[0][0];
    	}
}
