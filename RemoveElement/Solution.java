public class Solution {
    public int removeElement(int[] A, int elem) {
        int len = A.length;
        int i = 0;
        while(i<len) {
            if(A[i]==elem) {
                A[i] = A[len-1];
                len--;
            } else {
                i++;
            }
        }
        return len;
    }
}
