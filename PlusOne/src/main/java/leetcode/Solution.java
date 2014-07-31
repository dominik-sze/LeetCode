package leetcode;

import java.util.*;


public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==0) {
            return new int[]{1};
        }
        int N  = digits.length-1;
        int i  = N-1;
        int ov = 0;
        digits[N] = (digits[N] + 1)%10;
        if(digits[N]==0) {
            ov = 1;
        } else {
            return digits;
        }
        while(i>=0) {
            digits[i] = (digits[i]+ov)%10;
            if(digits[i]!=0) {
                return digits;
            }
            i--;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        for(int j=0; j<digits.length; j++) {
            newDigits[j+1] = digits[j];
        }
        return newDigits;
    }
}
