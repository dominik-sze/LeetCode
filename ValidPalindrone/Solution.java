public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) {
            return true;
        }
        String[] st= s.split("[\\W]");
		ArrayList<String> tmp = new ArrayList<>();
		for(String n: st) {
			if(n.trim().length()>0) {
				tmp.add(n);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(String a: tmp) {
			sb.append(a.toLowerCase());
		}
		int left = 0;
		int right = sb.length()-1;
		while(left<=right) {
		    if(sb.charAt(left)!=sb.charAt(right)) {
		        return false;
		    }
		    left++;
		    right--;
		}
		return true;
    }
}
