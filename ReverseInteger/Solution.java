public class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        StringBuilder tmp = new StringBuilder();
        while(n>0) {
            tmp.append(Integer.toString(n%10));
            n/=10;
        }
        if(x<0) {
            tmp.insert(0, '-');
        } else if (x==0) {
            tmp.append(0);
        }
        return Integer.valueOf(tmp.toString());
    }
}
