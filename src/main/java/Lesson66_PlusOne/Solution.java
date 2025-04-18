package Lesson66_PlusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if(i==0){
                    int[] newDigits = new int[digits.length+1];
                    newDigits[0] = 1;
                    System.arraycopy(digits, 0, newDigits, 1, digits.length);
                    digits = newDigits;
                }
            }else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}
