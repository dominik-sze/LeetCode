public class Solution {
    public int numTrees(int n) {
        long count = 1;
        for(int i=1; i<=n; i++) {
            count = count*2*(2*i-1)/(i+1);
        }
        return (int)count;
    }
}
