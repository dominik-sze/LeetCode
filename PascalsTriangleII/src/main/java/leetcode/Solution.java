package leetcode;

import java.util.*;


public class Solution {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> prev = new ArrayList<Integer>();
		List<Integer> curr = new ArrayList<Integer>();
		if(rowIndex==0) {
			curr.add(1);
		}
		else if(rowIndex>=1) {
			curr.add(1);
			curr.add(1);
			for(int i=2; i<=rowIndex+1; i++) {
				prev = new ArrayList<Integer>(curr);
				curr = new ArrayList<Integer>();
				curr.add(1);
				for(int j=1; j<i-1; j++) {
					curr.add(prev.get(j-1)+prev.get(j));		
				}
				curr.add(1);
			}
		}
		return curr;
	}
}
