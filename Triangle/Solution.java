public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int N = triangle.size()-1;
        List<Integer> tmp = new ArrayList<Integer>(triangle.get(N));
        for(int i=N-1; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                tmp.set(j, Math.min(tmp.get(j), tmp.get(j+1))+triangle.get(i).get(j));
            }
        }
        return tmp.get(0);
    }
}
