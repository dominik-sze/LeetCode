public class Solution {
    public int singleNumber(int[] A) {
        int n = 0;
        for(int i: A) {
            n^=i;
        }
        return n;
    }
}
