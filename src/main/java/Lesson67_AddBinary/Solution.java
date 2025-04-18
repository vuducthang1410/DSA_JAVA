package Lesson67_AddBinary;

import java.math.BigInteger;

public class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (aLen >= 0 || bLen >= 0 || carry == 1) {
            if(aLen>0){
                carry += a.charAt(aLen--)-'0';
            }
            if(bLen>0){
                carry += b.charAt(bLen--)-'0';
            }
            sb.append(carry%2);
            carry/=2;
        }
        return sb.reverse().toString();
    }
}
